package Xi.LeetCode.FiftyToHundred;

/**
 * Given a positive integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
 * <p>
 * Input: 3 <br>
 * Output: <br>
 * [ <br>
 * [ 1, 2, 3 ], <br>
 * [ 8, 9, 4 ], <br>
 * [ 7, 6, 5 ] <br>
 * ]
 */
public class Problem59 {

    public int[][] generateMatrix(int n) {

        int[][] result = new int[n][n];
        boolean[][] used = new boolean[n][n];

        int[] rDirection = {0, 1, 0, -1};
        int[] cDirection = {1, 0, -1, 0};

        int rIndex = 0, cIndex = 0, di = 0;

        for (int i = 1; i <= n * n; i++) {
            result[rIndex][cIndex] = i;
            used[rIndex][cIndex] = true;

            int tempR = rIndex + rDirection[di];
            int tempC = cIndex + cDirection[di];

            if (tempR >= 0 && tempR < n && tempC >= 0 && tempC < n && !used[tempR][tempC]) {
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


}
