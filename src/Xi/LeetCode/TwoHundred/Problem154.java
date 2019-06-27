package Xi.LeetCode.TwoHundred;

public class Problem154 {

    public int findMin(int[] nums) {
        int n = nums.length;
        if (nums == null || n == 0) {
            return 0;
        }
        if (n == 1) {
            return nums[0];
        }
        return findMinBinarySearch(nums, 0, n - 1);
    }

    public int findMinBinarySearch(int nums[], int begin, int end) {
        int left = begin, right = end, mid;
        while (left+1 != right) {
            mid = left + right >>> 1;
            if (nums[left] == nums[mid] && nums[mid] == nums[right] ) {
                return Math.min(findMinBinarySearch(nums, left, mid), findMinBinarySearch(nums, mid, right));
            } else if (nums[left] > nums[mid] || nums[mid] == nums[right]) {
                right = mid;
            } else if (nums[mid] > nums[right] || nums[left] == nums[mid]) {
                left = mid;
            } else {
                return nums[left];
            }
        }
        return Math.min(nums[left], nums[right]);
    }
}
