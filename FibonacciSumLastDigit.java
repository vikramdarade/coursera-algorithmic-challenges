import java.util.*;

public class FibonacciSumLastDigit {
    private static long getFibonacciSumNaive(long n) {
        if (n <= 1)
            return n;

        long previous = 0;
        long current  = 1;
        long sum      = 1;

        for (long i = 0; i < n - 1; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
            sum += current;
        }

        return sum % 10;
    }

  private static long getFibonacciSumFast(int n){

    long fibArray[] = new long[n+2];
    int i = 0;
    fibArray[0] = 0;
    fibArray[1] = 1;

    long sum = 0;

    for( i=2; i < fibArray.length ; i++){
        fibArray[i] = fibArray[i-1]+fibArray[i-2];

    }
    
    for(int j=0; j < n+1  ; ++j){
       sum += fibArray[j];
    }
    return sum % 10;
  }

  private static int computePisanoPeriod(int n){
     
      int current = 0;
      int next = 1;
      int period = 0;
      int oldnext = 0;

      while(true){

          oldnext = next;
          next = (current + next) % n;
          current = oldnext;
          period++;

          if (current == 0 && next ==1 ){
              return period;
          }
      }
  }


  private static long computeFibonacciSumLastDigit(long n){

      int current = 0;
      int next = 1;
      int oldnext = 0;
      for(int i = 0; i < n; ++i){
           oldnext = next;
           next = (current+next) % 10;
           current = oldnext;
       }
       return current;
       
       }


private static long sumFibonacciLastDigit(long n) {

    return ((computeFibonacciSumLastDigit(n+2) % 60)-1) % 10;
    
}

 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(sumFibonacciLastDigit(n));
    }
}

