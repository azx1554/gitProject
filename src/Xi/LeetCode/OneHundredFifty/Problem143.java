package Xi.LeetCode.OneHundredFifty;

import Xi.LeetCode.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 Given a singly linked list L: L0→L1→…→Ln-1→Ln,
 reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

 You may not modify the values in the list's nodes, only nodes itself may be changed.

 Example 1:

 Given 1->2->3->4, reorder it to 1->4->2->3.
 Example 2:

 Given 1->2->3->4->5, reorder it to 1->5->2->4->3.
 */
public class Problem143 {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        List<ListNode> nodeList = new ArrayList<>();
        while (head != null) {
            nodeList.add(head);
            head = head.next;
        }
        int n = nodeList.size();
        int left = 0, right = n - 1;
        ListNode[] nodeArray = new ListNode[n];
        for (int i = 0; i < n; i = i + 2) {
            nodeArray[i] = nodeList.get(left);
            nodeArray[i+1] = nodeList.get(right);
            left++; right--;
            if (left == right) {
                nodeArray[i + 2] = nodeList.get(left);
                break;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            nodeArray[i].next = nodeArray[i+1];
        }
        nodeArray[n - 1].next = null;
        return;
    }
}
