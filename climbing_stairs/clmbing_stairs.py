class Solution:
    def climbStairs(self, n: int):
        if (n == 0): 
            return 0;
        elif (n == 1):
            return 1;
        elif (n == 2):
            return 2;
        
    # Since we have taken 2 steps already, 
    # There are 2 ways in which we could have climbed the first 2:
        one_step_before = 2;
        two_steps_before = 1;
        all_ways = 0;
        counter=2;
        
        while (counter<n):
            counter=counter+1;
            print ("counter", counter)
            all_ways = one_step_before + two_steps_before;
            print ("all_ways", all_ways)
            two_steps_before = one_step_before;
            print ("two steps before", two_steps_before)
            one_step_before = all_ways;
            print ("one step before", one_step_before)
            
        return all_ways;
        
        
