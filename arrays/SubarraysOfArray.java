package arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: SubarraysOfArray
 */
/*
  Problem Statement:
  Given an integer array, print all possible subarrays of the array.
  A subarray is a contiguous part of the array.

  Examples:
  Input: arr = [1, 2, 3]
  Output:
  1
  1 2
  1 2 3
  2
  2 3
  3

  Input: arr = [4, 5]
  Output:
  4
  4 5
  5
*/
public class SubarraysOfArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        for (int i = 0 ; i<arr.length ; i++) {
            for (int j = i ; j<arr.length ; j++) {
                System.err.print(arr[j] + " ");
                for (int k = i ; k<=j ; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
