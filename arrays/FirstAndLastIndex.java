package arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: FirstAndLastIndex
 */

/*
  Problem Statement:
  Given a sorted array of integers (which may contain duplicates) and a target value,
  find the first and last index of the target value in the array.
  If the target is not present, return -1 for both indices.

  Examples:
  Input: arr = [10, 10, 10, 20, 20, 20, 20, 30, 40, 40], target = 20
  Output: First Index = 3, Last Index = 6

  Input: arr = [1, 2, 3, 4, 5], target = 6
  Output: First Index = -1, Last Index = -1

  Input: arr = [5, 5, 5, 5, 5], target = 5
  Output: First Index = 0, Last Index = 4

  Time Complexity Explanation:
  Both `firstIndex` and `lastIndex` use a modified binary search algorithm.
  Each function runs in O(log n) time, where n is the length of the array,
  because the search space is halved in each iteration.

  Space Complexity Explanation:
  The space complexity is O(1) as only a constant amount of extra space is used
  (for variables like l, h, mid, fi/li).
 */
public class FirstAndLastIndex  {

    public static void main(String[] args) {
        int[] arr = {10, 10, 10, 20, 20, 20, 20, 30, 40, 40};
        int fi = firstIndex(arr, 20);
        int li = lastIndex(arr, 20);
        System.err.println(fi + " " + li);
    }

    private static int firstIndex(int[] arr, int target) {
        int l = 0;
        int h = arr.length - 1;
        int fi = -1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (target > arr[mid]) {
                l = mid + 1;
            } else if (target < arr[mid]) {
                h = mid - 1;
            } else {
                fi = mid;
                h = mid - 1;
            }
        }
        return fi;
    }

    private static int lastIndex(int[] arr, int target) {
        int l = 0;
        int h = arr.length - 1;
        int li = -1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (target > arr[mid]) {
                l = mid + 1;
            } else if (target < arr[mid]) {
                h = mid - 1;
            } else {
                li = mid;
                l = mid + 1;
            }
        }
        return li;
    }
}
