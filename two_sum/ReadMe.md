## TWO SUM
https://leetcode.com/problems/two-sum/
https://stackoverflow.com/questions/509211/understanding-slice-notation

### QUESTION

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

'''

    Given nums = [2, 7, 11, 15], target = 9,

    Because nums[0] + nums[1] = 2 + 7 = 9,
    return [0, 1].
    
'''

### SOLUTION

- Loop through list input
- if item - target is somewhere in the list,
- Return index of item and index of (item - target)