C="javac"
java="java"

all: Time2Test TickTest DateTest DateAndTimeTest DateTest2

Time2Test: Time2Test.java
	$(C) Time2Test.java		

TickTest: TickTest.java
	$(C) TickTest.java

DateTest: DateTest.java
	$(C) DateTest.java

DateAndTimeTest: DateAndTimeTest.java
	$(C) DateAndTimeTest.java

DateTest2: DateTest2.java
	$(C) DateTest2.java

run:
	$(java) Time2Test
	$(java) TickTest
	$(java) DateTest
	$(java) DateAndTimeTest
	$(java) DateTest2

	
clean:
	rm *.class
