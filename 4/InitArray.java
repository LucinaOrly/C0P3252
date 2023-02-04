// 7.15
// (Command-Line Arguments) Rewrite Fig 7.2 so that the size of the array is
// specified by the first command-line argument. If no command-line argument is
// supplied, use 10 as the default size of the array.

public class InitArray {

    static final int DEFAULT_SIZE = 10;
    public static void main(String[] args) {
	int arraySize = DEFAULT_SIZE;
	// handle commandline arg
	if (args.length > 0) {
	    try {
		arraySize = Integer.parseInt(args[0]);
	    }
	    catch (NumberFormatException e) {
		System.out.printf("Argument has to be an integer (%s)%n", e);
		return;
	    }
	}
	
	// program from fig 7.2 in the book
	int[] array = new int[args.length > 0 ? Integer.parseInt(args[0]) : DEFAULT_SIZE];
	System.out.printf("%s%8s%n", "Index", "Value");
	
	for (int counter = 0; counter < array.length; counter++) {
	    System.out.printf("%8d%8d%n", counter, array[counter]);
	}
    }
}
