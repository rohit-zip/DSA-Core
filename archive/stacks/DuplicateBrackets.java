package archive.stacks;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: DuplicateBrackets
 */

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean isDuplicate = isDuplicate(str);
        System.err.println(isDuplicate);
    }

    private static boolean isDuplicate(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if (ch == ')') {
                if (stack.peek() == '(') {
                    return true;
                } else {
                    while (stack.peek() != '(') {
                        stack.pop();
                    }
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }
        return false;
    }
}
