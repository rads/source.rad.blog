CONTENT = $(wildcard content/**.md)
BUILD = $(patsubst content/%.md, build/%.html, $(CONTENT))

JPG = $(wildcard content/**.jpg)
BUILD_JPG = $(patsubst content/%.jpg, build/%.jpg, $(JPG))

all: $(BUILD) $(BUILD_JPG)

build/%.html: content/%.md
	pandoc -s $< > $@

build/%.jpg: content/%.jpg
	cp $< $@

clean:
	rm -rf build/**.html

.PHONY: clean
