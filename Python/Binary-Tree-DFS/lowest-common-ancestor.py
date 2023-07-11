from typing import Optional

class TreeNode():
   def __init__(self,key):
        self.left = None
        self.right = None
        self.val = key


def lowestCommonAncestor(root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        if not root or root==p or root==q:
            return root
        
        left = lowestCommonAncestor(root.left,p,q)
        right = lowestCommonAncestor(root.right,p,q)

        if left and right:
            return root
        else:
            return left or right
        

root = TreeNode(3)
root.left = TreeNode(5)
root.right      = TreeNode(1)
root.right.left      = TreeNode(0)
root.right.right    = TreeNode(8)
root.left.left   = TreeNode(6)
root.left.right   = TreeNode(2)
root.left.right.left = TreeNode(7)
root.left.right.right  = TreeNode(4)

p=5
q=4
print ("max depth of binary tree is:",lowestCommonAncestor(root,p,q))