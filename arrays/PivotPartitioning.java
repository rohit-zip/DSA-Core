package arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: PivotPartitioning
 */

public class PivotPartitioning {

    public static void main(String[] args) {
        int[] arr = {7,9,4,8,3,6,2,1};
        partition(arr, 5);
    }

    private static void partition(int[] arr, int pivot) {
        // 0 to j-1 -> <= pivot
        // j to i-1 -> greater than pivot
        // i to end -> unknown

        int i = 0;
        int j = 0;

        while (i < arr.length) {
            if (arr[i] > pivot) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }
    }
}
