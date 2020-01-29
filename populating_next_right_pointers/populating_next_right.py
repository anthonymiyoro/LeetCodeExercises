"""
# Definition for a Node.
class Node:
    def __init__(self, val: int = 0, left: 'Node' = None, right: 'Node' = None, next: 'Node' = None):
        self.val = val
        self.left = left
        self.right = right
        self.next = next
        
        root = Current level of the tree
        kid = next level of the tree
        prekid = dummy head (used to traverse next tree level)
        kid.next = None (The head is None before we navigate to a new level)
"""
class Solution:
    def connect(self, root):
        old_root = root
        
        # start at the beginning of the tree
        prekid = Node(0) 
        kid = prekid
        
        while root:
            while root:
                # If there is a left node down, navigate to that node and set head there and vice versa
                if root.left:
                    kid.next = root.left
                    kid = kid.next
                if root.right:
                    kid.next = root.right
                    kid = kid.next
                    
                # Move on to next root
                root = root.next
                
            root = prekid.next
            kid = prekid
            kid.next = None
            
        return old_root
                