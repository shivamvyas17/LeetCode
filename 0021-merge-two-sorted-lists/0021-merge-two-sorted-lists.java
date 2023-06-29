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
    public ListNode mergeTwoLists(ListNode first, ListNode secound) {
        
        ListNode ans = new ListNode();
        ListNode tail =ans;
        
        ListNode slow  = first;
        ListNode fast   = secound;
        
        while(slow!=null  && fast!=null){
            
            if(fast.val < slow.val){
                tail.next = fast;
                fast = fast.next;
                tail = tail.next;
            }
            else{
                tail.next = slow;
                slow = slow.next;
                tail = tail.next;
            }
        }
        while(slow!=null){
             tail.next = slow;
                slow = slow.next;
                tail = tail.next;
        }
        while(fast!=null){
            tail.next = fast;
                fast = fast.next;
                tail = tail.next;
        }
        
        return ans.next;
    }
}