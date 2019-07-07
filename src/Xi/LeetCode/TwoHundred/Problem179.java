package Xi.LeetCode.TwoHundred;

/**
 Given a list of non negative integers, arrange them such that they form the largest number.

 Example 1:
 Input: [10,2]
 Output: "210"

 Example 2:
 Input: [3,30,34,5,9]
 Output: "9534330"
 */
public class Problem179 {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        quickSort(strs, 0, nums.length - 1);
        if ("0".equals(strs[nums.length - 1])) {
            return "0";
        }
        String result = "";
        for (int i = nums.length - 1; i >= 0; i--) {
            result += strs[i];
        }
        return result;
    }

    public void quickSort(String[] strs, int begin, int end) {
        if (begin >= end) {
            return;
        }
        String key = strs[begin];
        int left = begin, right = end;
        while (left < right) {
            while (compare(strs[right], key) && left < right) {
                right--;
            }
            if (left < right) {
                strs[left] = strs[right];
                left++;
            }
            while (compare(key, strs[left]) && left < right) {
                left++;
            }
            if (left < right) {
                strs[right] = strs[left];
                right--;
            }
        }
        strs[left] = key;
        quickSort(strs, begin, left - 1);
        quickSort(strs, right + 1, end);
    }

    public boolean compare(String a, String b) {
        if ((a + b).compareTo(b + a) >= 0) {
            return true;
        } else {
            return false;
        }
    }
}
