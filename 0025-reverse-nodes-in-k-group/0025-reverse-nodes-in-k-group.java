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
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        
        
        dummy.next = head;
        
        ListNode ptr = dummy;

        while (head != null) {
            
            ListNode start = head;
            ListNode end = End(head, k);

            if (end == null)
                break;

          ptr.next = reverseList(start, end.next);
           ptr = start;
           head = ptr.next;
        }

        ListNode newHead = dummy.next;
        return newHead;
    }

    private ListNode End(ListNode head, int k) {
        while (head != null && --k > 0)
            head = head.next;
        return head;
    }

    private ListNode reverseList(ListNode head, ListNode stop) {
        ListNode prev = stop;
        while (head != stop) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}