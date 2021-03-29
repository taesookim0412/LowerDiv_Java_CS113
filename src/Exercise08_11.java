import java.util.*;

//Author: Tae Soo Kim
//Check: Pass

public class Exercise08_11 {
	public static int[] toBinaryRep(int n) {
		int[] res = new int[9];
		for (int i = 8 ; i >= 0 ; i--) {
			int rem = n % 2;
			res[i] = rem;
			n = n >> 1;
		}
		return res;
	}
	public static void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (i == 3) System.out.println();
			else if (i == 6) System.out.println();
			System.out.print(arr[i] == 1 ? "T " : "H ");
		}
	System.out.println();
	}
public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);
	System.out.print("Enter a number between 0 and 511: ");
	int n = inp.nextInt();
	int out[] = toBinaryRep(n);
	display(out);
}
}

//Sample Output:
//Enter a number between 0 and 511: 256
//T H H 
//H H H 
//H H H 
//
//Enter a number between 0 and 511: 32
//H H H 
//T H H 
//H H H

//Enter a number between 0 and 511: 4
//H H H 
//H H H 
//T H H 
