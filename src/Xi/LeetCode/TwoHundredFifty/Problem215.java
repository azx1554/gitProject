package Xi.LeetCode.TwoHundredFifty;

/**
 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。

 示例 1:

 输入: [3,2,1,5,6,4] 和 k = 2
 输出: 5
 示例 2:

 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 输出: 4

 说明:
 你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。
 */
public class Problem215 {

    public int findKthLargest(int[] nums, int k) {
        quickSort(nums, k, 0, nums.length - 1);
        return nums[nums.length - k];
    }

    public void quickSort(int[] nums, int k, int low, int high) {
        if (low >= high) {
            return;
        }
        int begin = low, end = high;
        int key = nums[begin];
        while (begin < end) {
            while (nums[end] >= key && begin < end) {
                end--;
            }
            if (begin < end) {
                nums[begin] = nums[end];
                begin++;
            }
            while (nums[begin] <= key && begin < end) {
                begin++;
            }
            if (begin < end) {
                nums[end] = nums[begin];
                end--;
            }
        }
        nums[begin] = key;
        if (begin == nums.length - k) {
            return;
        } else if (begin < nums.length - k) {
            quickSort(nums, k, begin + 1, high);
        } else {
            quickSort(nums, k, low, begin - 1);
        }
    }
}
