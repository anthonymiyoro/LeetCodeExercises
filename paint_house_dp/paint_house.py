costs = [[17,2,17],[16,16,5],[14,3,19]]

class Solution(object):
    def minCost(self, costs):
        """
        :type costs: List[List[int]]
        :rtype: int
        """
        m = len(costs)
        # if we get nothing return 0
        if m == 0: 
            return 0
        
        # if we get one set of houses, return the min for them
        elif m == 1:
            print (min(costs[0][0], costs[0][1],costs[0][2]))
            return min(costs[0][0], costs[0][1],costs[0][2])
        
        # if we get a full set
    	else:
            n = 3 if m else 0
            dp = [[0 for i in range(3)] for j in range(m)]

            dp[0] = costs[0]
            
        # Loop though the full set finding the sum of the minimums
            for i in range(1,m):
                dp[i][0] = min(dp[i-1][1],dp[i-1][2]) + costs[i][0]
                print ("dp0", dp[i][0], "costs0", costs[i][0])
                dp[i][1] = min(dp[i-1][0],dp[i-1][2]) + costs[i][1]
                print ("dp1", dp[i][1], "costs1", costs[i][1])
                dp[i][2] = min(dp[i-1][0],dp[i-1][1]) + costs[i][2]
                print ("dp2", dp[i][2], "costs2", costs[i][2])
            
            print ("solution", min(dp[m-1][0], dp[m-1][1], dp[m-1][2]))
            return min(dp[m-1][0], dp[m-1][1], dp[m-1][2])
     
solution = Solution()
solution.minCost(costs)