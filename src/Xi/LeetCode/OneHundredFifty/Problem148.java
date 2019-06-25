package Xi.LeetCode.OneHundredFifty;

import Xi.LeetCode.ListNode;

/**
 Sort a linked list in O(n log n) time using constant space complexity.

 Example 1:
 Input: 4->2->1->3
 Output: 1->2->3->4

 Example 2:
 Input: -1->5->3->4->0
 Output: -1->0->3->4->5
 */
public class Problem148 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head, fast = head;
        //指向slow的前一个节点，用于从中间把链表分成两个子链表
        ListNode prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode firstHead = sortList(head);
        ListNode secondHead = sortList(slow);
        return merge(firstHead, secondHead);
    }

    public ListNode merge(ListNode firstHead, ListNode secondHead) {
        //该节点的next节点为需要返回的头节点
        ListNode dummyHead = new ListNode(0);
        //用于连接节点
        ListNode p = dummyHead;
        while (firstHead != null && secondHead != null) {
            if (firstHead.val > secondHead.val) {
                p.next = secondHead;
                secondHead = secondHead.next;
            } else {
                p.next = firstHead;
                firstHead = firstHead.next;
            }
            p = p.next;
        }
        //连接最后一个节点
        if (firstHead != null) {
            p.next = firstHead;
        }
        if (secondHead != null) {
            p.next = secondHead;
        }
        return dummyHead.next;
    }
}
