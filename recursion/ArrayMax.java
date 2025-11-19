package recursion;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: ArrayMax
 */
public class ArrayMax {

    public static void main(String[] args) {
        int[] arr = {2,1,4,6,5};
        int max = max(arr, 0);
        System.err.println(max);
    }

    private static int max(int[] arr, int n) {
        if (n < arr.length) {
            return Math.max(arr[n], max(arr, n+1));
        }
        return arr[0];
    }

    private static int max2(int[] arr, int n) {
        if (n == arr.length) return arr[n];
        int m = max2(arr, n+1);
        if (m > arr[n]) {
            return m;
        } else {
            return arr[n];
        }
    }
}
