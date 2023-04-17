C="javac"
RUN="java"

all: OutputData FileMatch

OutputData: OutputData.java dependencies
	$(C) OutputData.java
FileMatch: FileMatch.java dependencies
	$(C) FileMatch.java

dependencies: Account.java TransactionRecord.java

clean:
	rm *.class *.txt
