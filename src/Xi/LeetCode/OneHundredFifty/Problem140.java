package Xi.LeetCode.OneHundredFifty;

import java.util.ArrayList;
import java.util.List;

/**
 Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, add spaces in s to construct a sentence where each word is a valid dictionary word. Return all such possible sentences.

 Note:

 The same word in the dictionary may be reused multiple times in the segmentation.
 You may assume the dictionary does not contain duplicate words.
 Example 1:

 Input:
 s = "catsanddog"
 wordDict = ["cat", "cats", "and", "sand", "dog"]
 Output:
 [
 "cats and dog",
 "cat sand dog"
 ]
 Example 2:

 Input:
 s = "pineapplepenapple"
 wordDict = ["apple", "pen", "applepen", "pine", "pineapple"]
 Output:
 [
 "pine apple pen apple",
 "pineapple pen apple",
 "pine applepen apple"
 ]
 Explanation: Note that you are allowed to reuse a dictionary word.
 Example 3:

 Input:
 s = "catsandog"
 wordDict = ["cats", "dog", "sand", "and", "cat"]
 Output:
 []
 */
public class Problem140 {
    /**
     * 自己做的超时了，还没看答案
     */
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> result = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return result;
        }
        DFS(s, 0, wordDict, "", result);
        return result;
    }

    /**
     * Time Limit Exceeded
     */
    public void DFS(String s, int begin, List<String> wordDict, String tempString, List<String> result) {
        if (begin == s.length()) {
            result.add(tempString);
            return;
        }
        for (int i = begin; i < s.length(); i++) {
            String str = s.substring(begin, i+1);
            if (wordDict.contains(str)) {
                String originStr = tempString;
                tempString += str;
                if (i + 1 != s.length()) {
                    tempString += " ";
                }
                DFS(s, i+1, wordDict, tempString, result);
                tempString = originStr;
            }
        }
    }
}
