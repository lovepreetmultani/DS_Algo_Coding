from typing import Optional

class TreeNode():
   def __init__(self,key):
        self.left = None
        self.right = None
        self.val = key

def longestZigZag(root: Optional[TreeNode]) -> int:
        return max(dfs(root.left,True,0), dfs(root.right,False,0))
    
def dfs(root,path,depth):
        if not root:
            return depth
        
        if path:
            depth = max(
                depth,
                dfs(root.right,False,depth+1),
                dfs(root.left,True,0)
            )
        else:
            depth = max(
                depth,
                dfs(root.left,True,depth+1),
                dfs(root.right,False,0)
            )
        return depth

root = TreeNode(1)
root.right      = TreeNode(1)
root.right.left      = TreeNode(1)
root.right.right    = TreeNode(1)
root.right.right.left   = TreeNode(1)
root.right.right.left.right   = TreeNode(1)
root.right.right.left.right.right  = TreeNode(1)
root.right.right.right  = TreeNode(1)

longestZigZag(root)
print ("max depth of binary tree is:",longestZigZag(root))

