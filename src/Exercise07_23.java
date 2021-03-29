//Author: Tae Soo Kim
// Check: Pass


public class Exercise07_23 {
public static void main(String[] args) {
	boolean lockers[] = new boolean[100];
	for (int i = 0; i < 100; i++) {
		int locker = i;
		while (locker < 100) {
			lockers[locker] = !lockers[locker];
			locker += i+1;
		}
	}
	for (int i = 0; i < 100; i++) {
		if (lockers[i]) {
			System.out.println("Locker " + (i + 1) + " is open");
		}
	}
}
}

//Sample output:
//command>javac Exercise07_23.java
//Compiled successful
//
//command>java Exercise07_23
//Locker 1 is open
//Locker 4 is open
//Locker 9 is open
//Locker 16 is open
//Locker 25 is open
//Locker 36 is open
//Locker 49 is open
//Locker 64 is open
//Locker 81 is open
//Locker 100 is open
