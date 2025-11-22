package strings;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: AllPalindromicSubstrings
 */

public class AllPalindromicSubstrings {

    public static void main(String[] args) {
        String str = "abccbc";
        for (int i=0 ; i<str.length() ; i++){
            for (int j = i ; j<str.length() ; j++) {
                if (isPalindrome(str.substring(i, j + 1))){
                    System.out.println(str.substring(i, j + 1));
                }
            }
        }
    }

    private static boolean isPalindrome(String str) {
        int l = 0;
        int r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
