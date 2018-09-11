package Xi.LeetCode.FiftyToHundred;


import java.util.Arrays;

/**
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 * <p>
 * Integers in each row are sorted from left to right. <br>
 * The first integer of each row is greater than the last integer of the previous row.
 * <p>
 * Input:<br>
 * matrix = [<br>
 * [1,   3,  5,  7],<br>
 * [10, 11, 16, 20],<br>
 * [23, 30, 34, 50]<br>
 * ]<br>
 * target = 3<br>
 * Output: true
 */
public class Problem74 {

    public static boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;

        if (m == 0)
            return false;

        int n = matrix[0].length;

        if (n == 0)
            return false;

        int low = 0, high = m - 1, mid = 0;

        boolean flag = false;
        while (low <= high && high < m) {
            mid = low + high >>> 1;
            if (matrix[mid][0] <= target && matrix[mid][n-1] >= target) {
                flag = true;
                break;
            }
            else if (matrix[mid][0] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        if (flag) {
            return Arrays.binarySearch(matrix[mid], target) >= 0;
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] array = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        System.out.println(searchMatrix(array, 3));
    }
}
