package Xi.LeetCode.FiftyToHundred;

/**
 * Input: <br>
 * [<br>
 * [0,0,0],<br>
 * [0,1,0],<br>
 * [0,0,0]<br>
 * ]<br>
 * Output: 2<br>
 * Explanation:<br>
 * There is one obstacle in the middle of the 3x3 grid above.<br>
 * There are two ways to reach the bottom-right corner:<br>
 * 1. Right -> Right -> Down -> Down<br>
 * 2. Down -> Down -> Right -> Right
 */
public class Problem63 {

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];

        if (obstacleGrid[0][0] == 1)
            return 0;
        else
            dp[0][0] = 1;

        for (int i = 1; i < m; i++) {
            if (obstacleGrid[i-1][0] == 1 || dp[i-1][0] == 0)
                dp[i][0] = 0;
            else
                dp[i][0] = obstacleGrid[i][0] == 0 ? 1 : 0;
        }

        for (int j = 1; j < n; j++) {
            if (obstacleGrid[0][j-1] == 1 || dp[0][j-1] == 0)
                dp[0][j] = 0;
            else
                dp[0][j] = obstacleGrid[0][j] == 0 ? 1 : 0;
        }


        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                } else {
                    dp[i][j] = 0;
                }

            }
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int[][] a= new int[][]{{0,1,0,0},{1,0,0,0},{0,0,0,0},{0,0,0,0}};

        uniquePathsWithObstacles(a);
    }
}
