package archive;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: AllDivisors
 */

import java.util.ArrayList;
import java.util.List;

/**
 * URL: https://takeuforward.org/data-structure/print-all-divisors-of-a-given-number/
 * Problem Statement: Given an integer N, return all divisors of N.
 * A divisor of an integer N is a positive integer that divides N without leaving a remainder. In other words, if N is divisible by another integer without any remainder, then that integer is considered a divisor of N.
 */
public class AllDivisors {

    public static void main(String[] args) {
        int n = 20;
        List<Integer> divisors = printAllDivisors(n);
        System.err.println(divisors);
    }

    /**
     * Brute Force Approach
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static List<Integer> printAllDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    /**
     * Optimized Approach
     * Time Complexity: O(sqrt(N))
     * Space Complexity: O(1)
     */
    private static List<Integer> printAllDivisorsOptimized(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        return divisors;
    }
}
