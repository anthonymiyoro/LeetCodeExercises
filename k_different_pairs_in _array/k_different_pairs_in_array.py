import collections

class Solution:
    def findPairs(self, nums, k):
        result = 0
        # collect and store array elements with their counts as dictionary keys
        collection_counter = collections.Counter(nums)
        
        # loop through {1: 2, 3: 1, 4: 1, 5: 1}
        for item in collection_counter:
            # IDK honestly
            if k > 0 and item + k in collection_counter or k == 0 and collection_counter[item] > 1:
                result = result + 1
        return result
    
solution = Solution()
solution.findPairs([3, 1, 4, 1, 5], 2)