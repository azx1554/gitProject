package Xi.LeetCode.TwoHundredFifty;

/**
 Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

 Example:

 Input:  [1,2,3,4]
 Output: [24,12,8,6]
 */
public class Problem238 {

    /**
     灵感题
     */
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];
        leftProduct[0] = 1; rightProduct[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            leftProduct[i] = leftProduct[i - 1] * nums[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            rightProduct[i] = rightProduct[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct[i] * rightProduct[i];
        }
        return result;
    }
}
