package basics;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: CheckPalindrome
 */

import java.util.Scanner;

/**
 * URL: https://takeuforward.org/data-structure/check-if-a-number-is-palindrome-or-not/
 * Problem Statement: Given an integer N, return true if it is a palindrome else return false.
 *
 * A palindrome is a number that reads the same backward as forward. For example, 121, 1331, and 4554 are palindromes because they remain the same when their digits are reversed.
 */
public class CheckPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        boolean isPalindrome = checkPalindrome(number);
        System.err.println("Is " + number + " a palindrome? " + isPalindrome);
    }

    /**
     * Checks if the given integer is a palindrome.
     *
     * A palindrome is a number that reads the same backward as forward.
     * For example, 121, 1331, and 4554 are palindromes.
     *
     * @param number the integer to check
     * @return true if the number is a palindrome, false otherwise
     */
    private static boolean checkPalindrome(int number) {
        int on = number;
        int rn = 0;
        while (number != 0) {
            int digit = number % 10;
            rn = rn * 10 + digit;
            number = number / 10;
        }
        return on == rn;
    }
}
