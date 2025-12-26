package practice;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: IsPrime
 */

public class IsPrime2 {

    public static void main(String[] args) {
        boolean data = isPrime(8);
        System.out.println(data);
    }

    private static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1 ; i <= n ; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count == 2;
    }

    private static boolean optimized(int n) {
        int count = 0;
        for (int i = 1 ; i <= Math.sqrt(n) ; i++) {
            if (n%i == 0) {
                count++;
                if (n/i != i) {
                    count++;
                }
            }
        }
        return count == 2;
    }
}
