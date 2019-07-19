package Xi.LeetCode.TwoHundredFifty;

import Xi.LeetCode.TreeNode;

/**
 Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

 According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).
 */
public class Problem236 {
    private TreeNode ans;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Traverse the tree
        this.recurseTree(root, p, q);
        return this.ans;
    }

    /**
     从根节点开始遍历树。
     如果当前节点本身是p或q中的一个，我们将变量mid标记为True并继续搜索左右分支中的另一个节点。
     如果左侧或右侧分支中的任何一个返回True，则表示下面找到了两个节点中的一个。
     如果在遍历中的任何一点，左，右或中三个标志中的任何两个变为真，这意味着当前节点为节点p和q的最低共同祖先。
     */
    private boolean recurseTree(TreeNode currentNode, TreeNode p, TreeNode q) {
        // If reached the end of a branch, return false.
        if (currentNode == null) {
            return false;
        }

        // Left Recursion. If left recursion returns true, set left = 1 else 0
        int left = this.recurseTree(currentNode.left, p, q) ? 1 : 0;

        // Right Recursion
        int right = this.recurseTree(currentNode.right, p, q) ? 1 : 0;

        // If the current node is one of p or q
        int mid = (currentNode == p || currentNode == q) ? 1 : 0;

        // If any two of the flags left,  right or mid become True
        if (mid + left + right >= 2) {
            this.ans = currentNode;
        }

        // Return true if any one of the three bool values is True.
        return (mid + left + right > 0);
    }
}
