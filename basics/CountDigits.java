package basics;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: CountDigits
 */

import java.util.Scanner;

/**
 * URL: https://takeuforward.org/data-structure/count-digits-in-a-number/
 */
public class CountDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int count = countDigitsOptimized(number);
        System.err.println("Number of digits in " + number + " is: " + count);
    }

    /**
     * Brute Force Approach
     * Count digits in a number
     * Time Complexity: O(log10 n)
     * Space Complexity: O(1)
     */
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    /**
     * Optimized Approach
     * Count digits in a number using logarithm
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public static int countDigitsOptimized(int number) {
        if (number == 0) {
            return 1;
        }
        return (int) (Math.log10(number) + 1);
    }
}
