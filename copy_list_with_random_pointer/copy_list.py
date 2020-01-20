"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def copyRandomList(self, head: 'Node') -> 'Node':
        
        # Create new empty node for each nodes
        node = head
        while node:
            node.random = Node(node.val, node.random, None)
            node = node.next
            
        # Populate random field of each of the new nodes
        node = head
        while node:
            node.random.random = node.random.next.random if node.random.next else None
            node = node.next
        
        # Restore original list and build new list
        head_copy = head.random if head else None
        node = head
        
        while node:
            node.random.next = node.next.random if node.next else None
            node.random = node.random.next
            node = node.next
            
        return head_copy
            