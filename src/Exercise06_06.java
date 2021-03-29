//Author: Tae Soo Kim
//Check: Pass

import java.util.*;

public class Exercise06_06 {
	public static void displayPattern(int n) {
		int curr = 1;
		while (curr < n + 1) {
			for (int i = 0; i < n - curr; i++) {
				if (n >= 10 && i == 0) {
					System.out.print(" ");
				}
				System.out.print("  ");
			}
			for (int i = curr; i > 0; i--) {
				System.out.print(i + " ");
			}
			curr += 1;
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		displayPattern(n);
		System.out.println();
	}
}

//Sample output:
// 5
//         1 
//       2 1 
//     3 2 1 
//   4 3 2 1 
// 5 4 3 2 1 

// 10
//                   1 
//                 2 1 
//               3 2 1 
//             4 3 2 1 
//           5 4 3 2 1 
//         6 5 4 3 2 1 
//       7 6 5 4 3 2 1 
//     8 7 6 5 4 3 2 1 
//   9 8 7 6 5 4 3 2 1 
//10 9 8 7 6 5 4 3 2 1 
