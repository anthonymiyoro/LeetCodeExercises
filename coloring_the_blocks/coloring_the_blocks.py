class Solution:
    def color_the_blocks(self, colors):
        m = len(colors)
        
        if m==0:
            return 0
        
        # return min for 1 set of houses
        elif m==1:
            return min(colors[0][0], colors[0][1], colors[0][2])
        
        else:
            n = 3 if m else 0
            # if expected input loop through each item in list
            dp = [[0 for i in range(3)] for j in range(m)]
    
            dp[0] = colors[0]
            
            # Loop though the full set finding the sum of the minimums
            for i in range(1, m):
                dp[i][0] = min(dp[i-1][1],dp[i-1][2]) + colors[i][0]
                dp[i][1] = min(dp[i-1][0],dp[i-1][2]) + colors[i][1]
                dp[i][2] = min(dp[i-1][0],dp[i-1][1]) + colors[i][2]


            return min(dp[m-1][0], dp[m-1][1], dp[m-1][2])
      
colors = [[1,2,3],[1,2,3],[3,3,1]]
solution = Solution()
solution.color_the_blocks(colors)