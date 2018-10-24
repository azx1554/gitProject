package Xi.LeetCode.OneHundredFifty;

import Xi.LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 */
public class Problem102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List result = new ArrayList();
        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int currentLevelSize = 1;
        while (!queue.isEmpty()) {
            List<Integer> levelList = new ArrayList<>();
            int temp = 0;
            for (int i = 0; i < currentLevelSize; i++) {
                TreeNode node = queue.remove();
                levelList.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                    temp++;
                }
                if (node.right != null) {
                    queue.add(node.right);
                    temp++;
                }
            }
            currentLevelSize = temp;
            result.add(levelList);
        }
        return result;
    }

    /**
     * 层序遍历到一个list中
     */
    public List<Integer> levelOrderToOneList(TreeNode root) {
        List result = new ArrayList();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (queue.peek() != null) {
            TreeNode node = queue.remove();
            result.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return result;
    }
}
