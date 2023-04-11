C="javac"
RUN="java"

all: RandomSentences Reverse

RandomSentences: RandomSentences.java
		  $(C) RandomSentences.java
Reverse:
		  $(C) Reverse.java

test: test1 test2
test1: RandomSentences
		  $(RUN) RandomSentences
		  @echo test1 complete
test2: Reverse
		  $(RUN) Reverse < test2.txt
		  @echo test2 complete!
clean:
	rm *.class
