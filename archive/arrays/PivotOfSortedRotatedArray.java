package archive.arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: PivotOfSortedRotatedArray
 */

/*
    Problem Statement:
    ------------------
    Given a sorted and rotated array of distinct integers, find the minimum element (pivot) in the array.
    The array was originally sorted in increasing order and then rotated at some pivot unknown to you beforehand.

    Example 1:
        Input: arr = [30, 40, 50, 10, 20]
        Output: 10

    Example 2:
        Input: arr = [4, 5, 6, 7, 0, 1, 2]
        Output: 0

    Example 3:
        Input: arr = [1, 2, 3, 4, 5]
        Output: 1

    Constraints:
        - 1 <= arr.length <= 10^5
        - All elements are distinct

    Approach:
        Use a modified binary search to find the minimum element efficiently.
*/
public class PivotOfSortedRotatedArray {

    public static void main(String[] args) {
        int[] arr = {30,40,50,10,20};
        int pivot = solve(arr);
        System.out.println(pivot);
    }

    /*
        Time Complexity: O(log n)
        ------------------------
        The binary search reduces the search space by half in each iteration, so the time complexity is logarithmic.

        Space Complexity: O(1)
        ---------------------
        Only a constant amount of extra space is used (for variables l, h, mid).
    */
    private static int solve(int[] arr) {
        // Initialize left and right pointers
        int l = 0;
        int h = arr.length - 1;

        // Loop until the search space is reduced to one element
        while (l < h) {
            // Find the middle index to avoid integer overflow
            int mid = l + (h - l) / 2;

            // If the middle element is greater than the rightmost element,
            // the minimum is in the right half (excluding mid)
            if (arr[mid] > arr[h]) {
                l = mid + 1;
            } else {
                // Otherwise, the minimum is at mid or in the left half
                h = mid;
            }
        }

        // At the end, l == h and points to the minimum element
        return arr[h];
    }
}
