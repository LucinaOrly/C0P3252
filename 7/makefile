C="javac"
JAVA="java"

all: BonusTest.java Dependencies
	$(C) BonusTest.java

Dependencies: Employee.java Date.java HourlyEmployee.java CommissionEmployee.java SalariedEmployee.java BasePlusCommissionEmployee.java

test: all
	$(JAVA) BonusTest
	make clean
clean:
	rm *.class
