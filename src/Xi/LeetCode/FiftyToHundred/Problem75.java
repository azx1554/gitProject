package Xi.LeetCode.FiftyToHundred;


/**
 * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 * <p>
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 * <p>
 * Input: [2,0,2,1,1,0]<br>
 * Output: [0,0,1,1,2,2]<br>
 * <p>
 * Could you come up with a one-pass algorithm using only constant space?
 */
public class Problem75 {

    public void sortColors(int[] nums) {

        int zeroIndex = 0; //记录下一个0的将要出现的位置下标
        int oneIndex = 0; //记录下一个1的将要出现的位置下标
        int twoIndex = 0; //记录下一个2的将要出现的位置下标

        //从左往右遍历数组
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) { //该位置值为0，意味着2，1，0分别要填充到下个位置,
                nums[twoIndex++] = 2;
                nums[oneIndex++] = 1;
                nums[zeroIndex++] = 0;
            }
            else if (nums[i] == 1) { //该位置值为1，意味着2，1分别要填充到下个位置,
                nums[twoIndex++] = 2;
                nums[oneIndex++] = 1;
            }
            else  if (nums[i] == 2) { //该位置值为2，意味着2要填充到下个位置,
                nums[twoIndex++] = 2;
            }
        }

    }

}
