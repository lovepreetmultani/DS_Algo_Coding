class Node():
   def __init__(self,key):
        self.left = None
        self.right = None
        self.val = key


    # Function to  print level order traversal of tree
def printLevelOrder(root):
        h = height(root)
        for i in range(1, h+1):     
           printGivenLevel(root, i)

def printGivenLevel(root , level):
        if root is None:
           return
        if level == 1:
           print(root.val)
        elif level > 1 and level%2 == 0:
             #print("level",level)
             printGivenLevel(root.right , level-1)
             printGivenLevel(root.left , level-1)

        else:
           #print("level",level)
            printGivenLevel(root.left, level-1)
            printGivenLevel(root.right , level-1)


def height(node):
        if node is None:
           return 0
        else :
        # Compute the height of each subtree 
           lheight = height(node.left)
           rheight = height(node.right)

           #Use the larger one
           if lheight > rheight :
              return lheight+1
           else:
              return rheight+1

# Driver code
root = Node(1)
root.left      = Node(2)
root.right     = Node(3)
root.left.left  = Node(4)
root.left.right  = Node(5)

print ("Level order traversal of binary tree is -")
printLevelOrder(root)