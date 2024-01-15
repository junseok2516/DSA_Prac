import com.sun.source.tree.BreakTree;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycle141 {
    // a cycle = continuous next node like a loop
    // need to analyze the given head (list) is a cycle or not
    // by using two pointers with different speed, they can meet at some point together
    // we have to detect that point
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            // check they meet
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
