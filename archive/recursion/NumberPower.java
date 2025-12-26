package archive.recursion;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: NumberPower
 */

/*
  Problem Statement:
  Implement a function to calculate x raised to the power n (i.e., x^n) using recursion.
  Provide both a simple recursive solution and an optimized recursive solution (using exponentiation by squaring).

  Examples:
    Input: x = 2, n = 4
    Output: 16

    Input: x = 3, n = 3
    Output: 27

    Input: x = 5, n = 0
    Output: 1
 */
public class NumberPower {
    public static void main(String[] args) {
        int power = optimized(2, 4);
        System.out.println(power);
    }

    /*
      Time Complexity: O(n)
      Space Complexity: O(n) (due to recursion stack)
      Explanation: The recursion method calls itself n times, reducing n by 1 each call.
     */
    private static int recursion(int x, int n) {
        if (n == 0) return 1;
        return x * recursion(x, n - 1);
    }

    /*
      Time Complexity: O(log n)
      Space Complexity: O(log n) (due to recursion stack)
      Explanation: The optimized method divides n by 2 each call, resulting in logarithmic recursion depth.
     */
    private static int optimized(int x, int n) {
        if (n == 0) return 1;
        int half = optimized(x, n / 2);
        if (n % 2 == 0) return half * half;
        else return half * half * x;
    }
}
