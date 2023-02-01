// 7.14
// (Variable-Length Argument List) Write an application that calculates the product of a series of integers that are passed to the method product using a variable-length argument list. Test your method with several calls, each with a different number of arguments.

public class VariableLength {
    public static void main(String[] args) {
	int[]  
	    a1 = {2, -5},
	    a2 = {12, 12, 12},
	    a3 = {1 , 24, 2},
	    a4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
	    a5 = {5,4,3,2,1,0};
	int [][] arrArr = {a1,a2,a3,a4,a5};	
	
	for (int[] arr : arrArr)	
	    System.out.printf("%20s%5s%10d%n",
		express(arr),
		"=",
		product(arr)
	    );
    }

// calculate and return the product of all elements of arr
    public static int product(int[] arr)
    {
	// return 0 if array.length < 1
	if (arr.length < 1) return 0;

	int prod = 1; 
	for(int i : arr)
	    prod *= i; 
	return prod;
    }

// convert int[] to String in expression format
    public static String express(int[] arr)
    {
	String expr = "";
	for (int i : arr)
	    expr += (i + "*");
	return expr.substring(0, expr.length() - 1);
    }
}
