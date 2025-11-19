package recursion;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: ZigZag
 */

public class MultipleRecursion {

    public static void main(String[] args) {
        recursion(2);
    }

    private static void recursion(int n) {
        if (n == 0) return;
        System.out.println("Pre : " + n);
        recursion(n-1);
        System.out.println("In : " + n);
        recursion(n-1);
        System.out.println("Post : " + n);
    }
}
