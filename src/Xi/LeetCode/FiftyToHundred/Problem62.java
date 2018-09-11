package Xi.LeetCode.FiftyToHundred;

/**
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * <p>
 * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * <p>
 * How many possible unique paths are there? <br>
 * Input: m = 3, n = 2 <br>
 * Output: 3<br>
 * Explanation:<br>
 * From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:<br>
 * 1. Right -> Right -> Down<br>
 * 2. Right -> Down -> Right<br>
 * 3. Down -> Right -> Right
 */
public class Problem62 {

    /**
     * DynamicPlan: TimeComplexity O(n^2)
     */
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++)
            dp[i][0] = 1;
        for (int j = 0; j < n; j++)
            dp[0][j] = 1;

        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        return dp[m - 1][n - 1];
    }

    /**
     * TimeComplexity: O(2^n)，会超出时间限制
     */
    public static int backTracking(int leftM, int leftN) {
        if (leftM == 0 || leftN == 0) {
            return 1;
        }
        return backTracking(leftM - 1, leftN) + backTracking(leftM, leftN - 1);
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(51, 9));
    }
}
