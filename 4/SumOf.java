// 7.16
// (Using the Enhanced for statement) Write an application that uses an
// enhanced for statement tosum the double values passed by the command-line
// arguments 

public class SumOf {
	
	public static void main(String[] args) {
		double sum = 0.0, tmp;
		String result = "";
		for(String str : args) {
			try {
			    tmp = Double.parseDouble(str);
				sum += tmp;	
				result += str + " + ";
			}
			catch(NumberFormatException e) {
				System.out.printf("Invalid input, has to be a double value (%s)%n",
					e);		
				return;
			}
		}

		System.out.printf("%s = %f%n", result.substring(0,result.length()-1), sum);
	}
}
