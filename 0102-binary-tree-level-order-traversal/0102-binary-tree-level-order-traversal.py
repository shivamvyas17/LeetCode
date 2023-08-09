# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from collections import deque
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
      
        if root == None:
            return []
        q=deque()
        q.append(root)
        result = []
        while len(q):
            level = []
            for i in range(len(q)):
                node = q.popleft()
            
                level.append(node.val)
            
                if node.left is not None:
                    q.append(node.left)
                if node.right is not None:
                    q.append(node.right)
            result.append(level)
        return result
          