package Xi.LeetCode.TwoHundredFifty;

/**
 Given two strings s and t, determine if they are isomorphic.

 Two strings are isomorphic if the characters in s can be replaced to get t.

 All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

 Example 1:
 Input: s = "egg", t = "add"
 Output: true

 Example 2:
 Input: s = "foo", t = "bar"
 Output: false

 Example 3:
 Input: s = "paper", t = "title"
 Output: true
 */
public class Problem205 {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] m = new int[256], n = new int[256];
        for (int i = 0; i < s.length(); i++) {
            //注: m['a'] = m[97]
            //例: egg和add m['e'] = n['a'] = 1, m['g'] = n['d'] = 2,这里相当于用了map记了每个字母的位置和出现次数
            if (m[s.charAt(i)] != n[t.charAt(i)]) {
                return false;
            }
            m[s.charAt(i)] = n[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
