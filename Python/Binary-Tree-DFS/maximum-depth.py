from typing import Optional
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def maxDepth(root: Optional[TreeNode]) -> int:
        if not root:
           return 0
        return 1 +max(maxDepth(root.left),maxDepth(root.right))


# Driver code
root = TreeNode(3)
root.left      = TreeNode(9)
root.right     = TreeNode(20)
root.right.left  = TreeNode(15)
root.right.right  = TreeNode(7)

maxDepth(root)
print ("max depth of binary tree is:",maxDepth(root))
