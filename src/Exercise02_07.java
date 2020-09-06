/* Paste your Exercise02_07 here and click Automatic Check.
For all programming projects, the numbers should be double 
unless it is explicitly stated as integer.
If you get a java.util.InputMismatchException error, check if 
your code used input.nextInt(), but it should be input.nextDouble().
For integers, use int unless it is explicitly stated as long. */

//Author: Tae Soo Kim

//Check: Pass


import java.util.Scanner;

public class Exercise02_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		int minutes = scanner.nextInt();
		//365 days -> 1 yr
		//24 hours -> 1 day
		//1 day -> 1440 minutes
		// First retrieve the number of days (There are 1440 minutes in a day therefore the conversion rate of X Minutes * 1Day / (1440Minutes) produces the number of days).
		int days = minutes / 1440;
		// Now find the number of years within the day total.
		int years = days / 365;
		// Now since the year conversion used 365, a flat integer, we can simply find the remaining number of days through:
		// The remaining number of days is the total number of days mod (rem) the number of years * 365 (back to its original rate)
		days = days % (years * 365);
		System.out.printf("%d minutes is approximately %d years and %d days.", minutes, years, days);	
	}
}

//Output: 
// command>java Exercise02_07
// Enter the number of minutes: 1000000000
// 1000000000 minutes is approximately 1902 years and 214 days.

// command>java Exercise02_07
// Enter the number of minutes: 10000000
// 10000000 minutes is approximately 19 years and 9 days.

// command>java Exercise02_07
// Enter the number of minutes: 1000000
// 1000000 minutes is approximately 1 years and 329 days.