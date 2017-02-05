CONTENT = $(wildcard content/**.md)
BUILD = $(patsubst content/%.md, build/%.html, $(CONTENT))

JPEG = $(wildcard content/**.jpeg)
BUILD_JPEG = $(patsubst content/%.jpeg, build/%.jpeg, $(JPEG))

all: $(BUILD) $(BUILD_JPEG)

build/%.html: content/%.md
	pandoc -s $< > $@

build/%.jpeg: content/%.jpeg
	cp $< $@

clean:
	rm -rf build/**.html

.PHONY: clean
