## Sort all even numbers in ascending order and then sort all odd numbers in descending order.


### Problem Statement
Given an array of integers (both odd and even), sort them in such a way that the first part of the array contains odd numbers sorted in descending order, rest portion contains even numbers sorted in ascending order.

```
Examples:

Input  : arr[] = {1, 2, 3, 5, 4, 7, 10}
Output : arr[] = {7, 5, 3, 1, 2, 4, 10}

Input  : arr[] = {0, 4, 5, 3, 7, 2, 1}
Output : arr[] = {7, 5, 3, 1, 0, 2, 4} 

Asked in : Microsoft
```

### Solution
Method 2 (Using negative multiplication):

Make all odd numbers negative.
Sort all numbers.
Revert the changes made in step 1 to get original elements back.
