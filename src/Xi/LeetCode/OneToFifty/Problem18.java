package Xi.LeetCode.OneToFifty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> results = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return results;
        }
        Arrays.sort(nums);
        backTracking(nums,target,results,new ArrayList<>(),0);
        return results;
    }

    public static void backTracking(int[] nums, int left, List<List<Integer>> results, List<Integer> tempList, int begin){
        if (tempList.size() > 4) {
            return;
        }
        if (left == 0 && tempList.size() == 4) {
            List<Integer> temp = new ArrayList<>(tempList);
            if (!results.contains(temp))
                results.add(temp);
            return;
        }

        for (int i = begin; i < nums.length; i++) {
            tempList.add(nums[i]);
            backTracking(nums,left-nums[i],results,tempList,i+1);
            tempList.remove(tempList.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] testArray = {1, 0, -1, 0, -2, 2};
        List<List<Integer>> list = fourSum(testArray, 0);
        for (List<Integer> temp: list){
            System.out.println(temp.toString());
        }
    }
}
