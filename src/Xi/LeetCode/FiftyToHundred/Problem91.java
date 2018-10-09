package Xi.LeetCode.FiftyToHundred;

/**
 * A message containing letters from A-Z is being encoded to numbers using the following mapping: <br>
 * 'A' -> 1<br>
 * 'B' -> 2<br>
 * ...<br>
 * 'Z' -> 26<br>
 * Given a non-empty string containing only digits, determine the total number of ways to decode it.<br>
 * <p>
 * Input: "12"<br>
 * Output: 2<br>
 * Explanation: It could be decoded as "AB" (1 2) or "L" (12).<br>
 * <p>
 * Input: "12120"<br>
 * Output: 3<br>
 * Explanation: It could be decoded as (1 2 1 20), (12 1 20), or (1 21 20).
 */
public class Problem91 {

    /**
     * 这是我找的动态规划策略，与高手之间还是有差距啊
     */
    public static int numDecodings(String s) {
        if (s.charAt(0) == '0')
            return 0;
        int[] result = new int[s.length()];
        result[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            int prev = Character.getNumericValue(s.charAt(i - 1));
            int cur = Character.getNumericValue(s.charAt(i));
            if (cur == 0) {
                if (prev == 1 || prev == 2) {
                    result[i] = result[i - 1] == 1 ? 1 : result[i - 2];
                } else {
                    return 0;
                }
            } else if (prev > 2 || prev == 0) {
                result[i] = result[i - 1];
            } else {
                if (prev == 2 && cur > 6) {
                    result[i] = result[i - 1];
                } else {
                    result[i] = i == 1 ? result[i - 1] + 1 : result[i - 1] + result[i - 2];
                }
            }
        }
        return result[s.length() - 1];
    }

    public int numDecodings2(String s) {
        int n = s.length();
        if (n == 0) return 0;

        //memo记录了从n位置到最后一位子串能出现的情况总和数
        int[] memo = new int[n + 1];
        memo[n] = 1;
        memo[n - 1] = s.charAt(n - 1) != '0' ? 1 : 0;

        for (int i = n - 2; i >= 0; i--)
            if (s.charAt(i) == '0') continue;
            else memo[i] = (Integer.parseInt(s.substring(i, i + 2)) <= 26) ? memo[i + 1] + memo[i + 2] : memo[i + 1];

        return memo[0];
    }

}
