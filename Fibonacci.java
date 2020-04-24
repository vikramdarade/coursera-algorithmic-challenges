import java.util.Scanner;

public class Fibonacci {
  private static long calc_fib(int n) {
    if (n <= 1)
      return n;

    return calc_fib(n - 1) + calc_fib(n - 2);
  }

  private static long calculateFibonacciFast(int n){

    long fibArray[] = new long[n+2];
    int i = 0;
    fibArray[0] = 0;
    fibArray[1] = 1;

    for( i=2; i < fibArray.length ; i++){
        fibArray[i] = fibArray[i-1]+fibArray[i-2];
    }
    return  fibArray[n];
  }
 
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calculateFibonacciFast(n));
  }
}


