package Xi.LeetCode.OneHundredFifty;

import Xi.LeetCode.TreeNode;

/**
 Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

 An example is the root-to-leaf path 1->2->3 which represents the number 123.

 Find the total sum of all root-to-leaf numbers.

 Note: A leaf is a node with no children.

 Example:

 Input: [1,2,3]
  1
 / \
 2   3
 Output: 25
 Explanation:
 The root-to-leaf path 1->2 represents the number 12.
 The root-to-leaf path 1->3 represents the number 13.
 Therefore, sum = 12 + 13 = 25.
 Example 2:

 Input: [4,9,0,5,1]
  4
 / \
 9  0
/ \
5  1
 Output: 1026
 Explanation:
 The root-to-leaf path 4->9->5 represents the number 495.
 The root-to-leaf path 4->9->1 represents the number 491.
 The root-to-leaf path 4->0 represents the number 40.
 Therefore, sum = 495 + 491 + 40 = 1026.
 */
public class Problem129 {
    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return root.val;
        }
        return calSum(root.left, root.val, 0) + calSum(root.right, root.val, 0);
    }

    public int calSum(TreeNode root, int curNum, int curSum) {
        if (root == null) {
            return 0;
        }
        curNum = curNum * 10 + root.val;
        if (root.left == null && root.right == null) {
            curSum += curNum;
            return curSum;
        }
        int leftSum = calSum(root.left, curNum, curSum);
        int rightSum = calSum(root.right, curNum, curSum);
        return leftSum + rightSum;
    }

}
