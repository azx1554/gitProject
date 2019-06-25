package Xi.LeetCode.OneHundredFifty;

import java.util.List;

/**
 Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

 Note:

 The same word in the dictionary may be reused multiple times in the segmentation.
 You may assume the dictionary does not contain duplicate words.
 Example 1:

 Input: s = "leetcode", wordDict = ["leet", "code"]
 Output: true
 Explanation: Return true because "leetcode" can be segmented as "leet code".
 Example 2:

 Input: s = "applepenapple", wordDict = ["apple", "pen"]
 Output: true
 Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
 Note that you are allowed to reuse a dictionary word.
 Example 3:

 Input: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
 Output: false
 */
public class Problem139 {

    public boolean wordBreak(String s, List<String> wordDict) {
        if (s == null || s.length() == 0) {
            return false;
        }
        //canSegmente[i]代表从subString(0,i)是否可以由list中的单词组成
        boolean[] canSegmente = new boolean[s.length() + 1];
        canSegmente[0] = true;
        for (int i = 1; i <=  s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                if (canSegmente[j] && wordDict.contains(s.substring(j, i))) {
                    canSegmente[i] = true;
                    break;
                }
            }
        }
        return canSegmente[s.length()];
    }

    /**
     * Time Limit Exceeded
     */
    public boolean backTracking(String s, int begin, List<String> wordDict) {
        if (begin == s.length()) {
            return true;
        }
        boolean result = false;
        for (int i = begin; i < s.length(); i++) {
            if (wordDict.contains(s.substring(begin, i+1))) {
                result |= backTracking(s, i+1, wordDict);
            }
            if (result) {
                return true;
            }
        }
        return false;
    }
}
