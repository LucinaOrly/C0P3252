// DateAndTime class
public class DateAndTime {

	private Date date;
	private Time2 time;
	
	// constructors	
	public DateAndTime() {
		this(new Date(), new Time2());
	}
	public DateAndTime(Date date, Time2 time) {
		this.date = date;
		this.time = time;
	}

	public void tick() {
		if (time.tick())
			date.nextDay();
	}
	public void incrementHour() {
		if (time.incrementHour())
			date.nextDay();
	}
	// getters	
	public Date getDate() { return date; }
	public Time2 getTime() { return time; }
	public String toString() {
		return String.format("%s~%s%n", time, date);
	}
	public String toUniversalString() {
		return String.format("%s~%s%n", time.toUniversalString(), date);
	}

}
