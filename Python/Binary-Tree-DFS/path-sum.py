from typing import Optional

class TreeNode():
   def __init__(self,key):
        self.left = None
        self.right = None
        self.val = key

def pathSum(root: Optional[TreeNode], targetSum: int) -> int:
    currVal=0
    def dfs(node):
            if not node:
                return 0
            count =0
            currVal+= root.val
            if currVal== targetSum:
                 count+=1
            dfs(node.left)
            dfs(node.right)
            return count            
        
    return dfs(root)

root = TreeNode(10)
root.left      = TreeNode(5)
root.right     = TreeNode(-3)
root.right.right = TreeNode(11)
root.left.left  = TreeNode(3)
root.left.right  = TreeNode(2)
root.left.right.right = TreeNode(1)
root.left.left.left = TreeNode(3)
root.left.left.right = TreeNode(-2)

targetSum=3
print ("Count of binary tree is:",pathSum(root,targetSum))