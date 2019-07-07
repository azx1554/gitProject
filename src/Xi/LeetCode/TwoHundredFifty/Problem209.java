package Xi.LeetCode.TwoHundredFifty;

/**
 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续子数组。如果不存在符合条件的连续子数组，返回 0。

 示例: 

 输入: s = 7, nums = [2,3,1,2,4,3]
 输出: 2
 解释: 子数组 [4,3] 是该条件下的长度最小的连续子数组。

 */
public class Problem209 {

    /**
     滑动窗口变式，初始两个指针都在最左边，逐个往右滑
     */
    public static int minSubArrayLen(int s, int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int result = Integer.MAX_VALUE;
        int left = 0, right = 0, temp = 0;
        while (right < n && left <= right) {
            temp += nums[right];
            if (temp >= s) {
                if (right - left + 1 < result) {
                    result = right - left + 1;
                }
                temp = temp - nums[left] - nums[right];
                left++;
            } else {
                right++;
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }
}
