CONTENT = $(wildcard content/**.md)
BUILD = $(patsubst content/%.md, build/%.html, $(CONTENT))

all: $(BUILD)

build/%.html: content/%.md
	pandoc -s $< > $@

clean:
	rm -rf build/*

.PHONY: clean
