// 2.17
// application that inputs three integers form the user and 
// displayes the sum, average, product, smallest and largest 
// of the numbers.
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a, b, c, sum, ave, prod, min, max;

		System.out.print("Enter first integer: ");
		a = input.nextInt();
		System.out.print("Enter seccond integer: ");
		b = input.nextInt();
		System.out.print("Enter third integer: ");
		c = input.nextInt();

		sum = a + b + c;
		ave = sum / 3;
		prod = a * b * c;
		min = Math.min(Math.min(a,b),c);
		max = Math.max(Math.max(a,b),c);
		
		System.out.printf("Your three integers: %d %d %d%n", a, b, c);	
		System.out.printf("Sum: %d+%d+%d= %d%n",a,b,c,sum);
		System.out.printf("Average: %d%n", ave);
		System.out.printf("Product: %d*%d*%d= %d%n",a,b,c,prod);
		System.out.printf("Max: %d%n", max);
		System.out.printf("Min: %d%n", min);
	}
}
