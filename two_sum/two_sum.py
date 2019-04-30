nums_list = [2, 7, 11, 15]
target = 9

def twoSum(nums, target):
        answer_list = []
        for i in nums_list:
                for j in nums_list:
                        if (i+j) == target:
                                answer_list.append(nums_list.index(i))
                                answer_list.append(nums_list.index(j))
                                print (answer_list)
                                return(answer_list)
                        else:
                                print ("Nope")


twoSum(nums_list, target)
   