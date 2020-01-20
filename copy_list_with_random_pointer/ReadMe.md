# Copy List with Random Pointer
https://leetcode.com/problems/copy-list-with-random-pointer/discuss/483617/Python-alternative-O(N)-random-field-modification-O(1)-extra-space-10-lines-explained

### Problem
A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.

Return a deep copy of the list.

The Linked List is represented in the input/output as a list of n nodes. Each node is represented as a pair of [val, random_index] where:

    val: an integer representing Node.val
    random_index: the index of the node (range from 0 to n-1) where random pointer points to, or null if it does not point to any node.

Example 1:

Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]

Example 2:

Input: head = [[1,1],[2,1]]
Output: [[1,1],[2,1]]

### Solution 
- Loop through input and make a new empty node for each input

- Start loop again and append the random values from the input to new list
```
new_node = node.random
old_node_random = new_node.next
new_node.random = old_node_random.random
```

- Now we can restore random links of the old list and set correct next links for the copied nodes
```
new_node = node.random
old_random = new_node.next
next_new_node = node.next.random
new_node.next = next_new_node
next.random = old_random
```

