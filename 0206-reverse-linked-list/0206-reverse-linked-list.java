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
    public ListNode reverseList(ListNode head) {
        
        if(head == null){
            return head;
        }
        
//        ListNode prev  = null;
//        ListNode present = head;
//        ListNode next = present.next;
        
//         while(present !=null){
            
//             present.next = prev;
//             prev = present;
//             present =next;
//             if(next!=null){
//             next = next.next;
//         }
            
//     }
//         //head = prev;
//         return prev;
        
        ListNode current = head;
        ListNode previous = null;

        while (current != null) {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    

}}