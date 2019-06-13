package Xi.LeetCode.FiftyToHundred;

import Xi.LeetCode.TreeNode;

/**
 * Given two binary trees, write a function to check if they are the same or not.
 *
 * Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
 */
public class Problem100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p != null && q != null) {
            if (p.val == q.val) {
                boolean result = isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
                return result;
            } else {
                return false;
            }
        }
        return false;
    }
}
