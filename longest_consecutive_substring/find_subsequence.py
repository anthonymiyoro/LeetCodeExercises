import sys

class Solution():
    
    # def highestSubArraySum(this,a,size,maximum_subsequence_length): 
    #     counter = 0
    #     highest_so_far = a[0]
    #     current_highest = a[0]
        
    #     for i in range(1, size):
    #         if counter <= maximum_subsequence_length:
    #             current_highest = max(a[i], current_highest+ a[i])
    #             highest_so_far = max(highest_so_far, current_highest)
    #             counter = counter + 1
    #         else:
    #             break
                
    #     print (highest_so_far)
    #     return highest_so_far
    
    # Function to return the maximum average  
    # of the sub-array with size  
    # atleast x and atmost y  
    def highestSubArraySum(this, a, n, x, y) :  
    
        # Calculate the prefix sum array  
        prefix = [0] * n ; 
        prefix[0] = a[0]; 
        for i in range(1, n) : 
            prefix[i] = prefix[i - 1] + a[i]; 
            
        maximum = 0; 
        
        # Iterate over all sub-arrays 
        for i in range(n) : 
            j = i + x - 1
            
            # Sub-arrays of size X to Y 
            while(j < i + y and j < n) : 
                
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
   
    
    