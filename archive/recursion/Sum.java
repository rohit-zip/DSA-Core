package archive.recursion;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: Sum
 */

/**
 * URL: https://takeuforward.org/data-structure/sum-of-first-n-natural-numbers/
 * Problem statement: Given a number ‘N’, find out the sum of the first N natural numbers.
 */
public class Sum {

    public static void main(String[] args) {
        int n = 5;
        int sum = sum(n);
        System.err.println(sum);
    }

    private static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }
}
