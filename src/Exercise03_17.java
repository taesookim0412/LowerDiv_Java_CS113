//*3.17 (Game: scissor, rock, paper) Write a program that plays the popular scissor-rock-paper game. 
//(A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.) 
//The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. 
//The program prompts the user to enter a number 0, 1, or 2 and displays a message indicating whether the user or the computer wins, 
//loses, or draws. Here is a sample run:
//JDK8>java Exercise03_17 
//scissor (0), rock (1), paper (2): 2
//The computer is paper. You are paper too. It is a draw
//
//JDK8>


// Author: Tae Soo Kim
// Logic: Pass
 
import java.util.Scanner;
import java.util.Random;

public class Exercise03_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("scissor (0), rock (1), paper (2): ");		
		int input = sc.nextInt();
		
		//Scissor: Beats one, Loses to one.
		//Beats paper, loses to rock
		
		// paper: Beats rock, loses to sissor.
		
		// Correlation: choices[i] beats choices[i-1 % 3] and loses to choices [i+1 % 3]
		String[] choices = { "scissor", "rock", "paper" };
		
		// choose random
		Random rand = new Random();
		int randomInt = rand.nextInt(3);
		
		
		String playerChoice = choices[input];
		String computerChoice = choices[randomInt];
		//Tie
		if (randomInt == input) {
			System.out.printf("The computer is %s. You are %s too. It is a draw", playerChoice, computerChoice);
			return;
		}
		//Player result
//		boolean playerRes = randomInt == Math.abs((input - 1) % 3);
//  	Add 3 (Modulus cannot handle random numbers properly for positive indices)
		boolean playerRes = randomInt == (input + 3 - 1) % 3;
		// System.out.println((input+3 - 1) % 3); 
		if (playerRes) {
			System.out.printf("The computer is %s. You are %s. You won.", computerChoice, playerChoice);
		}
		else {
			System.out.printf("The computer is %s. You are %s. You lost.", computerChoice, playerChoice);
		}
		
		
		
		
	}
	
	

}

// Sample output:
// command>java Exercise03_17
// scissor (0), rock (1), paper (2): 0
// The computer is scissor. You are scissor too. It is a draw

// command>java Exercise03_17
// scissor (0), rock (1), paper (2): 1
// The computer is scissor. You are rock. You won.

// command>java Exercise03_17
// scissor (0), rock (1), paper (2): 2
// The computer is rock. You are paper. You won.

// command>java Exercise03_17
// scissor (0), rock (1), paper (2): 2
// The computer is scissor. You are paper. You lost.



