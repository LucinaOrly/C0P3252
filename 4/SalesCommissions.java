// 7.10
// (Sales Commissions) Use a one-dimentional array to solve the following
// problem: A company pays its salespeople on a commision basis. The
// salespeople recieve $200 per week plus 9% of their gross sales for that
// week. For example, a salesperson who grosses $5,000 in sales in a week
// receives $200 plus 9% of $5,000, or a total of $650. 
// Write an application (using an array of counters) that determines how many of the salespeople earned 
// Revised: assume there are 10 salespeople with sales (in dollars) 5000,
// 7000, 5500, 10500, 2000, 4000, 4500, 8000, 11000, and 6000. Encode this
// data into your main method as an int array called something like
// salesArray

public class SalesCommissions {

	static final int BASE_SALARY = 200;

	public static void main(String[] args) {
		final int[] salesArray = {
			5000,
			7000,
			5500,
			10500,
			2000,
			4000,
			4500,
			8000,
			11000,
			6000
		};
		
		System.out.printf("%10s%10s%n=======================%n",
			"sales",
			"commission");
 		for (int sale : salesArray) 
			System.out.printf("%10d%10d%n",
			sale,
			calcCommission(sale));			

	}
	
	public static int calcCommission(int s) {
		int salesCommission = (int)Math.round(s * .09);
		return BASE_SALARY + salesCommission;
	}
}
