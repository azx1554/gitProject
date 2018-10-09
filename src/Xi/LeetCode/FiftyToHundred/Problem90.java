package Xi.LeetCode.FiftyToHundred;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a collection of integers that might contain duplicates, nums, return all possible subsets (the power set).
 * <p>
 * Note: The solution set must not contain duplicate subsets.
 * <p>
 * Input: [1,2,2]<br>
 * Output:<br>
 * [<br>
 * [2],<br>
 * [1],<br>
 * [1,2,2],<br>
 * [2,2],<br>
 * [1,2],<br>
 * []<br>
 * ]
 */
public class Problem90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List result = new ArrayList();
        List tempList = new ArrayList();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backTracking(result, tempList, nums, 0, used);
        return result;
    }

    public void backTracking(List result, List tempList, int[] nums, int begin, boolean[] used) {

        result.add(new ArrayList<>(tempList));

        for (int i = begin; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i-1] && !used[i-1]) {
                //i-1位置没有用过，说明i-1位置的回溯已经完成，此时i位置的值若与i-1位置的相等，由于i-1位置的回溯已经包含了i位置的所有可能，故跳过
                continue;
            }
            used[i] = true;
            tempList.add(nums[i]);
            backTracking(result, tempList, nums, i + 1, used);
            tempList.remove(tempList.size() - 1);
            used[i] = false;
        }
    }
}
