// 10.15
// (Payroll System Modification) Modify the payroll system of Figs. 10.4-10.9
// to include an additional Employee subclass PieceWorker that represents an
// employee whos pay is based on the number of pieces of merchandice produced.
// Class PieceWorker should contain private instance varaibles wage (to store
// the employee's wage per piece) and pieces (to store th number of pieces
// produced). Provide a concrete implementation of method earnings in class
// PieceWorker that calculates the employee's earnings by multiplying the
// number of pieces produced by the wage per piece. Create an array of Employee
// variables to store references to objects of each concrete class in the new
// Emloyee hierarchy. For each Employee, display itsString representation and
// earnings.

public class PieceWorker extends Employee {
	private double wage;
	private int pieces;
	
	public PieceWorker(String firstName, String lastName,
		String socialSecurityNumber, double wage, int pieces, 
		Date birthDate) {
		super(firstName, lastName, socialSecurityNumber, birthDate);

		if (wage < 0.0)
			throw new IllegalArgumentException("Wage must be >= 0.0");
		if (pieces < 0)
			throw new IllegalArgumentException("Pieces must be > 0");
		this.wage = wage;
		this.pieces = pieces;
	}
	// getters
	public double getWage() {return wage;}
	public int getPieces() {return pieces;}
	
	// calculate earnings; wage * pieces
	@Override
	public double earnings() {
		return getWage() * getPieces();
	}

	// toString method
	@Override
	public String toString() {
		return String.format("%s: %s%n%s: $%,.2f; %s: %d",
			"piece worker", super.toString(),
			"wage", getWage() ,"pieces", getPieces());
	}
}
