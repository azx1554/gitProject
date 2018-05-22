package Xi.LeetCode.OneToFifty;

/*
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.
 */

public class Problem35 {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0;
        while (nums[i] < target) {
            i++;
            if (i == nums.length) {
                break;
            }
        }
        return i;
    }
}
