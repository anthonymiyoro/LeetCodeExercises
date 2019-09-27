# -*- coding: utf-8 -*-
"""
This Python module finds the consecutive, non-empty subsequence with the highest sum from a file containing a list of integers.
This is done by iterating over every sub-array from largest_size to smallest_size while using a prefix sum to improve performance.
"""
import sys

class Solution():
    def highestSubArraySum(self, array, array_size, smallest_size, largest_size):
        maximum = 0
        # Calculate the prefix sum array  
        prefix = [0] * array_size 
        prefix[0] = array[0]; 
        for i in range(1, array_size): 
            prefix[i] = prefix[i - 1] + array[i]
        
        # Iterate over all sub-arrays of size smallest_size to largest_size collecting highest sum
        for array_item in range(array_size): 
            j = array_item + smallest_size - 1    
            while(j < array_item + largest_size and j < array_size): 
                sum_value = prefix[j]
                if (array_item > 0): 
                    sum_value = sum_value - prefix[array_item - 1]; 
                maximum = max(maximum, sum_value); 
                j = j + 1
                
        print(maximum)
        return maximum
    
    # convert array to absolute difference version
    def createAbsoluteDifference(self, array, array_size, smallest_size, largest_size):
        new_array = []
        for i in range(array_size - 1): 
            diff = abs(array[i] - array[i + 1])
            new_array.append(diff)
            
        array_size = len(new_array)
        largest_size = largest_size - 1
        
        # calculate highest subsequence sum
        self.highestSubArraySum(new_array, array_size, smallest_size, largest_size)

if __name__=='__main__':
    
    # Collect file location and maximum substring length
    file_location = sys.argv[1]
    maximum_subsequence_length = int(sys.argv[2])
    calc_metric = sys.argv[3]
    
    # Collect input from file, convert to integer, pass it to function
    question_array = open(file_location,"r")
    question = question_array.read()
    question_array = question.split(" ")
    question_array = list(map(int, question_array)) 
    
    # Run solution function depending on behaviour parameter
    solution_class = Solution()
    if calc_metric == "differences":
        solution = solution_class.createAbsoluteDifference(question_array,len(question_array),1,maximum_subsequence_length)
    else:
        solution = solution_class.highestSubArraySum(question_array,len(question_array),1,maximum_subsequence_length)
   
    
    