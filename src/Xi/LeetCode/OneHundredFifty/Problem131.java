package Xi.LeetCode.OneHundredFifty;

import java.util.ArrayList;
import java.util.List;

/**
 Given a string s, partition s such that every substring of the partition is a palindrome.

 Return all possible palindrome partitioning of s.

 Example:

 Input: "aab"
 Output:
 [
 ["aa","b"],
 ["a","a","b"]
 ]
 */
public class Problem131 {

    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return result;
        }
        int n = s.length();
        //记录下标从i到j的子串是否是回文串
        boolean[][] isPalindrome = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            isPalindrome[i][i] = true;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j + i < n; j++) {
                if (s.charAt(j) == s.charAt(j+i)) {
                    isPalindrome[j][j+i] = i == 1 ? true : isPalindrome[j+1][j+i-1];
                }
            }
        }
        backTracking(s, 0, result, new ArrayList<>(), isPalindrome);
        return result;
    }

    public void backTracking(String s, int begin, List<List<String>> result, List<String> tempList, boolean[][] isPalindrome) {
        if (begin == s.length()) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = begin; i < s.length(); i++) {
            if (isPalindrome[begin][i]) {
                tempList.add(s.substring(begin, i + 1));
                backTracking(s, i + 1, result, tempList, isPalindrome);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
