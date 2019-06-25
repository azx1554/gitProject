package Xi.LeetCode.OneHundredFifty;

public class Problem141 {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode first = head;
        ListNode second = head.next;
        while (first != null && second != null) {
            if (first == second) {
                return true;
            }
            first = first.next;
            if (second.next != null) {
                second = second.next.next;
            } else {
                second = second.next;
            }
        }
        return false;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
