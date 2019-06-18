package Xi.LeetCode.OneHundredFifty;

import Xi.LeetCode.TreeNode;

import java.util.*;

/**
 * Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).
 */
public class Problem103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return result;
        }
        queue.add(root);
        int curLevelCount = 1;
        int count = 0;
        boolean isLeftToRight = true;
        while (!queue.isEmpty()) {
            List<Integer> levelOrder = new ArrayList<>();
            while (curLevelCount > 0) {
                TreeNode node = queue.poll();
                levelOrder.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                    count++;
                }
                if (node.right != null) {
                    queue.add(node.right);
                    count++;
                }
                curLevelCount--;
            }
            if (!isLeftToRight) {
                Collections.reverse(levelOrder);
            }
            result.add(levelOrder);
            curLevelCount = count;
            count = 0;
            isLeftToRight = !isLeftToRight;
        }
        return result;
    }
}
