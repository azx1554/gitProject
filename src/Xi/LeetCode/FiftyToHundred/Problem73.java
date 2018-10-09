package Xi.LeetCode.FiftyToHundred;

/**
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.
 * <p>
 * Input: <br>
 * [<br>
 * [1,1,1],<br>
 * [1,0,1],<br>
 * [1,1,1]<br>
 * ]<br>
 * Output:<br>
 * [<br>
 * [1,0,1],<br>
 * [0,0,0],<br>
 * [1,0,1]<br>
 * ]
 * <p>
 * Input:<br>
 * [<br>
 * [0,1,2,0],<br>
 * [3,4,5,2],<br>
 * [1,3,1,5]<br>
 * ]<br>
 * Output:<br>
 * [<br>
 * [0,0,0,0],<br>
 * [0,4,5,0],<br>
 * [0,3,1,0]<br>
 * ]
 */
public class Problem73 {
    /**
     * Could you devise a constant space solution?
     *
     * 这种方式使用了技巧减少了循环，比较难理解也很难想到，建议能写出第二种方式就好
     * @param matrix
     */
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;

        boolean firstColumnHasZero = false;

        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                firstColumnHasZero = true;
            }
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;
            }
        }

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
            if (firstColumnHasZero) {
                matrix[i][0] = 0;
            }
        }

    }

    /**
     * 这种方式更好理解
     *
     * 第一遍遍历数组，遇到0的数字把该位置到第一行与第一列投影的位置设为0，
     * 第二遍遍历数组，如果某位置在第一个行或第一列投影位置有0存在，则把该位置设为0
     * @param matrix
     */
    public void setZeroes2(int[][] matrix) {
        boolean firstRowHasZero = false,firstColumnHasZero = false;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    if(i == 0) firstRowHasZero = true;
                    if(j == 0) firstColumnHasZero = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for(int i = 1; i < matrix.length; i++) {
            for(int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if(firstRowHasZero) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
        if(firstColumnHasZero) {
            for(int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }

    }
}
