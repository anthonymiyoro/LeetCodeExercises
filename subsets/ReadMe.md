# Subsets
https://leetcode.com/problems/subsets/

## Problem
Given a set of distinct integers, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:

Input: nums = [1,2,3]
Output:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]

## Solution 
O(n^2)

- Initialize list with empty list inside it
- For each number in input
- For each list item in result
- Append (list item + number) to result list

