package Xi.LeetCode.OneToFifty;

import java.util.ArrayList;
import java.util.List;

public class Problem46 {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        backTrace(nums, result, tempList, 0);
        return result;
    }

    public static void backTrace(int[] nums, List<List<Integer>> result, List<Integer> tempList, int index) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        }

        for (int i = 0; i < nums.length; i++) {
            if (tempList.contains(nums[i])) {
                continue;
            }
            tempList.add(nums[i]);
            backTrace(nums, result, tempList, index+1);
            tempList.remove(tempList.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> result = permute(nums);
        for (List tempList : result) {
            System.out.println(tempList.get(1));
        }
    }
}
