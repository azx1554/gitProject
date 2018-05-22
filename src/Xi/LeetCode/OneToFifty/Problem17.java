package Xi.LeetCode.OneToFifty;

import java.util.LinkedList;
import java.util.List;

/*
17. Letter Combinations of a Phone Number
Given a digit string, return all possible letter combinations that the number could represent.
A mapping of digit to letters (just like on the telephone buttons) is given below.

Input:Digit string "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */
public class Problem17 {

    public static List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<>();
        if (digits.length() < 1) {
            return result;
        }
        String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        result.add("");
        for (int i = 0; i < digits.length(); i++) {
            int x = Character.getNumericValue(digits.charAt(i));
            String str = mapping[x];
            while (result.peek().length() < i + 1) {
                String temp = result.remove();
                for (int j = 0; j < str.length(); j++) {
                    result.add(temp + str.charAt(j));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> list = letterCombinations("234");
        for (String s : list) {
            System.out.println(s);
        }
    }

}
