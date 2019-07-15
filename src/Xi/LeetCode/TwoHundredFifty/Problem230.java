package Xi.LeetCode.TwoHundredFifty;

import Xi.LeetCode.TreeNode;

import java.util.LinkedList;

/**
 Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

 Note:
 You may assume k is always valid, 1 ≤ k ≤ BST's total elements.

 Example 1:

 Input: root = [3,1,4,null,2], k = 1
  3
 / \
 1  4
 \
 2
 Output: 1
 Example 2:

 Input: root = [5,3,6,2,4,null,null,1], k = 3
    5
   / \
  3   6
 / \
 2  4
 /
 1
 Output: 3
 */
public class Problem230 {
    /**
     *递归策略就中序遍历二叉树，得出的序列就是升序的，然后可轻易得到第k小的数。迭代的方法不用访问到所有节点，效率相比略高
     */
    public int kthSmallest(TreeNode root, int k) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        while (true) {
            while (root != null) {
                stack.add(root);
                root = root.left;
            }
            root = stack.removeLast();
            if (--k == 0) return root.val;
            root = root.right;
        }
    }
}
