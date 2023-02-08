// Fig. 8.5: Time2java

public class Time2 {
	private int second; // seconds after midnight
	
	// Time2 no-arg constructor
	public Time2(){
		this(0);
	}

	// Time2 consntructor, second supplied
	public Time2(int second) {
		setSecond(second);
	}

	// Time2 constructor, copy constructor
	public Time2(Time2 time) {
		setTime(time.second);
	}

	// setters
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
		while (second
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
