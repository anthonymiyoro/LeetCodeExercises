class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for number in range(len(nums)):
            if (target-nums[number]) in nums[number+1:]:
                return [number,number+nums[number+1:].index(target-nums[number])+1]    