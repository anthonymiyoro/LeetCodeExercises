class Solution:
    def finalPrice(self, prices):
        if len(prices) == 0:
            return 0
        
        # Store the Next Lesser Element
        nle_stack = []
        res = 0
        
        # Move from right to left
        for i in reversed(range(len(prices))):
            # pop the stack until we find the next lesser element
            while nle_stack and nle_stack[-1] > prices[i]:
                nle_stack.pop()
            
            # add the discount, if any, and then add the current price to the stack
            res = res + prices[i] if not nle_stack else prices[i] - nle_stack[-1]
            nle_stack.append(prices[i])
            
        print ("nle_stack", nle_stack)
        return res
    
    # def finalPrice(self, prices):
    #     stack = []
    #     res = 0
        
    #     for i in prices:
    #         if(stack):
    #             if i > stack[-1]:
    #                 stack.append(i)
    #             else:
    #                 while(stack and i <= stack[-1]):
    #                     res += stack[-1] - i
    #                     stack.pop(-1)
    #                 stack.append(i)
    #         else:
    #             stack.append(i) 
    #     print (stack)
    #     print (res + sum(stack) )        
    #     return res + sum(stack) 
    
    
prices = [5, 4, 5, 1, 3, 3, 8, 2]
solution = Solution()
solution.finalPrice(prices)