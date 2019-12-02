 # Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def maxDepth(self, root: TreeNode) -> int:
        # If you're given an empty tree
        if root is None:
            return 0
        
        # if you're given a tree with one node
        if root.left is None and root.right is None:
            return 1
        
         # if your tree has an empty right or left node
        if root.left is None:
            return self.maxDepth(root.right) + 1
        
        if root.right is None:
            return self.maxDepth(root.left) + 1
        
        # Then find the max depth of the left and right root recursively if both available
        return max(self.maxDepth(root.left), self.maxDepth(root.right)) + 1