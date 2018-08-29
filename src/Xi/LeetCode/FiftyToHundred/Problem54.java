package Xi.LeetCode.FiftyToHundred;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 * <p>
 * Input: <br>
 * [<br>
 * [ 1, 2, 3 ],<br>
 * [ 4, 5, 6 ],<br>
 * [ 7, 8, 9 ]<br>
 * ]<br>
 * Output: [1,2,3,6,9,8,7,4,5]
 */
public class Problem54 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0) {
            return result;
        }
        int m = matrix.length, n = matrix[0].length;
        int rIndex = 0, cIndex = 0;
        int[] rDirection = {0, 1, 0, -1}; //定义行位移 →↓←↑
        int[] cDirection = {1, 0, -1, 0}; //定义列位移 →↓←↑

        int di = 0; //初始方向为→

        boolean[][] used = new boolean[m][n];

        for (int i = 0; i < m * n; i++) {
            result.add(matrix[rIndex][cIndex]);
            used[rIndex][cIndex] = true;

            int tempR = rIndex, tempC = cIndex;
            tempR += rDirection[di];
            tempC += cDirection[di];

            if (tempR >= 0 && tempR < m && tempC >= 0 && tempC < n && !used[tempR][tempC]) {
                rIndex = tempR;
                cIndex = tempC;
            } else {
                di = (di + 1) % 4;
                rIndex += rDirection[di];
                cIndex += cDirection[di];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{ 1, 2, 3},{ 4, 5, 6},{7, 8, 9}};
        List list = spiralOrder(matrix);
        System.out.println(list.toString());
    }
}
