package recursion;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: PrintNumber
 */

/**
 * URL: https://takeuforward.org/recursion/print-name-n-times-using-recursion/
 * Problem Description: Given an integer N, write a program to print your name N times.
 */
public class PrintName {

    public static void main(String[] args) {
        int n = 4;
        printName(n);
    }

    private static void printName(int n) {
        if (n == 0) return;
        System.out.println("Rohit Parihar");
        printName(n - 1);
    }
}
