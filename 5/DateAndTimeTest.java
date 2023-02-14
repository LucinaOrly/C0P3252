// 8.12
// (Date and Time Class) Create class DateAndtime that combines the modified
// Time2 class of Excercise 8.7 and the modified Date class of Exercise 8.8.
// Modify method increment hour to call method nextDay if the time is
// incremented into the next day. Modify methods toString and toUniversalString
// to output the date in addition to the time. Write a program to test the new
// class DateAndTime. Specifically, test incementing the time to the next day

public class DateAndTimeTest {
	static final int NUM_LOOP = 7;
	public static void main (String[] args) {
		DateAndTime dt1 = new DateAndTime(); // test default constructor
		DateAndTime dt2 = new DateAndTime(	// test increment to nextDay via incrementHour
			new Date(2,13,2023),
			new Time2(20,0,0)
		);
		printDT("dt1: test default constructor and universal string\n" + dt1.toUniversalString(), 
			dt1 );
		printDT("dt2: test incrementHour() to nextDay()\n", dt2);
		printLoop(dt2);
		
	}
	public static void printDT(String str, DateAndTime dt) {
		System.out.printf("%s%n%s", str, dt);
	}
	public static void printLoop(DateAndTime dt) {
		for (int i = 0; i < NUM_LOOP; i++){
			dt.incrementHour();
			printDT("", dt);
		}
	}
}
