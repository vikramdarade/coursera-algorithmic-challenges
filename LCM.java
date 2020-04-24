import java.util.*;

public class LCM {
  private static long lcm_naive(int a, int b) {
    for (long l = 1; l <= (long) a * b; ++l)
      if (l % a == 0 && l % b == 0)
        return l;

    return (long) a * b;
  }


  private static long gcdEuclidRecursive(long a , long b){

    if(b == 0){
      return a;
    }
    
    long quotient = a/b;
    long remainder = a%b;

    return gcdEuclidRecursive(b,remainder);

  }

  private static long lcmRecursive(long a,long b){

    long lcm ;
    long gcd = gcdEuclidRecursive(a,b);

    lcm = a*b/gcd;
  
    return lcm;

  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcmRecursive(a, b));
  }
}
