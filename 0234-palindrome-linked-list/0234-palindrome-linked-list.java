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
// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         ListNode  midl = mid(head);
//         ListNode  secoundhead = reverse(midl);
            
            
//           reverse(secoundhead) ; 
//             while(head!=null && secoundhead!=null){
//                 if(head.val != secoundhead.val){
//                     break;
//                 }
//                 head = head.next;
//                 secoundhead = secoundhead.next;
//             }
//         if(head==null  || secoundhead == null){
//             return true;
//         }
//         return false;
//     }
//     public ListNode mid(ListNode head) {
//         ListNode slow = head;
    
//         ListNode fast = head;
    class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode midNode = mid(head);
        ListNode secondHalfReversed = reverse(midNode);
        ListNode currentNode = head;

        while (currentNode != null && secondHalfReversed != null) {
            if (currentNode.val != secondHalfReversed.val) {
                return false;
            }
            currentNode = currentNode.next;
            secondHalfReversed = secondHalfReversed.next;
        }

        return true;
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
    
        
//         while(fast!=null && fast.next!=null){
//             fast = fast.next.next;
//              slow =slow.next;
//         }
//         return slow;
//     }
//    public ListNode reverse(ListNode head) {
//         ListNode prev = null;
//         ListNode current = head;
//         ListNode next = null;

//         while (current != null) {
//             next = current.next;
//             current.next = prev;
//             prev = current;
//             current = next;
//         }

//         return prev;
//     }
// }