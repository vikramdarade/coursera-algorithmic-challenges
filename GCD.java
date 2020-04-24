import java.util.*;

public class GCD {
  private static int gcd_naive(int a, int b) {
    int current_gcd = 1;
    for(int d = 2; d <= a && d <= b; ++d) {
      if (a % d == 0 && b % d == 0) {
        if (d > current_gcd) {
          current_gcd = d;
        }
      }
    }

    return current_gcd;
  }

  private static long gcdEuclidIterative(long a, long b){

    long quotient , remainder;

    while ( b>0 ){
      quotient = a/b;
      remainder = a%b;

      a = b;
      b = remainder;

    }
    return a;

  }

  private static long gcdEuclidRecursive(long a , long b){

    if(b == 0){
      return a;
    }
    
    long quotient = a/b;
    long remainder = a%b;

    return gcdEuclidRecursive(b,remainder);

  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    //System.out.println("Native"+gcd_naive(a, b));
    System.out.println(gcdEuclidIterative(a,b));
    //System.out.println("Recursive"+gcdEuclidRecursive(a,b));
  }
}
