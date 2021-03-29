import java.util.*;

public class Exercise05_49 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		s = s.replaceAll("[^A-Za-z]", "").toLowerCase();
		
		
		
		HashSet<Character> vowels = new HashSet<Character>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		
		
		int vowelsCt = 0;
		int consCt = 0;
		
		for (int i = 0; i < s.length(); i++) {
			Character thisCh = s.charAt(i);
			if (vowels.contains(thisCh)) {
				vowelsCt += 1;
			}
			else {
				consCt += 1;
			}
		}
		
		System.out.printf("The number vowels is %d\n", vowelsCt);
		System.out.printf("The number consonants is %d\n", consCt);
		
	}
}
