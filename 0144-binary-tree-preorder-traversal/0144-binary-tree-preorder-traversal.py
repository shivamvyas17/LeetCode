# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        l1=[]
        if root == None:
            return 
        store= [root]
        while len(store)>0:
            curr=store.pop()
            l1.append(curr.val)
        
            if curr.right is not None:
                store.append(curr.right)
            if curr.left is not None:
                store.append(curr.left)
        return l1
        
        
        
    
                
         

        

        