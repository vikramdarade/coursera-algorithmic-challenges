import java.util.*;

public class FibonacciPartialSum {
    private static long getFibonacciPartialSumNaive(long from, long to) {
        long sum = 0;

        long current = 0;
        long next  = 1;

        for (long i = 0; i <= to; ++i) {
            if (i >= from) {
                sum += current;
            }

            long new_current = next;
            next = next + current;
            current = new_current;
        }

        return sum % 10;
    }
    

    
   private static int fib(int n) 
{ 
    double phi = (1 + Math.sqrt(5)) / 2; 
    return (int) Math.round(Math.pow(phi, n) / Math.sqrt(5)); 
} 
  
// Function to return the required sum 
private static int calculateSum(int l, int r) 
{ 
      // Using our deduced result 
    int sum = fib(r + 2) - fib(l + 1); 
    return sum % 10; 
} 

	private static long getFibonacciPartialSum(long from, long to) {
		long sum = 0;
    
                //Reduces very large numbers to manageable form
		from = from % 60;
		to = to % 60;
                //While this reduction if "to" is less than "from" it introduces errors, hence add 60 to it to make to>from for 
                //proper calculation of partial sum
		if (to < from) 
			to += 60;
		
		long current = 0;
		long next = 1;

		for (long i = 0; i <= to; ++i) {
			if (i >= from) {
				sum += current;
			}

			long new_current = next;
			next = next + current;
			current = new_current;
		}

		return sum % 10;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long from = scanner.nextLong();
        long to = scanner.nextLong();
        System.out.println(getFibonacciPartialSum(from, to));
    }
}

