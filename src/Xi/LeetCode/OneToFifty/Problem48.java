package Xi.LeetCode.OneToFifty;

/**
 * You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise).
 * <p>
 * Given input matrix = <br>
 * [<br>
 * [1,2,3],<br>
 * [4,5,6],<br>
 * [7,8,9]<br>
 * ],<br>
 * <p>
 * rotate the input matrix in-place such that it becomes:<br>
 * [<br>
 * [7,4,1],<br>
 * [8,5,2],<br>
 * [9,6,3]<br>
 * ]
 */
public class Problem48 {

    /**
     * 先上下翻转，再按y=-x做轴对称变换
     *
     * 逆时针是先左右翻转，再按y=-x做轴对称变换
     * @param matrix
     */
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int i = 0, j = n - 1;
        while (i < j) {
            for (int k = 0; k < n; k++) {
                int temp = matrix[i][k];
                matrix[i][k] = matrix[j][k];
                matrix[j][k] = temp;
            }
            i++;j--;
        }

        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {{ 5, 1, 9,11},{ 2, 4, 8,10},{13, 3, 6, 7},{15,14,12,16}};
        rotate(matrix);
        for (int[] a : matrix) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
