package archive.recursion;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: PrintNumber
 */

/**
 * URL: https://takeuforward.org/recursion/print-1-to-n-using-recursion/
 * Problem Description: Given an integer N, write a program to print numbers from 1 to N.
 */
public class PrintNumber {

    public static void main(String[] args) {
        int n = 10;
        printNumbers(n);
    }

    private static void printNumbers(int n) {
        if (n == 0) return;
        printNumbers(n - 1);
        System.out.println(n);
    }
}
