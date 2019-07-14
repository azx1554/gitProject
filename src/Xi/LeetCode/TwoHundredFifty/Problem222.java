package Xi.LeetCode.TwoHundredFifty;

import Xi.LeetCode.TreeNode;

/**
 给出一个完全二叉树，求出该树的节点个数。

 说明：

 完全二叉树的定义如下：在完全二叉树中，除了最底层节点可能没填满外，其余每层节点数都达到最大值，并且最下面一层的节点都集中在该层最左边的若干位置。若最底层为第 h 层，则该层包含 1~ 2h 个节点。

 示例:

 输入:
 1
 / \
 2   3
 / \  /
 4  5 6

 输出: 6
 */
public class Problem222 {

    /**
     递归策略：先计算完全二叉树的高，然后当root的右孩子高度等于h-1时，说明最后一个叶子节点处于右子树，此时加上左子树和根节点的节点数量，再递归右子树
     */
    public int countNodes(TreeNode root) {
        int result = 0;
        TreeNode node = root;
        int h = calHeight(node);
        while (node != null) {
            if (calHeight(node.right) == h - 1) {
                //一个完全满二叉树的节点数量为2的高度次方减1，由于要再加上上层根节点，所以这里加上2的h-1次方
                result += 1 << h - 1;
                node = node.right;
            } else {
                result += 1 << h - 2;
                node = node.left;
            }
            h--;
        }
        return result;
    }


    public int calHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return calHeight(root.left) + 1;
    }
}
