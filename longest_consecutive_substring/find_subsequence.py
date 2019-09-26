class Solution():
    def highestSubArraySum(this,a,size): 
        highest_so_far = a[0]
        current_highest = a[0]
        
        for i in range(1, size):
            current_highest = max(a[i], current_highest+ a[i])
            highest_so_far = max(highest_so_far, current_highest)
            
        print (highest_so_far)
        return highest_so_far
    
    
if __name__=='__main__':
     # Run function on array "A" as input
    A = [3, -5, 1, 2, -1, 4, -3, 1, -2] 
    
    solution_class = Solution()
    solution = solution_class.highestSubArraySum(A,len(A))
   
    
    