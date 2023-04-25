C="javac"
RUN="java"
p1=Names
p2=WordTypeCount
p3=DuplicateWords
p4=LinkedListTest
f1=16.11.txt

SRC= $(p1) $(p2) $(p3) $(p4)

all: $(SRC)

$(p1): $(p1).java
		$(C) $(p1).java
$(p2): $(p2).java
		$(C) $(p2).java
$(p3): $(p3).java
		$(C) $(p3).java
$(p4): $(p4).java
		$(C) $(p4).java

test: test1 test2 test3 test4
test1: $(p1)
		$(RUN) $(p1)
test2: $(p2)
		$(RUN) $(p2) < $(f1)
test3: $(p3)
		$(RUN) $(p3) < $(f1)
test4: $(p4)
		$(RUN) $(p4)

clean:
		rm *.class
