## Find Pair With Given Sum


Given a list of positive integers nums and an int target, return indices of the two numbers such that they add up to a target - 30.

Conditions:

    You will pick exactly 2 numbers.
    You cannot pick the same element twice.
    If you have muliple pairs, select the pair with the largest number.

Example 1:

Input: nums = [1, 10, 25, 35, 60], target = 90
Output: [2, 3]
Explanation:
nums[2] + nums[3] = 25 + 35 = 60 = 90 - 30

Example 2:

Input: nums = [20, 50, 40, 25, 30, 10], target = 90
Output: [1, 5]
Explanation:
nums[0] + nums[2] = 20 + 40 = 60 = 90 - 30
nums[1] + nums[5] = 50 + 10 = 60 = 90 - 30
You should return the pair with the largest number.



```

from itertools import combinations 

nums = [1, 10, 25, 60, 0, 35, 20, 40, 60, 50]
target = 90
desired_num = target - 30

outputs = list()
# get all possible combinations of numbers in the list with length and sum them
for index, number in combinations(enumerate(nums), 2):
    indices_values = list(zip(index, number))
# if sum is equal to answer append to indice
    if sum(indices_values[1]) == desired_num:
        outputs.append(indices_values)
        

print("answer", list(sorted(outputs, key=lambda k:sorted(k[1], reverse=True)[0], reverse=True)[0][0]))
```
===================================
```
def findPair(nums, target):
    Map, res, maxm = {}, [], float('-inf')
    for i, num in enumerate(nums):
        if target - 30 - num in Map:
            pair = [Map[target - 30 - num], i]
            if maxm <= max(num, target-30-num):
                res = pair
                maxm = max(num, target-30-num)
        else:
            Map[num] = i
    return res


```


#####

Given a matrix with r rows and c columns, find the maximum score of a path starting at [0, 0] and ending at [r-1, c-1]. The score of a path is the minimum value in that path. For example, the score of the path 8 → 4 → 5 → 9 is 4.

Don't include the first or final entry. You can only move either down or right at any point in time.

Example 1:

Input:
[[5, 1],
 [4, 5]]

Output: 4
Explanation:
Possible paths:
5 → 1 → 5 => min value is 1
5 → 4 → 5 => min value is 4
Return the max value among minimum values => max(4, 1) = 4.

Example 2:

Input:
[[1, 2, 3]
 [4, 5, 1]]

Output: 4
Explanation:
Possible paths:
1-> 2 -> 3 -> 1
1-> 2 -> 5 -> 1
1-> 4 -> 5 -> 1
So min of all the paths = [2, 2, 4]. Note that we don't include the first and final entry.
Return the max of that, so 4.



#####
```
matrix = [[5, 1],[4, 5]]

def max_min_path(matrix):
    if not matrix or not matrix[0]:
        return 0

    n, m = len(matrix), len(matrix[0])
    print ("n, m  ", n, m)

    dp = [[0] * m for _ in range(n)]
    print ("dp", dp)

    for i in range(n):
        for j in range(m):
            if i == 0 and j == 0:
                continue
            elif i == 1 and j == 0 or i == 0 and j == 1:
                dp[i][j] = matrix[i][j]
            elif i == 0:
                dp[i][j] = min(matrix[i][j], matrix[i][j - 1])
            elif j == 0:
                dp[i][j] = min(matrix[i][j], matrix[i - 1][j])
            else:
                dp[i][j] = min(matrix[i][j], max(dp[i - 1][j], dp[i][j - 1]))

    if n == 1:
        return dp[0][-2]
    elif m == 1:
        return dp[-2][0]
    else:
        return max(dp[-2][-1], dp[-1][-2])
    
max_min_path(matrix)

```

####
Given a string s and an int k, return all unique substrings of s of size k with k distinct characters.

Example 1:

Input: s = "abcabc", k = 3
Output: ["abc", "bca", "cab"]

Example 2:

Input: s = "abacab", k = 3
Output: ["bac", "cab"]

Example 3:

Input: s = "awaglknagawunagwkwagl", k = 4
Output: ["wagl", "aglk", "glkn", "lkna", "knag", "gawu", "awun", "wuna", "unag", "nagw", "agwk", "kwag"]
Explanation: 
Substrings in order are: "wagl", "aglk", "glkn", "lkna", "knag", "gawu", "awun", "wuna", "unag", "nagw", "agwk", "kwag", "wagl" 
"wagl" is repeated twice, but is included in the output once.

Constraints:

    The input string consists of only lowercase English letters [a-z]
    0 ≤ k ≤ 26

######
```
def substringk(s, k):
    if not s or k == 0:
        return []
    
    letter, res = {}, set()
    start = 0
    for i in range(len(s)):
        if s[i] in letter and letter[s[i]] >= start:
            start = letter[s[i]]+1
        letter[s[i]] = i
        if i-start+1 == k:
            res.add(s[start:i+1])
            start += 1
    return list(res)
    
```
