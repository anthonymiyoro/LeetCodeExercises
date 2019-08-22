#input 
# [5,4,5,1,1,5]
# [1,4,5,4,4,5]

class Solution:
    def longestUnivaluePath(self, root: TreeNode):
        
        # Declare variable to keep track of longest path so far
        self.longest = 0
        
        # base case
        def longest(root):
            if not root:
                return 0
            
            # Get the longest path of left node
            leftP = longest(root.left)
            # Get the longest path of right node
            rightP = longest(root.right)
            
            # If the left node exists and is equal to the root.left.val add 1 to the maximum longest univalue path
            left = (leftP + 1) if root.left and root.val==root.left.val else 0
            right = (rightP + 1) if root.right and root.val==root.right.val else 0
            
            # We then update the longest variable path (sum of let recusrsion call and right recursion call.) 
            self.longest=max(self.longest, left+right)
            
            # We then return the maximum of this path since it can only be one
            return max(left, right)
        
        longest(root)
        return self.longest