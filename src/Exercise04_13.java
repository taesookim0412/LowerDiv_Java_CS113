import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Exercise04_13 {
	public static void main(String[] args) {
		Set<String> vowels = new HashSet<String>(Arrays.asList("a", "e", "i", "o","u"));
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		String input = scanner.next().toUpperCase();
		//2: vowel, 1: consonant, 0:False
		int res = input.length() == 1 ? vowels.contains(input.toLowerCase()) ? 2 : Character.isLetter((char) input.charAt(0)) ? 1 :0 : 0; 
		String[] cases = { "invalid", "consonant", "vowel"};
		
		System.out.printf("%s is a %s letter.", input, cases[res]);
	}
}

//command>javac Exercise04_13.java
//Compiled successful
//
//command>java Exercise04_13
//Enter a letter: x
//x is a consonant letter.
//Enter a letter: y
//y is a consonant letter.
//Enter a letter: 1
//1 is a invalid letter.
//Enter a letter: i
//i is a vowel letter.
//Enter a letter: u
//u is a vowel letter.
