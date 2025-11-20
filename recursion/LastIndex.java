package recursion;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: LastIndex
 */

/*
  Problem Statement:
  Given an integer array `arr`, and an integer `data`, find the last index at which `data` occurs in the array using recursion.
  If `data` is not present in the array, return -1.

  Examples:
    Input: arr = [2,3,6,9,8,3,2,3,6,4], data = 6
    Output: 8

    Input: arr = [1,2,3,4,5], data = 7
    Output: -1

    Input: arr = [5,5,5,5], data = 5
    Output: 3
 */

public class LastIndex {

    public static void main(String[] args) {
        int[] arr = {2,3,6,9,8,3,2,3,6,4};
        System.err.println(lastIndex(arr, 0, 6));
    }

    /*
      Time Complexity: O(n)
      - The function makes a recursive call for each element in the array, resulting in n calls for an array of length n.

      Space Complexity: O(n)
      - The recursion stack will go as deep as the length of the array in the worst case.
     */
    private static int lastIndex(int[] arr, int idx, int data) {
        if (idx == arr.length) return -1;
        int li = lastIndex(arr, idx+1, data);
        if (li == -1) {
            if (arr[idx] == data) {
                return idx;
            } else {
                return -1;
            }
        } else {
            return li;
        }
    }
}
