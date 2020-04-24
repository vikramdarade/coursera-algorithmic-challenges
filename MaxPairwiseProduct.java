import java.util.*;
import java.io.*;
import java.util.Arrays; 


public class MaxPairwiseProduct {
    
    static long getMaxPairwiseProduct(long[] numbers) {
        long max_product = 0;
        int n = numbers.length;

        for (int first = 0; first < n; ++first) {
            for (int second = first + 1; second < n; ++second) {
                max_product = Math.max(max_product,
                    numbers[first] * numbers[second]);
            }
        }

        return max_product;
    }

static long getMaxPairwiseProductFast(long[] numbers){

        int maxIndex1 = 0;

        for(int i=1 ; i < numbers.length ; i++){
            if(numbers[i] > numbers[maxIndex1]){
                maxIndex1 = i;
            }
        }
        int maxIndex2;

        if(maxIndex1 == 0) {
            maxIndex2 =  1;
          } else {
            maxIndex2 = 0;
        }

        for(int j=1 ; j < numbers.length ; j++){

                    if( j != maxIndex1 && numbers[j] >= numbers[maxIndex2]){
                        maxIndex2 = j;
                    }
                }

return  numbers[maxIndex1] * numbers[maxIndex2];

}

static long getmaxPairwiseProductbySorting(long[] numbers){

    Arrays.sort(numbers);
    int n = numbers.length;
    System.out.println(n);
    //System.out.println(numbers[n-1]);
    return numbers[n];
}


    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
       System.out.println(getMaxPairwiseProductFast(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
