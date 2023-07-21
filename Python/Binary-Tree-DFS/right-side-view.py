from typing import Optional, List
from collections import deque

class TreeNode():
   def __init__(self,key):
        self.left = None
        self.right = None
        self.val = key

def rightSideView(root: Optional[TreeNode]) -> List[int]:
        if not root:
            return None
        
        q=deque()
        q.append(root)
        res=[]

        while q:
            res.append(q[-1].val)
            for i in range(len(q)):
                node=q.popleft()
                if node.left:
                    q.append(node.left)
                if node.right:
                    q.append(node.right)
                
        return res

root = TreeNode(1)
root.right      = TreeNode(3)
root.right.right      = TreeNode(4)
root.left       = TreeNode(2)
root.left.right    = TreeNode(5)

rightSideView(root)
print ("max depth of binary tree is:",rightSideView(root))