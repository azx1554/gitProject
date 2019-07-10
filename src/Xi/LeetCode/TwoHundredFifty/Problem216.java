package Xi.LeetCode.TwoHundredFifty;

import java.util.ArrayList;
import java.util.List;

/**
 Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.

 Note:
 All numbers will be positive integers.
 The solution set must not contain duplicate combinations.

 Example 1:
 Input: k = 3, n = 7
 Output: [[1,2,4]]

 Example 2:
 Input: k = 3, n = 9
 Output: [[1,2,6], [1,3,5], [2,3,4]]
 */
public class Problem216 {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        if (k > 9) {
            return result;
        }
        backTracking(k, n, 1, result, new ArrayList<>());
        return result;
    }

    public void backTracking(int leftK, int leftSum, int begin, List<List<Integer>> result, List<Integer> tempList) {
        if (leftK == 0) {
            if (leftSum == 0) {
                result.add(new ArrayList<>(tempList));
            }
            return;
        }
        //因为一共只有9个数，所以i的最大值不能超过10-left，超过后数的数量就不够了，同时判断leftSum-i是否大于0来减少循环次数
        for (int i = begin; i <= 10 - leftK && leftSum - i >= 0; i++) {
            tempList.add(i);
            backTracking(leftK-1, leftSum - i, i+1, result, tempList);
            tempList.remove(tempList.size() - 1);
        }
    }
}
