class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_profit = 0
        min_price_so_far = float('inf')
#         For price in list, find the best possible price if the current price is
#         sold forthe minimum price so far 
#         Simple :)
        for current_price in prices:
            min_price_so_far = min(min_price_so_far, current_price)
            best_possible_price_if_sold_now = current_price - min_price_so_far
            max_profit = max(max_profit, best_possible_price_if_sold_now)
            
        return (max_profit)       