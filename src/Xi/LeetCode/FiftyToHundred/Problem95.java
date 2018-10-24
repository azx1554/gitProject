package Xi.LeetCode.FiftyToHundred;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer n, generate all structurally unique BST's (binary search trees) that store values 1 ... n.
 * <p>
 * Example:
 * <p>
 * Input: 3<br>
 * Output:<br>
 * [<br>
 * [1,null,3,2],<br>
 * [3,2,null,1],<br>
 * [3,1,null,null,2],<br>
 * [2,1,3],<br>
 * [1,null,2,null,3]<br>
 * ]<br>
 * Explanation:<br>
 * The above output corresponds to the 5 unique BST's shown below:<br>
 * <p>
 * 1         3     3      2      1 <br>
 * \       /     /      / \      \<br>
 * 3     2     1      1   3      2<br>
 * /     /       \                 \<br>
 * 2     1         2                 3<br>
 */
public class Problem95 {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0)
            return new ArrayList<>();
        return genTrees(1, n);
    }

    /**
     * 递归算法
     */
    public List<TreeNode> genTrees(int start, int end) {
        List<TreeNode> list = new ArrayList<>();

        if (start < end) {
            list.add(null);
            return list;
        }

        if (start == end) {
            list.add(new TreeNode(start));
            return list;
        }

        for (int i = start; i <= end; i++) {
            List<TreeNode> left = genTrees(start, i - 1);
            List<TreeNode> right = genTrees(i + 1, end);
            for (TreeNode lNode : left) {
                for (TreeNode rNode : right) {
                    TreeNode root = new TreeNode(i);
                    root.left = lNode;
                    root.right = rNode;
                    list.add(root);
                }
            }
        }
        return list;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
