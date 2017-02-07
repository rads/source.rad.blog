(set-env!
  :resource-paths #{"resources"}
  :dependencies '[[org.clojure/clojure "1.9.0-alpha14"]
                  [me.raynes/fs "1.4.6"]])

(require '[clojure.string :as string]
         '[clojure.java.shell :as shell]
         '[clojure.java.io :as io]
         '[me.raynes.fs :as fs])

(defn run-pandoc-cli [in-file]
  (shell/sh "pandoc"
            "--css=styling.css"
            "--smart"
            "--standalone"
            "--template=resources/pandoc/template.html"
            "--title-prefix=rad.blog"
            "--to=html5"
            :in in-file))

(defn compile-md! [in-file out-file]
  (let [{:keys [out]} (run-pandoc-cli in-file)]
    (doto out-file
      (io/make-parents)
      (spit out))))

(deftask pandoc
  "Convert all .md files to .html in content/ dir"
  []
  (let [tmp (tmp-dir!)]
    (with-pre-wrap fileset
      (empty-dir! tmp)
      (let [in-files (content-files fileset)
            md-files (by-ext [".md"] in-files)]
        (doseq [in md-files]
          (let [in-file (tmp-file in)
                in-path (tmp-path in)
                out-path (string/replace in-path #"\.md$" ".html")
                out-file (io/file tmp out-path)]
            (compile-md! in-file out-file)))
        (-> fileset
            (add-resource tmp)
            (commit!))))))

(deftask build
  "Build the site to target directory"
  [d dir VAL #{str} "The set of directories to write to (target)."]
  (comp
    (pandoc)
    (sift :move {#"^content/(.+)" "$1"
                 #"^static/(.+)" "$1"}
          :include #{#"^([^/]+|js/[^/]+)$"})
    (sift :invert true
          :include #{#"(.+)\.md$"})
    (target :dir dir
            :no-clean true)))
