# Return minimum number of moves of three identical consecutive letters
https://leetcode.com/discuss/interview-question/398026/

### Problem
You are given a string S consisting of N letters 'a' and/or 'b'. In one move, you can swap one letter for the other ('a' for 'b' or 'b' for 'a').

Write a function solution that, given such a string S, returns the minimum number of moves required to obtain a string containing no instances of three identical consecutive letters.

Examples:

        Given S="baaaaa", the function should return 1. The string without three identical consecutive letters which can be obtained in move is "baabaa"

        Given S = "baaabbaabbba", the function should return 2. There are four valid strings obtainable in two moves: for example, "bbaabbaabbaa"

        Given S = "baabab", the function should return 0

Write an efficient algorithm for the following assumptions:

    N is an integer within the range [0...200,000]
    string S consists only of the characters 'a' and/or 'b'

## Proposed Solution

- Loop through input
- Use Pythons' group by to group similar letters together
- If there is a group with a length greater than 3, increment counter
- For example baaaaa has 2 groups and 1 group has more as than 3 
```
'baaaaa' becomes

('b', ['b'])
('a', ['a', 'a', 'a', 'a', 'a'])
```

```
'baaabbaabbba' becomes

('b', ['b'])
('a', ['a', 'a', 'a'])
('b', ['b', 'b'])
('a', ['a', 'a'])
('b', ['b', 'b', 'b'])
('a', ['a'])
```
- baaabbaabbba has 2 groups with lengths of more than 3 and therefore 2 will be returned

