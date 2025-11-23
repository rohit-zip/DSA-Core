package strings;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: IsomorphicString
 */

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        boolean isIsomorphic = solve(s, t);
        System.out.println(isIsomorphic);
    }

    private static boolean solve(String s, String t) {
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Boolean> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (map1.containsKey(ch1)) {
                if (map1.get(ch1) != ch2) {
                    return false;
                }
            } else {
                if (map2.containsKey(ch2)) {
                    return false;
                } else {
                    map1.put(ch1, ch2);
                    map2.put(ch2, true);
                }
            }
        }
        return true;
    }
}
