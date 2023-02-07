// 2-D array
// Create a two-dimensional array with six rows and four columns where the
// cells in the first five rows and three columns are filled with random
// integers between 0 and 9, the first 5 cells of the fourth column contain
// the sums of the integers in the cells of the corresponding rows, the first
// three cells of the sixth row contain the sums of the integers in the
// corresponding column, and the lower right cell, position (6,4), is set to
// 0.
import java.security.SecureRandom;

public class Array2D {
	static final int MIN_RANGE = 0;
	static final int MAX_RANGE = 9;
	static final int NUM_ROWS = 6;
	static final int NUM_COLS = 4;

	public static void main(String[] args) {
		int[][] arr = new int[NUM_ROWS][NUM_COLS];
		SecureRandom rand = new SecureRandom();
	
		// assign random integers to cells	
		for (int i = 0; i < NUM_COLS - 1; i++) {
			for(int j = 0; j < NUM_ROWS - 1; j++)
				arr[j][i] = rand.nextInt(MAX_RANGE - MIN_RANGE + 1) + MIN_RANGE;
		}
		
		// calculate sum of COLS
		for (int i = 0; i < NUM_ROWS - 1; i++) {
			int sum = 0;
			for (int j = 0; j < NUM_COLS - 2; j++)	
				sum += arr[i][j];	
			arr[i][NUM_COLS-1] = sum;
		}
		// calculate sum
		for (int i = 0; i < NUM_COLS - 1; i++) {
			int sum = 0;
			for (int j = 0; j < NUM_ROWS - 2; j++)	
				sum += arr[j][i];	
			arr[NUM_ROWS-1][i] = sum;
		}
	
		// print the graph	
		printMatrix(arr);	
		
	}
	
	public static void printMatrix(int[][] arr) {
		for(int[] row : arr) {
			for(int col : row) {
				System.out.print(col + "\t");
			}
			System.out.println();
		}
	}
}
