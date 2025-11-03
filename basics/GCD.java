package basics;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: GCD
 */

/**
 * URL: https://takeuforward.org/data-structure/find-gcd-of-two-numbers/
 *
 * Problem Statement: Given two integers N1 and N2, find their greatest common divisor.
 * The Greatest Common Divisor of any two integers is the largest number that divides both integers.
 */
public class GCD {

    public static void main(String[] args) {
        int n1 = 56;
        int n2 = 98;
        int gcd = gcdBetterApproach(n1, n2);
        System.err.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }

    /**
     * Brute Force Approach
     * Time Complexity: O(min(n1, n2))
     * Space Complexity: O(1)
     */
    private static int findGCD(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1%1 == 0 && n2%i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    /**
     * Better Approach
     * Time Complexity: O(min(n1, n2))
     * Space Complexity: O(1)
     */
    private static int gcdBetterApproach(int a, int b) {
        for (int i = Math.min(a, b); i > 0 ; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    private static int euclideanGCD(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        } else {
            return a;
        }
    }
}
