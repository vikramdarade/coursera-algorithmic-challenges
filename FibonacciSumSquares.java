import java.util.*;

public class FibonacciSumSquares {
    private static long getFibonacciSumSquaresNaive(long n) {
        if (n <= 1)
            return n;

        long previous = 0;
        long current  = 1;
        long sum      = 1;

        for (long i = 0; i < n - 1; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
            sum += current * current;
        }

        return sum % 10;
    }
    
    private static long getFibonacciSumSquaresLastDigit(long n) {
		if (n <= 1)
			return n;

		long current = calculateFibonacciFast(n % 60);
		long next = calculateFibonacciFast((n + 1) % 60);
    
                //We need not know what is the actual product to find the last digit. Just the last digit of F(n) and F(n+1) are sufficient.
                //This reduces the multiplication complexity greatly! ;)
		return ((current % 10) * (next % 10) % 10);
	}


     private static long calculateFibonacciFast(long n){
        if (n == 1 || n == 0) {
			return n;
		}

		long fib1 = 0;
		long fib2 = 1;
		long fib3 = 0;
		for (long i = 2; i <= n; i++) {
			fib3 = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib3;
		}
		
        return fib3;
  }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = getFibonacciSumSquaresLastDigit(n);
        System.out.println(s);
    }
}

