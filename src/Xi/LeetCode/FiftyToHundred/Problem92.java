package Xi.LeetCode.FiftyToHundred;


/**
 * Reverse a linked list from position m to n. Do it in one-pass.
 * <p>
 * Note: 1 ≤ m ≤ n ≤ length of list.
 * <p>
 * Input: 1->2->3->4->5->NULL, m = 2, n = 4 <br>
 * Output: 1->4->3->2->5->NULL
 */
public class Problem92 {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == n)
            return head;
        ListNode temp = head;
        ListNode prevBegin = null, begin = null , current = null, next = null;
        boolean mIsOne = m == 1 ? true : false;

        while(n >= 0) {
            m--;n--;
            if (m == 1) {
                prevBegin = temp;
                temp = temp.next;
            } else if (m == 0) {
                begin = temp;
                next = temp;
                temp = temp.next;
            } else if (m < 0 && n >= 0) {
                current = temp;
                temp = temp.next;
                current.next = next;
                next = current;
            } else if (n < 0) {
                if (!mIsOne) {
                    prevBegin.next = next;
                }
                begin.next = temp;
                break;
            } else {
                temp = temp.next;
            }
        }
        return mIsOne ? next : head;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
