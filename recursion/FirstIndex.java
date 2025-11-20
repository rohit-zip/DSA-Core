package recursion;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: FirstIndex
 */

/*
  Problem Statement:
  ------------------
  Given an integer array `arr` and an integer `data`, find the first index at which `data` occurs in the array using recursion.
  If `data` is not present in the array, return -1.

  Examples:
  ---------
  Input: arr = {2, 3, 9, 8, 7, 6, 4, 12, 7, 3, 8}, data = 8
  Output: 3

  Input: arr = {1, 2, 3, 4, 5}, data = 6
  Output: -1

  Input: arr = {5, 5, 5, 5}, data = 5
  Output: 0
 */
public class FirstIndex {

    public static void main(String[] args) {
        int[] arr = {2,3,9,8,7,6,4,12,7,3,8};
        System.err.println(recursive2(arr, 0, 8));
    }

    /*
      Time Complexity: O(n)
      Space Complexity: O(n) (due to recursion stack)
      Explanation: The function may traverse the entire array in the worst case, and each recursive call adds a new frame to the call stack.
     */
    private static int recursive(int[] arr, int idx, int data) {
        if (idx == arr.length) return -1;
        int fiisa = recursive(arr, idx+1, data);
        if (arr[idx] == data) {
            return idx;
        } else {
            return fiisa;
        }
    }

    /*
      Time Complexity: O(n)
      Space Complexity: O(n) (due to recursion stack)
      Explanation: The function checks each element recursively, so in the worst case, it will make n recursive calls.
      The recursive2 method is more optimized than recursive because it checks if the current element matches `data` before making a recursive call.
      This allows it to return immediately when a match is found, reducing the number of recursive calls and stack usage.
      In contrast, the recursive method always makes a recursive call first, even if the current element is a match, leading to unnecessary recursion and higher stack usage.
     */
    private static int recursive2(int[] arr, int idx, int data) {
        if (idx == arr.length) return -1;
        if (arr[idx] == data) return idx;
        else return recursive2(arr, idx+1, data);
    }
}
