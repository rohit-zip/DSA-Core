package arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: LeftRotateArray
 */

/**
 * Problem Statement: Given an array of N integers, left rotate the array by one place.
 *
 Example 1:
 Input: N = 5, array[] = {1,2,3,4,5}
 Output: 2,3,4,5,1
 Explanation:
 Since all the elements in array will be shifted
 toward left by one so ‘2’ will now become the
 first index and and ‘1’ which was present at
 first index will be shifted at last.


 Example 2:
 Input: N = 1, array[] = {3}
 Output: 3
 Explanation: Here only element is present and so
 the element at first index will be shifted to
 last index which is also by the way the first index.

 */
public class LeftRotateArrayOne {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        int[] ints = bruteForce(arr);
//        for (int num : ints) {
//            System.err.print(num + " ");
//        }
        optimal(arr);
        for (int num : arr) {
            System.err.print(num + " ");
        }
    }

    private static int[] bruteForce(int[] arr) {
        int[] n = new int[arr.length];
        for (int i=1 ; i<arr.length ; i++) {
            n[i-1] = arr[i];
        }
        n[arr.length - 1] = arr[0];
        return n;
    }

    private static void optimal(int[] arr) {
        int first = arr[0];
        for (int i=1 ; i<arr.length ; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length - 1] = first;
    }
}
