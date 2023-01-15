import java.util.Scanner

public class 2.17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a, b, c, sum, ave, prod;

		System.out.print("Enter first integer: ");
		a = input.nextInt();
		System.out.print("Enter seccond integer: ");
		b = input.nextInt();
		System.out.print("Enter third integer: ");
		c = input.nextInt();

		sum = a + b + c;
		ave = sum / 3;
		prod = a * b * c;
		
		System.out.printf("Your three integers: %d %d %d%n", a, b, c);	
	}
}
