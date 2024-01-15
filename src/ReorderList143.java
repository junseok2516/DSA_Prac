/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class ReorderList143 {
    public static void reorderList(ListNode head) {
        //find a middle node
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2.next!=null&&p2.next.next!=null) {
            p1=p1.next;
            p2=p2.next.next;
        }

        //reverse the order of the last half
        ListNode mid = p1;
        ListNode prev = p1.next;
        while (prev.next != null) { // current != null
            ListNode curr = prev.next;
            prev.next = curr.next;
            curr.next = mid.next;
            mid.next = curr;
        }

        // reorder them one by one
        p1 = head;
        p2 = mid.next;
        while (p1 != p2) {
            mid.next = p2.next;
            p2.next = p1.next;
            p1.next = p2;
            p1 = p2.next;

        }
}
