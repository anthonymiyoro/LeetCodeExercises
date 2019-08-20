## Substring Problem

Given a string A consisting of n characters and a string B consisting of m characters, write a function that will return the number of times A must be stated such that B is a substring of the repeated A. If B can never be a substring, return -1.

Example:
A = ‘abcd’
B = ‘cdabcdab’
The function should return 3 because after stating A 3 times, getting ‘abcdabcdabcd’, B is now a substring of A.

You can assume that n and m are integers in the range [1, 1000].

### Proposed Solution
- Build subset of string A one by one
- Search for this subset in string B
- Search for subset of string 
- Store search result in counter
- Loop through the string building each letter to a string


