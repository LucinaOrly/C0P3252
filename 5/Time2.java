// Fig. 8.5: Time2java

public class Time2 {
	static final int MAX_SECOND = 86399;
	private int second; // seconds since  midnight
	
	// Time2 no-arg constructor
	public Time2(){
		this(0,0,0);
	}

	// Time2 consntructor
	public Time2(int hour) {
		this(hour,0,0);
	}
	public Time2(int hour, int minute) {
		this(hour,minute,0);
	}
	public Time2(int hour, int minute, int second) {
		setTime(hour, minute, second);
	}

	// Time2 constructor, copy constructor
	public Time2(Time2 time) {
		setSecondSinceMidnight(time.second);
	}

	// setters
	public void setTime(Time2 time) {
		this.second = time.second;
	}
	public void setTime(int hour, int minute, int second) {
		setSecond(second);
		setMinute(minute);
		setHour(hour);
	}
	public void setHour(int hour) {
		if(hour < 0 || hour >= 24)
			throw new IllegalArgumentException("hour must be between 0-23");
		this.second = second % 3600 + htos(hour);
	}
	public void setMinute(int minute) {
		if(minute < 0 || minute >= 60)
			throw new IllegalArgumentException("minute must be between 0-59");
		this.second += mtos(minute) - mtos(getMinute());
	}
	public void setSecond(int second) {
		if(second < 0 || second >= 60)
			throw new IllegalArgumentException("second must be between 0-59");
		this.second += second - (this.second % 60);
	}
	public void setSecondSinceMidnight(int second) {
		while (second < 0)
			second =+ MAX_SECOND;
		this.second = second % (MAX_SECOND + 1);

	}

	// getters
	public int getHour() {
		return second / 3600;
	}
	public int getMinute() { 
		return second % 3600 / 60;
	}
	public int getSecond() {
		return second % 60;
	}
	public int getSecondSinceMidnight() {
		return second;
	}

	// convert to String in universal-time format
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d",
			getHour(),
			getMinute(),
			getSecond()
		);
	}

	// convert to String in standard-time format
	public String toString() {
		// edit this later
		int hour = getHour();
		String m = hour < 12 ? "AM" : "PM" ;
		if(hour == 0) hour = 12;
		else if(hour > 12) hour -= 12;

		hour -= hour > 12 ? 12 : 0; // convert 24hr to 12hr
		return String.format("%d:%02d:%02d %2s",
			hour, getMinute(), getSecond(), m
			);
	}

	// 8.7: increment, true if next day
	public boolean tick() {
		return tick(1);
	}
	public boolean tick(int inc) {
		boolean nextDay = false;
		if(second + inc > MAX_SECOND) {
			inc -= MAX_SECOND + 1;
			nextDay = true;
		}
		second += inc;
		return nextDay;
	}
	public boolean incrementMinute() {
		return tick(60);
	}
	public boolean incrementHour() {
		return tick(3600);
	}

	// private helper functions
	private static int mtos(int m) {
		return m * 60;
	}
	private static int htos(int h) {
		return h * 3600;
	}
}
