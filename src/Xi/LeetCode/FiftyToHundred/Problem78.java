package Xi.LeetCode.FiftyToHundred;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a set of distinct integers, nums, return all possible subsets (the power set). <br>
 * <p>
 * Input: nums = [1,2,3]<br>
 * Output:<br>
 * [<br>
 * [3],<br>
 * [1],<br>
 * [2],<br>
 * [1,2,3],<br>
 * [1,3],<br>
 * [2,3],<br>
 * [1,2],<br>
 * []<br>
 * ]
 */
public class Problem78 {

    /**
     * 这是我写的方法，想复杂了，简单的方法在subsets2中
     */
    public List<List<Integer>> subsets(int[] nums) {
        List result = new ArrayList();
        int n = nums.length;
        List tempList = new ArrayList();
        for (int i = 0; i <= n; i++) {
            backTracking(result, tempList, i, 0, nums);
        }
        return result;
    }

    private void backTracking(List result, List tempList, int size, int begin, int[] nums) {
        if (tempList.size() == size) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        /**
         * 注意这里用nums.length - (size - tempList.size()) + 1代替nums.length节省回溯次数的技巧
         */
        for (int i = begin; i < nums.length - (size - tempList.size()) + 1; i++) {
            tempList.add(nums[i]);
            backTracking(result, tempList, size, i + 1, nums);
            tempList.remove(tempList.size() - 1);
        }
    }

    public List<List<Integer>> subsets2(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
