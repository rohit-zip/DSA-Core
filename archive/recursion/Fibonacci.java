package archive.recursion;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: Fibonacci
 */

/**
 * URL: https://takeuforward.org/arrays/print-fibonacci-series-up-to-nth-term/
 * Problem Statement: Given an integer N. Print the Fibonacci series up to the Nth term.
 *
 * Examples:
 *
 * Example 1:
 * Input: N = 5
 * Output: 0 1 1 2 3 5
 * Explanation: 0 1 1 2 3 5 is the fibonacci series up to 5th term.(0 based indexing)
 *
 * Example 2:
 * Input: 6
 *
 * Output: 0 1 1 2 3 5 8
 * Explanation: 0 1 1 2 3 5 8 is the fibonacci series upto 6th term.(o based indexing)
 */
public class Fibonacci {

    public static void main(String[] args) {
        int n = 6;
        System.err.println(fibonacci(n));
    }
    /**
     * Time Complexity: O(2^n)
     * Space Complexity: O(n)
     */
    private static int fibonacci(int n) {
        if (n <= 1) return n;

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
