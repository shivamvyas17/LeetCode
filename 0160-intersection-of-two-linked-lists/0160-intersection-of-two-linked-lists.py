# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> ListNode:
        # Find lengths of linked lists
        lenA, lenB = 0, 0
        nodeA, nodeB = headA, headB
        while nodeA:
            lenA += 1
            nodeA = nodeA.next
        while nodeB:
            lenB += 1
            nodeB = nodeB.next
        
        # Calculate difference in lengths
        diff = abs(lenA - lenB)
        if lenA > lenB:
            # Move pointer of A ahead
            while diff > 0:
                headA = headA.next
                diff -= 1
        else:
            # Move pointer of B ahead
            while diff > 0:
                headB = headB.next
                diff -= 1
        
        # Traverse both linked lists in parallel
        while headA and headB:
            if headA == headB:
                return headA
            headA = headA.next
            headB = headB.next
        
        # No intersection found
        return None
