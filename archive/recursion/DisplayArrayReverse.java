package archive.recursion;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: DisplayArrayReverse
 */

public class DisplayArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        displayReverse(arr, 0);
    }

    public static void displayReverse(int[] arr, int n) {
        if (n == arr.length) return;
        displayReverse(arr, n + 1);
        System.out.print(arr[n] + " ");
    }
}
