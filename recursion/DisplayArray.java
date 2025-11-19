package recursion;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: DisplayArray
 */

public class DisplayArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        display(arr, 0);
    }

    private static void display(int[] arr, int n) {
        if (n == arr.length) return;
        System.out.print(arr[n] + " ");
        display(arr, n + 1);
    }
}
