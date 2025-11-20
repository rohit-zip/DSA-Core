package strings;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: ReverseWords
 */

import java.util.Stack;

/**
 * Problem Statement: Given a string s, reverse the words of the string.
 *
 * Example 1:
 * Input: s=”this is an amazing program”
 * Output: “program amazing an is this”
 *
 * Example 2:
 * Input: s=”This is decent”
 * Output: “decent is This”
 */
public class ReverseWords {

    public static void main(String[] args) {
        String str = "this is an amazing program";
        String data = split(str);
        System.err.println(data);
    }

    /**
     * Time Complexity: O(n), where n is the length of the input string.
     * - Each character is processed once to build words and push to the stack.
     * - Popping from the stack and building the result also takes O(n).
     *
     * Space Complexity: O(n)
     * - Stack stores all words, and the result string uses additional space.
     */
    private static String stack(String str) {
        Stack<String> stack = new Stack<>();
        str += " ";
        str = str.replaceAll("\\s+", " ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                stack.push(sb.toString());
                sb = new StringBuilder();
            } else {
                sb.append(ch);
            }
        }
        String b = "";
        while (!stack.isEmpty()) {
            b += stack.peek() + " ";
            stack.pop();
        }
        return b.trim();
    }

    /**
     * Time Complexity: O(n), where n is the length of the input string.
     * - Splitting the string and iterating through the words both take O(n).
     *
     * Space Complexity: O(n)
     * - The split array and the StringBuilder both use O(n) space.
     */
    private static String split(String str) {
        String[] words = str.split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
