import java.util.*;

//Author: Tae Soo Kim
//Check: Pass


public class Exercise07_01 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number of students: ");
	int n = sc.nextInt();
	double nums[] = new double[n];
	
	double maxScore = 0d;
	for (int i = 0; i < n; i++) {
		nums[i] = sc.nextDouble();
		maxScore = Math.max(nums[i], maxScore);
	}
	char outputs[] = {'A', 'B','C','D','F'};
	for (int i = 0; i < n; i++) {
		//0: 0
		//10: 0
		//11: 1
		//90 - 80 - 1 / 10 = 9 / 10 = 0
		//90 - 79 - 1 / 10 = 10/10 = 1
		int bracket = (int) (maxScore - nums[i] - 1) / 10;
		bracket = Math.max(0, Math.min(bracket, 4));
		System.out.println("Student " + i + " score is " + nums[i] + " and grade is " + outputs[bracket]);
	}
}
}

//Sample Output:
//command>java Exercise07_01
//Enter number of students: 4
//40.0
//55.0
//70.0
//58.0
//Student 0 score is 40.0 and grade is C
//Student 1 score is 55.0 and grade is B
//Student 2 score is 70.0 and grade is A
//Student 3 score is 58.0 and grade is B

//Enter number of students: 4
//90.0
//90.0
//90.0
//90.0
//Student 0 score is 90.0 and grade is A
//Student 1 score is 90.0 and grade is A
//Student 2 score is 90.0 and grade is A
//Student 3 score is 90.0 and grade is A

// command>java Exercise07_01
// Enter number of students: 4
// 90.0
// 80.0
// 70.0
// 60.0
// Student 0 score is 90.0 and grade is A
// Student 1 score is 80.0 and grade is A
// Student 2 score is 70.0 and grade is B
// Student 3 score is 60.0 and grade is C

// command>java Exercise07_01
// Enter number of students: 4
// 90.0
// 80.0
// 60.0
// 0.0
// Student 0 score is 90.0 and grade is A
// Student 1 score is 80.0 and grade is A
// Student 2 score is 60.0 and grade is C
// Student 3 score is 0.0 and grade is F

