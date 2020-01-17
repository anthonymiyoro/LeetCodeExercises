## Add Two numbers as linked list

### Question
Hi, here's your problem today. This problem was recently asked by Microsoft:

You are given two linked-lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

#### Example:
```
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
```
Explanation: 
```
342 + 465 = 807.
```

- Get the lenght of both lists
- Add leading 0s to shorter list

```
[1,2,3,4]  [1,2,3,4]
[1,2,3]    [0,1,2,3]
```
- Add the numbers individually and store them in new linked list while carrying over 1 of greater than 9 
