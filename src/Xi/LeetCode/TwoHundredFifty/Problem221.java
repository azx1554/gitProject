package Xi.LeetCode.TwoHundredFifty;

/**
 Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.

 Example:

 Input:
 1 0 1 0 0
 1 0 1 1 1
 1 1 1 1 1
 1 0 0 1 0

 Output: 4
 */
public class Problem221 {

    //这样的动态规划策略比较难想
    public int maximalSquare(char[][] matrix) {
        int row = matrix.length, col = row > 0 ? matrix[0].length : 0;
        int maxsqlen  = 0;
        //dp[i][j]代表以matrix[i][j]为右下角顶点的最大正方形的边长
        int[][] dp = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == '1') {
                    dp[i][j] = 1;
                }
            }
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][j] == '1') {
                    dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]) + 1;
                    maxsqlen = Math.max(maxsqlen, dp[i][j]);
                }
            }
        }
        return maxsqlen * maxsqlen;
    }
}
