package Xi.LeetCode.OneToFifty;

/*
31.Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
The replacement must be in-place, do not allocate extra memory.
Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
1,2,3 → 1,3,2
3,2,1 → 1,2,3
1,1,5 → 1,5,1
 */
public class  Problem31 {
    public static void nextPermutation(int[] nums) {
        if (nums.length < 2)
            return;
        int index = nums.length - 1, j = nums.length - 1;
        while (index > 0) {
            if (nums[index - 1] < nums[index])
                break;
            index--;
        }

        if (index == 0) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        while (j > index -1) {
            if (nums[j] > nums[index-1]) {
                swap(nums, index-1, j);
                break;
            }
            j--;
        }
        reverse(nums, index, nums.length - 1);
    }

    public static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    public static void swap(int[] nums, int left, int right) {
        nums[left] = nums[left] + nums[right];
        nums[right] = nums[left] - nums[right];
        nums[left] = nums[left] - nums[right];
    }

    public static void main(String[] args) {
        int nums[] = {1,3,2,1};
        nextPermutation(nums);
        for (int i : nums)
            System.out.println(i);
    }
}
