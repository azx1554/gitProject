package Xi.LeetCode.TwoHundredFifty;

/**
 Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position. Return the max sliding window.

 Example:

 Input: nums = [1,3,-1,-3,5,3,6,7], and k = 3
 Output: [3,3,5,5,6,7]

 Explanation:
 Window position                Max
 ---------------               -----
 [1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
 */
public class Problem239 {
    /**
     Memory Limit Exceeded
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) {
            return new int[]{};
        }
        int[] result = new int[n-k+1];
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = nums[i];
        }

        for (int i = 1; i < k; i++) {
            for (int j = 0; j + i < n; j++) {
                dp[j][j+i] = Math.max(dp[j][j+i-1], nums[j+i]);
            }
        }

        for (int i = 0; i + k <= n; i++) {
            result[i] = dp[i][i+k-1];
        }
        return result;
    }
}
