# Lexicographically Smallest String
https://leetcode.com/discuss/interview-question/366869/

Lexicographically smallest string formed by removing at most one character.

Example 1:

Input: "abczd"
Output: "abcd"

## Solution

- Since you could only remove one char, you should remove the first char you see that is greater than the next from left to right, i.e. peak char. If there is no such string, I think you should just remove the last char, i.e. if the string is sorted ascending.