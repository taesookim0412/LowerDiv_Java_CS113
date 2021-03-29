//Author: Tae Soo Kim
//Check: Pass

import java.util.*;

public class Exercise04_15 {
	public static void main(String[] args) {
		Map<String, Integer> phone = new HashMap<String, Integer>() {{
		    put("2", 3);
		    put("3", 3);
		    put("4", 3);
		    put("5", 3);
		    put("6", 3);
		    put("7", 4);
		    put("8", 3);
		    put("9", 4);
		  }};
		  Map<Integer, String> numCharToDigit = new HashMap<Integer, String>();
		  int lastValue = 0;
		  for (Map.Entry<String, Integer> entry: phone.entrySet()) {
			  lastValue += entry.getValue();
			  numCharToDigit.put(lastValue, entry.getKey());
		  }
		  //phone.forEach((key, value) -> System.out.printf("%s: %d \n", key, value));
		  
		  //Maximum char - 65 => Phonepad number mapping
		  //numCharToDigit.forEach((key, value) -> System.out.printf("%d: %s \n", key, value));
		  
		  Scanner scanner = new Scanner(System.in);
		  System.out.print("Enter a letter: ");
		  String input = scanner.next();
		  
		  if (input.length() != 1) {
			  System.out.printf("%s is an invalid input.", input);
			  return;
		  }
		  int int_input = (int) ((char)input.toUpperCase().charAt(0)) - 64;
		  boolean isChar = int_input >= 1 && int_input <= 26;
		  if (!isChar) {
			  System.out.printf("%s is an invalid input.", input);
			  return;
		  }
		  //System.out.println(int_input);
		  while (!numCharToDigit.containsKey(int_input))
			  int_input += 1;
		  //System.out.println(int_input);
		  System.out.printf("The corresponding number is %s", numCharToDigit.get(int_input));
			  
		  
		  
		  
	}
	  
}


//Sample output:
//command>javac Exercise04_15.java
//Compiled successful
//
//command>java Exercise04_15
//Enter a letter: A
//The corresponding number is 2
//Enter a letter: p
//The corresponding number is 7
//Enter a letter: t
//The corresponding number is 8
//Enter a letter: w
//The corresponding number is 9
//Enter a letter: @
//@ is an invalid input.
//Enter a letter: [
//[ is an invalid input.