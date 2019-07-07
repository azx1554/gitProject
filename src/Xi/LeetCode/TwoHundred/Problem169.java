package Xi.LeetCode.TwoHundred;

/**
 Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

 You may assume that the array is non-empty and the majority element always exist in the array.

 Example 1:
 Input: [3,2,3]
 Output: 3
 Example 2:

 Input: [2,2,1,1,1,2,2]
 Output: 2
 */
public class Problem169 {
    /**
     * 如果一个数出现的次数超过数组一半的长度，那么就是说出现的次数比其他所有数字出现的次数还要多。因此我们可以考虑保存2个值，一个是数组中的一个数，一个是数的次数。
     * 当我们遍历到下一个数字的时候，如果下一个数字和我们之前保存的数字相同，则次数加1，如果不同则次数减1。如果次数为0了这保存当前遍历到的数，并把次数设为1。遍历完整个数组之后，返回当前保存的数字，即是我们要找的数字。
     */
    public int majorityElement(int[] nums) {
        int result = nums[0];
        int times = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == result) {
                times++;
            } else {
                times--;
            }
            if (times == 0) {
                result = nums[i];
                times = 1;
            }
        }
        return result;
    }
}
