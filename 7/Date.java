// Fig. 8.7: Date.java
// copied from my repo
public class Date {
	private int month;
	private int day; 
	private int year;

	private static final int[] daysPerMonth = {
	0,31,28,31,30,31,30,31,31,30,31,30,31
	};
	private static final String[] MONTH_NAMES = {
	"","january","febuary","march","april","may","june","july","august","september","october","november","december"
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
	public Date(String month, int day, int year) {
		for(int i = 1; i <= 13; i++) {
			if (month.toLowerCase() == MONTH_NAMES[i]) {
				this.month = i;
				break;
			}
			if (i >= 13)
				throw new IllegalArgumentException("month("
				+ month
				+ ") is not a valid month");
		}
		setYear(year);
		setDay(day);
	}
	public Date(int daysAfterNewYears, int year) {
		setYear(year);
		int maxDays = (!isLeapYear(year) ? 364 : 365);
		if(daysAfterNewYears < 0 || daysAfterNewYears > maxDays)
			throw new IllegalArgumentException("first argument("
				+ daysAfterNewYears
				+ ") must be between 0-" + maxDays);
		for(int i = 1; i <= 12 && daysAfterNewYears < 28; i++) switch(i){
			case 2:
				if (isLeapYear(year) ) daysAfterNewYears -= 1;
			default:
				daysAfterNewYears -= daysPerMonth[i];
			}
		day = daysAfterNewYears;
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
	// edit: this error checks the argument so that it is > 0 and < Integer.MAX_VALUE + 1 (because it will be negative)
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
	// 8.15 functions
	public String toVerboseString() {
		String str = toString();	
		str += String.format("%n%s %d, %d", MONTH_NAMES[month], day, year);
		str += String.format("%n%d %d", getDaysAfterNewYears(), year);
		return str;	
	}
	public int getDaysAfterNewYears() {
		int day = 0;
		for (int i = 1; i < month; i++) switch(i) {
			case 2:
				if (isLeapYear(year)) day++;
			default:
				day += daysPerMonth[i];
		}
		return day + this.day;
	}
}
