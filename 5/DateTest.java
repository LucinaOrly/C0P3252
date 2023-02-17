// 8.8
// (Enhancing Class Date) Modify class Date of Fig. 8.7 to perform error
// checking on the initializer values for variables month, day and year
// (currently it validates only the month and day). Provide a method nextDay to
// increment the day by one. Write a program that tests method nextDay in a
// loop that prints the date during each iteration illustratethat the method
// works correctly. Test the following cases:
// 1. incrementing into the next month and
// 2. incrementing into the next year.

public class DateTest {
	static final int NUM_INCREMENT = 7;
	public static void main(String[] args) {
		Date d1 = new Date(),
			d2 = new Date(1,31,2023), 	// test next month
			d3 = new Date(2,24,2000), 	// test next Febuary leap year
			d4 = new Date(12,28,1898),	// test next year
			d5 = new Date(2,24,2001);	// test next Febuary
		
		printDate("\nd1: default date", d1);
		printDate("\nd2: test to next month", d2);
		loopPrint(d2);
		printDate("\nd3: test Febuary's leap year", d3);
		loopPrint(d3);
		printDate("\nd4: test to next year", d4);
		loopPrint(d4);
		printDate("\nd5: test Febuary to March",d5);
		loopPrint(d5);
		
		// test year validation > 0
		try {
			new Date(1,1,Integer.MAX_VALUE + 1);
		}
		catch (IllegalArgumentException e) {
			System.out.printf("Attempted to create a date with negative year%n It worked! (%s)%n", e);
		}
	}
	public static void printDate(String str, Date d) {
		System.out.printf("%s%n%s",str ,d );
	}
	public static void loopPrint(Date d) {
		for(int i = 0; i < NUM_INCREMENT; i++) {
			d.nextDay();
			printDate("", d);
		}
	}	

}
