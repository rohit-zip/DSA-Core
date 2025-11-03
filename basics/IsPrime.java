package basics;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: IsPrime
 */

/**
 * URL: https://takeuforward.org/data-structure/check-if-a-number-is-prime-or-not/
 * Problem Statement: Given an integer N, check whether it is prime or not. A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2.
 */
public class IsPrime {

    public static void main(String[] args) {
        int n = 1483;
        boolean isPrime = checkPrime(n);
        System.err.println(isPrime ? n + " is a prime number." : n + " is not a prime number.");
    }

    private static boolean checkPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count = count +1;
            }
        }
        return count == 2;
    }

    private static boolean optimized(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
                if (n / i != i) {
                    count++;
                }
            }
        }
        return count == 2;
    }
}
