package Xi.LeetCode.OneToFifty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Xi on 2018/8/17.
 */
public class Problem47 {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        Arrays.sort(nums);
        backTracking(result, tempList, nums, new boolean[nums.length]);
        return result;
    }

    public static void backTracking(List<List<Integer>> result, List<Integer> tempList, int[] nums, boolean[] used) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue;
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) // !user[i-1]的作用是在前面一位用过的情况下不跳过当前位
                continue;
            used[i] = true;
            tempList.add(nums[i]);
            backTracking(result, tempList, nums, used);
            used[i] = false;
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 0, 3};
        List<List<Integer>> result = permuteUnique(nums);
        for (List list : result) {
            System.out.println(list.toString());
        }
    }
}
