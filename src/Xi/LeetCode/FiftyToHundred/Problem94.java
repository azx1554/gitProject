package Xi.LeetCode.FiftyToHundred;

import Xi.LeetCode.TreeNode;

import java.util.*;

/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
 *
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 */
public class Problem94 {


    /**
    依据前序遍历的顺序，优先訪问根结点。然后在訪问左子树和右子树。所以。对于随意结点node。第一部分即直接訪问之，之后在推断左子树是否为空，不为空时即反复上面的步骤，直到其为空。若为空。则须要訪问右子树。注意。在訪问过左孩子之后。须要反过来訪问其右孩子。所以，需要栈这样的数据结构的支持。对于随意一个结点node，详细过程例如以下：

    a)訪问之，并把结点node入栈。当前结点置为左孩子；

    b)推断结点node是否为空，若为空。则取出栈顶结点并出栈，将右孩子置为当前结点；否则反复a)步直到当前结点为空或者栈为空（能够发现栈中的结点就是为了訪问右孩子才存储的）
     */
    public List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode pNode = root;
        while (pNode != null || !stack.empty()) {
            if (pNode != null) {
                stack.push(pNode);
                result.add(pNode.val);
                pNode = pNode.left;
            } else {
                pNode = stack.pop();
                pNode = pNode.right;
            }
        }
        return result;
    }

    /**
     * 有了上面前序的解释，中序也就比較简单了。同样的道理。仅仅只是訪问的顺序移到出栈时
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode pNode = root;
        while (pNode != null || !stack.empty()) {
            if (pNode != null) {
                stack.push(pNode);
                pNode = pNode.left;
            } else {
                pNode = stack.pop();
                result.add(pNode.val);
                pNode = pNode.right;
            }
        }
        return result;
    }

    /**
     * 后序遍历的非递归实现是三种遍历方式中最难的一种。由于在后序遍历中，要保证左孩子和右孩子都已被訪问而且左孩子在右孩子前訪问才干訪问根结点，这就为流程的控制带来了难题。
     *
     * 要保证根结点在左孩子和右孩子訪问之后才能訪问，因此对于任一结点P。先将其入栈。假设P不存在左孩子和右孩子。则能够直接訪问它；或者P存在左孩子或者右孩子。可是其左孩子和右孩子都已被訪问过了。
     * 则相同能够直接訪问该结点。若非上述两种情况。则将P的右孩子和左孩子依次入栈。这样就保证了每次取栈顶元素的时候，左孩子在右孩子前面被訪问。左孩子和右孩子都在根结点前面被訪问。
     */
    public List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode cur = root;
        //记录上一次访问的节点
        TreeNode pre = null;
        stack.push(root);
        while (!stack.empty()) {
            cur = stack.peek();
            boolean isCurrentCanPop =  (cur.left == null && cur.right == null) || (pre != null && (cur.left == pre || cur.right == pre) );
            if (isCurrentCanPop) {
                result.add(cur.val);
                stack.pop();
            } else {
                if (cur.right != null) {
                    stack.push(cur.right);
                }
                if (cur.left != null) {
                    stack.push(cur.left);
                }
            }
            pre = cur;
        }
        return result;
    }

    public List<Integer> levelTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode pNode = queue.poll();
            result.add(pNode.val);
            if (pNode.left != null) {
                queue.offer(pNode.left);
            }
            if (pNode.right != null) {
                queue.offer(pNode.right);
            }
        }
        return result;
    }
}
