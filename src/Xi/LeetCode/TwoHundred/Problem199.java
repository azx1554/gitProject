package Xi.LeetCode.TwoHundred;

import Xi.LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

 Example:
 Input: [1,2,3,null,5,null,4]
 Output: [1, 3, 4]
 Explanation:

 1            <---
 /   \
 2     3         <---
 \     \
 5     4       <---
 */
public class Problem199 {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        int nextLevelCount = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int tempNextCount = 0;
            for (int i = nextLevelCount; i > 0; i--) {
                TreeNode temp = queue.poll();
                if (i == 1) {
                    result.add(temp.val);
                }
                if (temp.left != null) {
                    queue.add(temp.left);
                    tempNextCount++;
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                    tempNextCount++;
                }
            }
            nextLevelCount = tempNextCount;
        }
        return result;
    }

}
