package arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: BinarySearch
 */

/*
  Problem Statement:
  Implement a binary search algorithm in Java. Given a sorted array of integers and a target value,
  return the index of the target if it exists in the array. If the target does not exist, return -1.

  Examples:
  Input: arr = [1,2,3,4,5,6,7,8,9], data = 5
  Output: 4

  Input: arr = [1,2,3,4,5,6,7,8,9], data = 10
  Output: -1

  Input: arr = [2,4,6,8,10], data = 2
  Output: 0
*/

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int a = binarySearch(arr ,10);
        System.err.println(a);
    }

    private static int binarySearch(int[] arr, int data) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (data > arr[mid]) {
                low = mid + 1;
            } else if (data < arr[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
