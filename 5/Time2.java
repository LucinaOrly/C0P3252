// Fig. 8.5: Time2java

public class Time2 {
	static final int MAX_SECOND = 86399;
	private int second; // seconds since  midnight
	
	// Time2 no-arg constructor
	public Time2(){
		this(0,0,0);
	}

<<<<<<< HEAD
	// Time2 consntructor
	public Time2(int hour) {
		this(hour,0,0);
	}
	public Time2(int hour, int minute) {
		this(hour,minute,0);
	}
	public Time2(int hour, int minute, int second) {
		setTime(hour, minute, second);
=======
	// Time2 consntructor, second supplied
	public Time2(int second) {
		setSecondSinceMidnight(second);
>>>>>>> 897ea0921cbb3e46ea3a7496eb3086d6b8a4ddf5
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
			throw IllegalArgumentException("hour must be between 0-23");
		this.second %= 3600 + htos(hour);
	}
	public void setMinute(int minute) {
		if(minute < 0 || minute >= 24)
			throw IllegalArgumentException("minute must be between 0-59");
		this.second += mtos(minute) - mtos(getMinute());
	}
	public void setSecond(int second) {
		if(second < 0 || second >= 60)
			throw IllegalArgumentException("second must be between 0-59");
		this.second += second - (second % 60);
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
		return second / 60;
	}
	public int getSecond() {
		return second % 60;
	}
	public int getSecondSinceMidnight() {
		return second;
	}

	// convert to String in universal-time format
	public String toUniversalString() {
		return String.format("%02d:%02d:$02d",
			getHour(),
			getMinute(),
			getSecond()
		);
	}

	// convert to String in standar-time format
	public String toString() {
		// edit this later
		return String();
	}

	// private helper functions
	private static mtos(int m) {
		return m * 60;
	}
	private static htos(int h) {
		return h * 3600;
	}
}
