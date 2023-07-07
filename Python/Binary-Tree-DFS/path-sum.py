from typing import Optional

class TreeNode():
   def __init__(self,key):
        self.left = None
        self.right = None
        self.val = key

def pathSum(root: Optional[TreeNode], targetSum: int) -> int:
        
        def checkPath(root,targetSum):
            if not root:
                return 0
            count=0
            if root.val == targetSum:
                count+=1
            count+=pathSum(root.left, targetSum-root.val)
            count+=pathSum(root.right,targetSum-root.val)
            return count
        
        if not root:
             return 0
        return pathSum(root.left,targetSum) + checkPath(root,targetSum) + pathSum(root.right,targetSum)

root = TreeNode(10)
root.left = TreeNode(5)
root.right = TreeNode(-3)
root.left.left = TreeNode(3)
root.left.right = TreeNode(2)
root.right.right = TreeNode(11)
root.left.left.right = TreeNode(-2)
root.left.right.right = TreeNode(1)
root.left.left.left = TreeNode(3)

targetSum = 8

print(pathSum(root, targetSum))