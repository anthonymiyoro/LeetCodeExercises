## FIBONACCI NUMBER
[Found Here!!!](https://leetcode.com/problems/fibonacci-number)

### QUESTION

The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

```
F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), for N > 1.
```

### EXAMPLES
```
Example 1:

Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
    1. 1 step + 1 step
    2. 2 steps

Example 2:

Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
    1. 1 step + 1 step + 1 step
    2. 1 step + 2 steps
    3. 2 steps + 1 step
```

### SOLUTION

```
    My "proposed solution" involves dynamic programming where using a while loop, we climb the stairs while storing the number of ways in which we could have climbed each number of stairs. 

    Its complexity is O(N).
```