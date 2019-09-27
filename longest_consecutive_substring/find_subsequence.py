import sys

class Solution():
    def highestSubArraySum(this, array, size, smallest_size, largest_size) :  
        maximum = 0; 
        
        # Calculate the prefix sum array  
        prefix = [0] * size 
        prefix[0] = array[0]; 
        for i in range(1, size): 
            prefix[i] = prefix[i - 1] + array[i]
        
        # Iterate over all sub-arrays 
        for i in range(size): 
            j = i + smallest_size - 1
            
            # Sub-arrays of size X to Y 
            while(j < i + largest_size and j < size) : 
                # Get the sum of the sub-array 
                sum = prefix[j]; 
                if (i > 0) : 
                    sum -= prefix[i - 1]; 
                
                # Find average of sub-array  
                current = sum; 
                # Store the maximum of average 
                maximum = max(maximum, current); 
                
                j += 1
        print (maximum)
        return maximum;  


if __name__=='__main__':
    
    # Collect file location and maximum substring length
    file_location = sys.argv[1]
    maximum_subsequence_length = int(sys.argv[2])
    
    # Collect input from file, convert to integer, pass it to function
    question_array = open(file_location,"r")
    question = question_array.read()
    question_array = question.split(" ")
    question_array = list(map(int, question_array)) 
    
    # Run solution function
    solution_class = Solution()
    solution = solution_class.highestSubArraySum(question_array,len(question_array),1,maximum_subsequence_length)
   
    
    