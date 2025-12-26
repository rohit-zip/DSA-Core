package archive.arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: CeilAndFloor
 */

/*
  Problem Statement:
  Given a sorted array of integers and a target value `data`, find the indices of the floor and ceil of `data` in the array.
  - The floor of `data` is the largest element in the array less than or equal to `data`.
  - The ceil of `data` is the smallest element in the array greater than or equal to `data`.
  If `data` is present in the array, both floor and ceil are the index of `data`.

  Examples:
  Input: arr = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100], data = 61
  Output: Ceil: 70 (index 6), Floor: 60 (index 5)

  Input: arr = [1, 3, 5, 7, 9], data = 4
  Output: Ceil: 5 (index 2), Floor: 3 (index 1)

  Input: arr = [2, 4, 6, 8], data = 8
  Output: Ceil: 8 (index 3), Floor: 8 (index 3)

  Time Complexity:
  - O(log n), where n is the length of the array.
    Explanation: The algorithm uses binary search to find the floor and ceil, halving the search space each iteration.

  Space Complexity:
  - O(1)
    Explanation: Only a constant amount of extra space is used for variables.
 */
public class CeilAndFloor {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int l = 0;
        int h = arr.length - 1;
        int f = Integer.MIN_VALUE;
        int c = Integer.MAX_VALUE;
        int data = 61;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (data < arr[mid]) {
                h = mid - 1;
                c = mid;
            } else if (data > arr[mid]) {
                l = mid + 1;
                f = mid;
            } else {
                c = f = mid;
                break;
            }
        }
        System.err.printf("Ceil : %s and Floor : %s", arr[c], arr[f]);
    }
}
