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
     * 设G(n)表示1 ... n可组成的BST个数，F(i,n)表示1 ... n可组成的以i为根节点的BST个数
     *
     * 则所求结果即为G(n)
     *
     * 由题意显然有G(n) = ∑(i从1到n) F(i,n)
     * 而F(i,n) = (1 ... i-1可组成的BST个数) * (i+1 ... n可组成的BST个数) = G(i-1) * G(n-i)
     * 得G(n) = ∑(i从1到n) G(i-1) * G(n-i)
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
