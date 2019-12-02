## Minimum depth of binary tree

### Problem Statement

Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root 
node down to the nearest leaf node.

Note: A leaf is a node with no children.

Example:
```
Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7

return its minimum depth = 2.
```

### Proposed Solution
- Check for empty nodes and focus on finding minimums for nodes with values
- If the nodes are full recusively find the minimum depth i guess