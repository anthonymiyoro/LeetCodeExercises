class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        # nums = [1,3,4,2,2]
        for i in nums:
            stored_number = i
            if (i == stored_number):
                continue
                print (i)
                return (i)
            