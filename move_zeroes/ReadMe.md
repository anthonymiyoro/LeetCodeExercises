Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]

Note:

   - You must do this in-place without making a copy of the array.
   - Minimize the total number of operations.


## Solution
- Loop through the input
- If item is 0, append the 0 to the end of the list
- After that delete the item in the selected index
