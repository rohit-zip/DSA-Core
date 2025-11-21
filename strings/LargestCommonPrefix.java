package strings;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: LargestCommonPrefix
 */

import java.util.Arrays;

public class LargestCommonPrefix {

    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
        String prefix = solve2(arr);
        //System.err.println(prefix);
    }

    private static String solve(String[] arr) {
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();

        String first = arr[0];
        String last = arr[arr.length - 1];

        for (int i=0 ; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return sb.toString();
            }
            sb.append(first.charAt(i));
        }
        return sb.toString();
    }

    private static String solve2(String[] arr) {
        String a = arr[0];
        for (int i=0 ; i<arr.length ; i++) {
            while(arr[i].indexOf(a) != 0) {
            System.out.println("Condition : " + arr[i].indexOf(a));
                System.out.println("String : " + arr[i] + "Substring : " + a.substring(0,a.length()-1));
                a = a.substring(0, a.length() - 1);
                System.out.println("A : " + a);
            }
        }
        return a;
    }
}
