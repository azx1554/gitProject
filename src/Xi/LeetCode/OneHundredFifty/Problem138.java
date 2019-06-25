package Xi.LeetCode.OneHundredFifty;

import java.util.HashMap;
import java.util.Map;

/**
 A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.

 Return a deep copy of the list.
 */
public class Problem138 {

    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Map<Node, Node> map = new HashMap<>();

        // loop 1. copy all the nodes
        Node node = head;
        while (node != null) {
            map.put(node, new Node(node.val, null, null));
            node = node.next;
        }

        // loop 2. assign next and random pointers
        node = head;
        while (node != null) {
            map.get(node).next = map.get(node.next);
            map.get(node).random = map.get(node.random);
            node = node.next;
        }

        return map.get(head);
    }


    class Node {
        public int val;
        public Node next;
        public Node random;

        public Node() {}

        public Node(int val,Node next,Node random) {
            val = val;
            next = next;
            random = random;
        }
    }
}
