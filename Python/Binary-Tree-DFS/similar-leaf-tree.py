from typing import Optional

class Node():
   def __init__(self,key):
        self.left = None
        self.right = None
        self.val = key

def leafSimilar(root1: Optional[Node], root2: Optional[Node]) -> bool:
        return getleaf(root1) == getleaf(root2)

def getleaf(root):
        if not root:
            return []
        if not root.left and not root.right:
            return [root.val]
        leafs=getleaf(root.left)+getleaf(root.right)
        return leafs

root = Node(3)
root.left      = Node(5)
root.right     = Node(1)
root.left.left  = Node(6)
root.left.right  = Node(2)
root.left.right.left = Node(7)
root.left.right.right = Node(4)
root.right.left = Node(9)
root.right.right = Node(8)

root2 = Node(3)
root2.left      = Node(5)
root2.right     = Node(1)
root2.left.left  = Node(6)
root2.left.right  = Node(7)
root2.right.left = Node(4)
root2.right.right = Node(2)
root2.right.right.left = Node(9)
root2.right.right.right = Node(8)

print ("max depth of binary tree is:",leafSimilar(root, root2))