# First Unique Character in a String
https://leetcode.com/problems/first-unique-character-in-a-string/

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:
```
s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
```

Note: You may assume the string contain only lowercase letters. 

### Solution
- Loop through each character in string
"leetcode"
- Count number of charcters and put them in dictionary with value being the character count
{'l': 1, 'e': 3, 't': 1, 'c': 1, 'o': 1, 'd': 1}
- Loop through dictionary and return index of first item with 1 as its value using:
```
string.find(k)
```
