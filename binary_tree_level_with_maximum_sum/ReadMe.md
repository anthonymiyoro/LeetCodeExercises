## Find maximum level sum in Binary Tree (Tree Traversal)

### Given a Binary Tree having positive and negative nodes, the task is to find maximum sum level in it.

```
Input :               4
                    /   \
                   2    -5
                  / \    /\
                -1   3 -2  6
Output: 6
```
Explanation :
Sum of all nodes of 0'th level is 4
Sum of all nodes of 1'th level is -3
Sum of all nodes of 0'th level is 6
Hence maximum sum is 6

```
Input :          1
               /   \
             2      3
           /  \      \
          4    5      8
                    /   \
                   6     7  
Output :  17
```

### Proposed Solution
- Loop through each row of the tree and store the sum while updating the max so far with each loop.

- Line 7 to 16 loops through the tree checking the total sum while line 18 to 19 updates the largest sum.