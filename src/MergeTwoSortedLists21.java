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

public class MergeTwoSortedLists21 {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode currA = list1;
        ListNode currB = list2;
        ListNode combined = null;

        while (currA == null || currB == null) {
            if (currA.value > currB.value) {
                combined.value = currB.value;
                currB = currB.next;
            } else {
                combined.value = currA.value;
                currA = currA.next;
            }
            combined = combined.next;
        }

        if (currA == null){
            while (currB == null) {
                combined.value = currB.value;
                combined = combined.next;
                currB = currB.next;
            }
        } else {
            while (currA == null) {
                combined.value = currA.value;
                combined = combined.next;
                currA = currA.next;
            }
        }
        return combined;
    }
}
