package Xi.LeetCode.FiftyToHundred;

/**
 * Given a linked list, rotate the list to the right by k places, where k is non-negative. <br>
 * Input: 1->2->3->4->5->NULL, k = 2<br>
 * Output: 4->5->1->2->3->NULL<br>
 * Explanation:<br>
 * rotate 1 steps to the right: 5->1->2->3->4->NULL<br>
 * rotate 2 steps to the right: 4->5->1->2->3->NULL
 */
public class Problem61 {

    public ListNode rotateRight(ListNode head, int k) {
        if (k <= 0 || head == null)
            return head;

        ListNode temp = head;

        int length = 1;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        if (k % length == 0)
            return head;

        int index = length - k % length;
        temp.next = head;

        while (index > 1) {
            head = head.next;
            index--;
        }

        ListNode result = head.next;
        head.next = null;

        return result;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
