/* Paste your Exercise03_05 here and click Automatic Check.
For all programming projects, the numbers should be double 
unless it is explicitly stated as integer.
If you get a java.util.InputMismatchException error, check if 
your code used input.nextInt(), but it should be input.nextDouble().
For integers, use int unless it is explicitly stated as long. */

/*
Author: Tae Soo Kim

Result: Pass
*/

import java.util.Scanner;
public class Exercise03_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] dayOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		System.out.print("Enter today’s day ");
		int idxCurrentDay = scanner.nextInt();
		
		String currentDay = dayOfWeek[idxCurrentDay];
		
		System.out.print("Enter the number of days elapsed since today: ");
		int daysElapsed = scanner.nextInt();
		
		int calculatedDay = (idxCurrentDay + daysElapsed) % 7;
		String nextDay = dayOfWeek[calculatedDay];
		
		System.out.printf("Today is %s and the future day is %s", currentDay, nextDay);
	
	}	
}

/* Sample output:
command>javac Exercise03_05.java
Compiled successful

command>java Exercise03_05
Enter today’s day 1
Enter the number of days elapsed since today: 3
Today is Monday and the future day is Thursday

*/