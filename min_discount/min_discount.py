# This function returns the final prices of items after discount and the index of discounted items
class Solution:
    def finalPrice(self, prices):
        result_list = []
        if len(prices) == 0:
            return 0
        
        # Store the Next Lesser Element
        nle_stack = []
        # Initialise result
        res = 0
        
        # Move from right to left appending prices to nle_stack
        for i in reversed(range(len(prices))):
            # If the sum of nle_stack items is greater than the corresponding price pop right most nle_stack item
            while nle_stack and nle_stack[-1] > prices[i]:
                nle_stack.pop()

            # add the discount, if any, and then add the current price to the stack
            res = res + prices[i] if not nle_stack else prices[i] - nle_stack[-1]
            
            # append discounted prices to discount list
            result_list.append(res)
            
            # update nle stack
            nle_stack.append(prices[i])
            
            print ("nle_stack", nle_stack)
            print ("result_list", result_list)
            print ("   ")
         
        # Put list back in order 
        result_list = result_list[::-1]
        
        # Check if element did or did not get a discount by comparing with input array
        # then return index.
        for price, result in zip(prices, result_list):
            if price == result:
                print(prices.index(price))

        print ("answer", result_list)
        return res   
    
prices = [5, 4, 5, 1, 3, 3, 8, 2]
solution = Solution()
solution.finalPrice(prices)