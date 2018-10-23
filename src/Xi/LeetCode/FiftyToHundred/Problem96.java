package Xi.LeetCode.FiftyToHundred;

/**
 * Given n, how many structurally unique BST's (binary search trees) that store values 1 ... n?<br>
 * <p>
 * Example:
 * <p>
 * Input: 3<br>
 * Output: 5<br>
 * Explanation:<br>
 * Given n = 3, there are a total of 5 unique BST's:<br>
 * <p>
 * 1         3     3      2      1<br>
 *  \       /     /      / \      \<br>
 *   3     2     1      1   3      2<br>
 *  /     /       \                 \<br>
 * 2     1         2                 3
 *
 */

public class Problem96 {

    /**
     * 动态规划算法：
     *
     */
    public int numTrees(int n) {
        int[] G = new int[n+1];
        G[0] = 1;
        G[1] = 1;

        for (int i = 2; i < G.length; i++) {
            for (int j = 1; j <= i; j++) {
                G[i] += G[j-1] * G[i-j];
            }
        }
        return G[n];
    }
}
