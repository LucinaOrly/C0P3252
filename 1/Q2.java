// 2.24
// an application that reads five integers and determines 
// and prints the largest and smallest integers in the group
import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] list = new int[5];
		int min = Integer.MAX_VALUE, 
			max = Integer.MIN_VALUE;

		System.out.print("Enter 5 integers: ");
		for(int i=0;i<5;i++) { 
			list[i] = input.nextInt();
			min = Math.min(min, list[i]);
			max = Math.max(max, list[i]);
		}

		System.out.printf("min: %d%n", min);
		System.out.printf("max: %d%n", max);

	}
}
