class Solution:
    def maxLevelSum(self, root: TreeNode):
        # start from root node?
        max, level, maxLevel = -float('inf'), 0, 0
        q = collections.deque()
        q.append(root)
        while q:
            level += 1
            sum = 0
            for _ in range(len(q)):
                node = q.popleft()
                sum += node.val
                if node.left:
                    q.append(node.left)
                if node.right:
                    q.append(node.right)
            # Check if the sum of nodes is greater than the max of what we have
            if max < sum:
                max, maxLevel = sum, level        
        return maxLevel
            