package Xi.LeetCode.OneHundredFifty;

import java.util.List;

/**
 * Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.
 * <p>
 * For example, given the following triangle
 * <p>
 * [ <br>
 *    [2], <br>
 *   [3,4], <br>
 *  [6,5,7], <br>
 * [4,1,8,3] <br>
 * ] <br>
 * The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
 */
public class Problem120 {

    /**
     * DP(bottom-up)
     */
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return triangle.get(0).get(0);
        }
        //result[k][i]代表第k行第i处的从下至上的最短路径
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            result[n-1][i] = triangle.get(n-1).get(i);
        }
        for (int k = n-2; k >=0; k--) {
            List<Integer> tempList = triangle.get(k);
            for (int i = 0; i < tempList.size(); i++) {
                result[k][i] = Math.min(result[k+1][i], result[k+1][i+1]) + tempList.get(i);
            }
        }
        return result[0][0];
    }
}
