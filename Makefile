BIN = bin
LESSON ?= lesson1

compile:
	javac -d $(BIN) src/**/*.java

run:
	java -cp $(BIN) src/$(LESSON)/Main

clean:
	rm -rf $(BIN)/*
	rm -rf src/**/*.class