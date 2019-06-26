nums_list = [4, 6, 8, 2, 7, 11, 15]
target = 9

class Solution:
        def twoSum(self, nums, target):
                answer_list = []
                for i in nums_list:
                        # Skip 1st element in list
                        for j in nums_list[1:]:
                                if (i+j) == target:
                                        answer_list.append(nums_list.index(i))
                                        answer_list.append(nums_list.index(j))
                                        print (answer_list)
                                        return(answer_list)
                                else:
                                        print ("Nope")

solution = Solution()
solution.twoSum(nums_list, target)
    