package Xi.LeetCode.FiftyToHundred;

import Xi.LeetCode.TreeNode;

/**
 * Given a binary tree, determine if it is a valid binary search tree (BST).<br>
 * <p>
 * Assume a BST is defined as follows:
 * <p>
 * The left subtree of a node contains only nodes with keys less than the node's key.<br>
 * The right subtree of a node contains only nodes with keys greater than the node's key.<br>
 * Both the left and right subtrees must also be binary search trees.<br>
 */
public class Problem98 {

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, long minVal, long maxVal) {
        if (root == null) {
            return true;
        }

        if (root.val <= minVal || root.val >= maxVal) {
            return false;
        }

        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);

    }
}
