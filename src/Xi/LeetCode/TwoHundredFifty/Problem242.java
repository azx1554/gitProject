package Xi.LeetCode.TwoHundredFifty;

/**
 Given two strings s and t , write a function to determine if t is an anagram of s.

 Example 1:
 Input: s = "anagram", t = "nagaram"
 Output: true

 Example 2:
 Input: s = "rat", t = "car"
 Output: false
 */
public class Problem242 {

    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        int[] m = new int[256];
        for (int i = 0; i < s.length(); i++) {
            m[s.charAt(i)]++;
            m[t.charAt(i)]--;
        }
        for (int i = 0; i < 256; i++) {
            if (m[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
