// Fig. 8.7: Date.java
public class Date {
	private int month;
	private int day; 
	private int year;

	private static final int[] daysPerMonth = {
	0,31,28,31,30,31,30,31,31,30,31,30,31
	};
	
	// constructors
	public Date() {
		this(1,1,0);
	}
	public Date(int month, int day, int year) {
		setMonth(month);
		setYear(year);
		setDay(day);
	}

	// increment
//	public void nextDay() { 
//		nextDay(1);
//	}
	public void nextDay() {
		if (day + 1 > daysPerMonth[month]) {
			switch (month) {
			case 12:
				day = 1;	
				month = 1;
				year++;
			break;
			case 2:
				if (day == 28 && isLeapYear(year)) {
					day++;
					break;
				}
			default:
				day = 1;
				month++;
			}			
		}
		else day++;
			
	}

	// setters
	public void setMonth(int month) {
		if (month <= 0 || month > 12)
			throw new IllegalArgumentException("month("+month+") must be 1-12");
		
		this.month = month;	
	}
	public void setDay(int day) {
		switch(month) {
		case 2:
			if (day == 29 && !isLeapYear(year))
				throw new IllegalArgumentException("day("
					+day
					+") out-of-range for the specified month (not a leap year!)");
		default:
			if (day > daysPerMonth[month])
				throw new IllegalArgumentException("day("
					+day
					+") out-of-range for the specified month(1-"
					+ daysPerMonth[month] + ")");
		}

		this.day = day;	
	}
	// idk what the year should error check to, so lets assume it has to be greater-than 0
	public void setYear(int year) {
		if (year < 0)
			throw new IllegalArgumentException("year("
				+ year
				+ ") must be greater-than 0");
		this.year = year;
	}

	// getters
	public int getMonth() 	{return month;}
	public int getDay() 	{return day;}
	public int getYear() 	{return year;} 

	// toString method in the form month/day/year
	public String toString() {
		return String.format("%d/%d/%d", month, day, year);
	}

	// helper functions
	public static boolean isLeapYear(int year) {
		return (year % 100 != 0 && year % 4 == 0) ||
			year % 400 == 0;
	}
}
