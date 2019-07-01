package Xi.LeetCode.TwoHundred;

public class Problem198 {

    public int robber(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return nums[0];
        }
        if (n == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int result[] = new int[n];
        result[0] = nums[0]; result[1] = nums[1];
        result[2] = Math.max(nums[0] + nums[2], nums[1]);
        for (int i = 3; i < n; i++) {
            int temp = Math.max(nums[i] + result[i-2], nums[i] + result[i-3]);
            result[i] = Math.max(result[i-1], temp);
        }
        return result[n-1];
    }
}
