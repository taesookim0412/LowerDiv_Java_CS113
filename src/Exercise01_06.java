//1.6 (Summation of a series) Write a program that displays the result of
//
//1+2+3+4+5+6+7+8+9.
public class Exercise01_06 {
	public static void main(String[] args) {
		int res = 0;
		for (int i = 1; i < 10; i++) {
			res += i;
		}
		System.out.println(res);
	}
}
