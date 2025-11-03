package recursion;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: Factorial
 */

/**
 * URL: https://takeuforward.org/data-structure/factorial-of-a-number-iterative-and-recursive/
 * Problem Statement: Given a number X,  print its factorial.
 *
 * To obtain the factorial of a number, it has to be multiplied by all the whole numbers preceding it. More precisely X! = X*(X-1)*(X-2) … 1.
 */
public class Factorial {

    public static void main(String[] args) {
        int n = 4;
        int factorial = factorial(n);
        System.err.println(factorial);
    }

    private static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}
