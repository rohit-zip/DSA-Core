package archive;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: ReverseDigits
 */

import java.util.Scanner;

/**
 * URL: https://takeuforward.org/maths/reverse-digits-of-a-number
 * Problem Statement: Given an integer N return the reverse of the given number.
 *
 * Note: If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.
 */
public class ReverseDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int reversedNumber = reverseDigits(number);
        System.err.println("Reversed number of " + number + " is: " + reversedNumber);
    }

    public static int reverseDigits(int number) {
        int rn = 0;
        while (number != 0) {
            int digit = number % 10;
            rn = rn * 10 + digit;
            number = number / 10;
        }
        return rn;
    }
}
