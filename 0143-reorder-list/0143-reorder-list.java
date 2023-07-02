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
    public void reorderList(ListNode head) {
        
        if(head==null && head.next == null){
            return;
        }
        
        
        ListNode mid = mid(head);
        ListNode s = head;
        ListNode e = reverse(mid);
     
        
        
        while(s!=null & e!=null){
            ListNode temp  = s.next;
            s.next = e;
            s = temp;
            
            temp = e.next;
            e.next = s;
            e = temp;
            
        }
        if(s!=null){
            s.next = null;
        }
        
        
        
    }
     public ListNode mid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}