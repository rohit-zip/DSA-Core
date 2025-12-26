package archive;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: Armstrong
 */

/**
 * URL: https://takeuforward.org/maths/check-if-a-number-is-armstrong-number-or-not/
 * Problem Statement: Given an integer N, return true it is an Armstrong number otherwise return false.
 *
 * An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
 */
public class Armstrong {

    public static void main(String[] args) {
        int number = 6346;
        boolean isArmstrong = checkArmstrong(number);
        System.err.println("Is " + number + " an Armstrong number? " + isArmstrong);
    }

    private static boolean checkArmstrong(int number) {
        int on = number;
        int sum = 0;
        int count = numberOfDigits(number);
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, count);
            number = number / 10;
        }
        return on == sum;
    }

    private static int numberOfDigits(int number) {
        int count = 0;
        while (number != 0) {
            number = number/10;
            count++;
        }
        return count;
    }
}
