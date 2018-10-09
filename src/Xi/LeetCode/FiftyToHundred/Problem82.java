package Xi.LeetCode.FiftyToHundred;

/**
 * Given a sorted linked list, delete all nodes that have duplicate numbers, <br>
 * leaving only distinct numbers from the original list.
 * <p>
 * Input: 1->2->3->3->4->4->5 <br>
 * Output: 1->2->5
 */
public class Problem82 {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode result = head;
        ListNode prev = null;
        boolean foundResult = true;

        while (head != null && head.next != null) {
            if (head.val != head.next.val) {
                if (foundResult) {
                    result = head;
                    foundResult = false;
                }
                prev = head;
                head = head.next;
            } else {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                if (prev != null) { //处理 x->x->...->x->y->z的情况，此时prev为null
                    prev.next = head.next;
                }
                head = head.next;
            }
        }
        if (foundResult) { //处理 x->x->...->x->y的情况或x->x->...->x->null或x->x->...->x->y->y->z的情况
            result = head;
        }

        return result;

    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}


