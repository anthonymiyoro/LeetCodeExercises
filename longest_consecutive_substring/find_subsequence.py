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
    
    question_array = open(r"data/input_1.txt","r")
    question = question_array.read()
    question_array = question.split(" ")
    question_array = list(map(int, question_array)) 
    print (question_array)
    
    solution_class = Solution()
    solution = solution_class.highestSubArraySum(question_array,len(question_array))
   
    
    