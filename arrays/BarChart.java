package arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: BarChart
 */

/*
  Problem Statement:
  Given an array of non-negative integers, print a vertical bar chart representing the values in the array.
  Each value in the array corresponds to the height of a column in the bar chart. Print '*' for each unit of height,
  and print spaces where there is no bar.

  Example:
  Input: arr = {3, 1, 0, 7, 5}
  Output:
      *
      *
      * *
  *   *
  *  **
  *  **
  *****

  Each row represents a level from the maximum value down to 1.
*/
public class BarChart {

    public static void main(String[] args) {
        int[] arr = {3, 1, 0, 7, 5};
        printBarChart(arr);
    }

    private static void printBarChart(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) max = num;
        }

        for (int i = max ; i>=1 ; i--) {
            for (int j=0 ; j<arr.length ; j++) {
                if (arr[j] >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
