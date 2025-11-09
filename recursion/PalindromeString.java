package recursion;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: PalindromeString
 */

/**
 * URL: https://takeuforward.org/data-structure/check-if-the-given-string-is-palindrome-or-not/
 * Problem Statement: "Given a string, check if the string is palindrome or not."  A string is said to be palindrome if the reverse of the string is the same as the string.
 *
 * Examples:
 *
 * Example 1:
 * Input: Str =  “ABCDCBA”
 * Output: Palindrome
 * Explanation: String when reversed is the same as string.
 *
 * Example 2:
 * Input: Str = “TAKE U FORWARD”
 * Output: Not Palindrome
 * Explanation: String when reversed is not the same as string.
 */
public class PalindromeString {

    public static void main(String[] args) {
        String a = "fdgdfbdf";
        System.err.println(isPalindrome(a, 0) ? "Palindrome" : "Not Palindrome");
    }

    private static boolean isPalindrome(String str, int i) {
        if (i == str.length()/2) return true;

        if (str.charAt(i) != str.charAt(str.length()-i-1))
            return false;

        return isPalindrome(str, i+1);
    }
}
