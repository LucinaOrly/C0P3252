// 8.15
// (Date Class) Create class Date with the following capabilities: 1. Output
// the date in multiple formats such as MM/DD/YYYY; June 14, 1992; DDD YYYY; 2.
// Use overloaded constructors to create Date objects initialized with dates of
// the formats in part (a). In the first case the constructor should recieve
// three intger values. In the second case it should recieve a String and two
// integer values. In the third case it should recieve two integer values, the
// first of which represents the day number in the year.

public class DateTest2 {
	public static void main(String[] args) {
		Date d1 = new Date();		// test default constructor
		Date d2 = new Date(3,1,2023);	// test a date
		Date d3 = new Date(3,1,2020);	// test a date on leap year
		
		printDate("d1: default constructor", d1);
		printDate("d2: constructor with args", d2);
		printDate("d3: leap year accuracy", d3);
	}
	public static void printDate(String str, Date d) {
		System.out.printf("%n%s%n%s%n", str, d.toVerboseString());
	}
}
