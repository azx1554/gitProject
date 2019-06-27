package Xi.LeetCode.TwoHundred;

import Xi.LeetCode.ListNode;

/**
 Write a program to find the node at which the intersection of two singly linked lists begins.
 */
public class Problem160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeA = headA, nodeB = headB;
        //即使两个链表没有交点，第二趟遍历的时候nodeA和nodeB到最后会同时为null，不会出现无限循环
        while (nodeA != nodeB) {
            nodeA = nodeA == null ? headB : nodeA.next;
            nodeB = nodeB == null ? headA : nodeB.next;
        }
        return nodeA;
    }
}
