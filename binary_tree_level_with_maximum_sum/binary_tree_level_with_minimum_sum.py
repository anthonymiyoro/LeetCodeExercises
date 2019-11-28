class Node:
    def __init__(self, value, left=None, right=None):
        self.val = value
        self.left = left
        self.right = right
        
    def minimum_level_sum(root):

        node = Node(10)
        node.left = Node(2)
        node.right = Node(8)
        node.left.left = Node(4)
        node.left.right = Node(1)
        node.right.right = Node(2)
        print (node)


minimum_level_sum(root)