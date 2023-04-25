// 16.14
// LinkedListTest.java
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.security.SecureRandom;

public class LinkedListTest {
	static final Random rand = new SecureRandom();
	static final int MIN_INT = 0;
	static final int MAX_INT = 100;
	static final int SIZE_LIST = 25;

	public static void main(String[] args) {
		LinkedList<Integer> list = generateLinkedList();
		list.sort(null);

		int sum = 0;
		float ave = 0;
		System.out.print("Linked List Elements:\n");
		for(int num : list) {
			System.out.printf("%d,", num);
			sum += num;
		}

		System.out.println();
		ave = (float)sum / SIZE_LIST;

		System.out.printf("Sum: %d%n", sum);
		System.out.printf("Average: %f%n", ave);
	}

	private static LinkedList<Integer> generateLinkedList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i=0;i < SIZE_LIST;i++)
			list.add(getRandInt());
		return list;
	}
	private static int getRandInt() {
		return rand.nextInt(MIN_INT, MAX_INT+1);
	}
}
