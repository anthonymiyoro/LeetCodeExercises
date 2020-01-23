class Solution:
    def subsets(self, nums):
        result = [[]]
        for number in nums:
            for i in result:
                # append (i in result list + number) to result list
                result = result +[i + [number]]
        return result
