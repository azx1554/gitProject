package Xi.LeetCode.FiftyToHundred;

/**
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * <p>
 * Each element in the array represents your maximum jump length at that position.
 * <p>
 * Determine if you are able to reach the last index.
 * <p>
 * Input: [2,3,1,1,4] <br>
 * Output: true<br>
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 */
public class Problem55 {

    public boolean canJump(int[] nums) {

        if (nums.length <= 1) {
            return false;
        }

        boolean[] boo = new boolean[nums.length];

        int n = nums.length;

        boo[n - 1] = true;

        for (int i = n - 2; i >=0; i--) {

            for (int j = 1; j <= nums[i] && i+j < n; j++) {

                if (boo[i + j]) {
                    boo[i] = true;
                }

            }
        }
        return boo[0];
    }

    public static boolean recursive(int[] nums, int index) {
        if (nums[index] + index >= nums.length - 1)
            return true;
        int maxStep = nums[index];
        for (int i = maxStep; i >= 1; i--) {
            boolean b = recursive(nums, index + i);
            if (b) {
                return true;
            }
        }
        return false;
    }

    //这里观察到假如有两个位置都能到达数组最后，前面的位置也可以到达后面的位置，利用这个性质可使用贪心算法
    public boolean greedyWay(int[] nums) {
        int accessToLast = nums.length - 1; //记录能到达数组最后的下标

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] + i >= accessToLast) {
                accessToLast = i;
            }
        }

        return accessToLast == 0;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,0,0};
        recursive(nums, 0);
    }
}
