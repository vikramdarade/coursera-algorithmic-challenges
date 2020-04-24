import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current  = 1;

        for (int i = 0; i < n - 1; ++i) {
            int tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
        }

        return current % 10;
    }


  private static long getFibonacciLastDigitFast(int n){

    long fibArray[] = new long[n+2];
    int i = 0;
    fibArray[0] = 0;
    fibArray[1] = 1;

    for( i=2; i < fibArray.length ; i++){
        fibArray[i] = (fibArray[i-1]+fibArray[i-2]) % 10;
    }
    return  fibArray[n] ;
  }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long c = getFibonacciLastDigitFast(n);
        System.out.println(c);
    }
}

