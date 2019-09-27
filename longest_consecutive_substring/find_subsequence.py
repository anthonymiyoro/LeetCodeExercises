import sys

class Solution():
    def highestSubArraySum(this, array, array_size, smallest_size, largest_size) :  
        maximum = 0; 
        
        # Calculate the prefix sum array  
        prefix = [0] * array_size 
        prefix[0] = array[0]; 
        for i in range(1, array_size): 
            prefix[i] = prefix[i - 1] + array[i]
        
        # Iterate over all sub-arrays 
        for i in range(array_size): 
            j = i + smallest_size - 1
            
            # Sub-arrays of size X to Y 
            while(j < i + largest_size and j < array_size): 
                # Get the sum of the sub-array 
                sum = prefix[j]
                if (i > 0): 
                    sum = sum - prefix[i - 1]; 
                
                # Find average of sub-array  
                current = sum; 
                # Store the maximum of average 
                maximum = max(maximum, current); 
                j = j + 1
                
        print (maximum)
        return maximum;
    
    # convert array to absolute difference version
    def createAbsoluteDifference(this, array, array_size, smallest_size, largest_size):
        for i in range(array_size - 1): 
            diff = abs(array[i] - array[i + 1]) 
            print(diff, end = " ")
        
        # calculate highest subsequence sum
        this.highestSubArraySum(array, array_size, smallest_size, largest_size)
        
          
      


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
    
    # Run solution function
    if calc_metric == "differences":
        solution_class = Solution()
        solution = solution_class.createAbsoluteDifference(question_array,len(question_array),1,maximum_subsequence_length)
    else:
        solution_class = Solution()
        solution = solution_class.highestSubArraySum(question_array,len(question_array),1,maximum_subsequence_length)
   
    
    