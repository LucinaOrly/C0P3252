// HourlyEmployee.java

public class HourlyEmployee extends Employee {
	static final int HOURS_PER_WEEK = 168;
	
	// member variables
	private double wage;
	private int hours;

	// constructors
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, int hours) { 
		super(firstName, lastName, socialSecurityNumber);
		setWage(wage);
		setHours(hours);
	}	

	// getters
	public double getWage() {return wage;}
	public int getHours() {return hours;}

	// setters
	public void setWage(double wage) {
		if (wage < 0 || wage > HOURS_PER_WEEK)
			throw new IllegalArgumentException( String.format(
				"wage(%s) must be >= 0 and <= %d",
				wage, HOURS_PER_WEEK
				)
			);
		this.wage = wage;
	}
	public void setHours(int hours) {
		if (hours < 0)
			throw new IllegalArgumentException(String.format(
				"hours(%s) must be greater than or equal to 0",
				hours)
			);
		this.hours = hours;
	}

	// return String representation of HourlyEmployee object
	@Override
	public String toString() {
		return String.format("%s%n%s: %.2f%n%s: %2d",                
	    		super.toString(),
	    		"wage", wage,                     
	    		"hours", hours);
	}    
	
}
