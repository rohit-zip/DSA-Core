package archive.hashing;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: CharacterFrequency
 */

public class CharacterFrequency {

    public static void main(String[] args) {
        String str = "abavbcada";
        int[] hash = new int[26];
        for (int i=0 ; i<str.length() ; i++) {
            char ch = str.charAt(i);
            hash[ch - 'a'] += 1;
        }

        System.err.println("Frequency of a is : " + hash['a' - 'a']);
    }
}
