# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        l1 = []
        
        def preOrder(root,l1):
            if root!=None:
                l1.append(root.val)
                preOrder(root.left,l1)
                preOrder(root.right,l1)
        preOrder(root,l1)
        return l1
    
        
    
                
         

        

        