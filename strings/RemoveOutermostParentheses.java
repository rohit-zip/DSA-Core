package strings;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: RemoveOutermostParentheses
 */

import java.util.Stack;

/**
 * Problem Statement: A valid parentheses string is defined by the following rules:
 * It is the empty string "".
 * If A is a valid parentheses string, then so is "(" + A + ")".
 * If A and B are valid parentheses strings, then A + B is also valid.
 * <p>
 * A primitive valid parentheses string is a non-empty valid string that cannot be split into two or more non-empty valid parentheses strings.
 * <p>
 * Given a valid parentheses string s, your task is to remove the outermost parentheses from every primitive component of s and return the resulting string.
 * <p>
 * Example 1:
 * Input: s = "((()))"
 * Output: "(())"
 * Explanation: The input string is a single primitive: "((()))".
 * Removing the outermost layer yields: "(())".
 */
public class RemoveOutermostParentheses {

    public static void main(String[] args) {
        String str = "()(()())(())";
        String data = string(str);
        System.err.println(data);
    }

    private static String stack(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                if (!stack.isEmpty()) {
                    sb.append(ch);
                }
                stack.push(ch);
            } else {
                stack.pop();
                if (!stack.isEmpty()) sb.append(ch);
            }
        }
        return sb.toString();
    }

    private static String string(String str) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if (ch == '(') {
                if (counter != 0) {
                    sb.append(ch);
                }
                counter++;
            } else {
                counter--;
                if (counter != 0) {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}
