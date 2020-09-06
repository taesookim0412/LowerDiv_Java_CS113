/* Paste your Exercise02_03 here and click Automatic Check.
For all programming projects, the numbers should be double 
unless it is explicitly stated as integer.
If you get a java.util.InputMismatchException error, check if 
your code used input.nextInt(), but it should be input.nextDouble().
For integers, use int unless it is explicitly stated as long. */

//Name: Tae Soo Kim
// Output:
// command>java Exercise02_03
// Enter a value for feet: 
// 4.0
// 4.000000 feet is 1.220000 meters

// Check: Pass


import java.util.Scanner;

public class Exercise02_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value for feet: ");
		Double input = scanner.nextDouble();
		//One foot is 0.305meters
		double converted = input * 0.305;
		System.out.printf("%f feet is %f meters", input, converted);
	}
}