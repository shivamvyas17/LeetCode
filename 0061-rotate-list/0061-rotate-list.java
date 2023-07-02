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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k<1 || head.next == null){
            return head;
        }
        // step 1 calculate the length of list
        ListNode temp = head;
        int length = 1;
        
        while(temp.next!=null){
            temp = temp.next;
            length++;
        }
        
        temp.next = head;
        
        // perform rotations
        
        int rotations = k %length;
        
        // skip the part 
        int skip = length - rotations;
        ListNode newLast = head;
        for(int i =0 ; i< skip -1 ; i++){
            newLast = newLast.next;
        }
        
        head = newLast.next;
        newLast.next = null;
        
        return head;
    }
}