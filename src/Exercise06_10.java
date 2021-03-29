
public class Exercise06_10 {
	public static void main(String[] args) {
		int ct = 0;
		for (int i = 2; i < 10000; i++) {
			if (isPrime(i))
				ct += 1;
		}
		int pairCt = pairPrime(1000);
		System.out.println("The number of prime numbers < 10000 is " + ct);
		System.out.println("Pair primes is: " + pairCt);
		
	}
	//Create a function pairPrime, that takes one argument. pairPrime should return the number of pair primes between 2 and the argument passed. Use the pairPrime function to count the pair primes  between 2 and 1000.  Make use of the IsPrime  function to solve this task. (This feature is worth 8 points).
	public static int pairPrime(int n) {
		boolean[] primes = new boolean[n];
		primes[2] = true;
		primes[3] = true;
		int pairCt = 0;
		for (int i = 4; i < n; i++) {
			primes[i] = isPrime(i);
			if (primes[i-2] && primes[i]) {
				pairCt += 1;
			}
		}
		return pairCt;
	}
	
	public static boolean isPrime(int number) {
	    for (int divisor = 2; divisor <= number / 2; divisor++) {
	      if (number % divisor == 0) { // If true, number is not prime
	        return false; // number is not a prime
	      }
	    }
	
	    return true; // number is prime
	}

}
