package Xi.LeetCode.FiftyToHundred;

import java.util.ArrayList;
import java.util.List;

/**
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.<br>
 * Input: n = 4, k = 2<br>
 * Output:<br>
 * [<br>
 * [2,4],<br>
 * [3,4],<br>
 * [2,3],<br>
 * [1,2],<br>
 * [1,3],<br>
 * [1,4],<br>
 * ]
 */
public class Problem77 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        backTracking(result, tempList, n, 1, k);
        return result;
    }

    public void backTracking(List result, List tempList, int n, int begin, int k) {

        if (tempList.size() == k) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        /**
         * 主意这里用n -(k - tempList.size()) + 1代替n可以节省大量不必要的时间
         */
        for (int i = begin; i <= n -(k - tempList.size()) + 1; i++) {
            tempList.add(i);
            backTracking(result, tempList, n, i+1, k);
            tempList.remove(tempList.size()-1);
        }
    }

}
