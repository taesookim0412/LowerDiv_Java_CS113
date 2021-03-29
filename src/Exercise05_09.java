import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;
public class Exercise05_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int n = input.nextInt();
		
		String[] names = new String[n];
		double[] scores = new double[n];
		TreeMap<Double, String> data = new TreeMap<Double, String>(Collections.reverseOrder());

		for (int i = 0; i < n; i++) {
			System.out.print("Enter a student name: ");
			String name = input.next();
			System.out.print("Enter a student score: ");
			double score = input.nextDouble();
			data.put(score, name);
		}
		//data.forEach((s, thename) -> System.out.printf("%f: %s \n", s, thename));
	
		Object[] keys = data.keySet().toArray();
		System.out.println("Top two students: ");
		System.out.printf("%s's score is %f \n", data.get(keys[0]), keys[0]);
		System.out.printf("%s's score is %f \n", data.get(keys[1]), keys[1]);		
	}
}
