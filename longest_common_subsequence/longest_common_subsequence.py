class Solution:
    @staticmethod
    def longestCommonSubsequenceBruteForce(str1,str2) -> int:
        def dp(str1_length, str2_length):
            if str1_length == -1 or str2_length == -1:
                # If string is empty return 0
                return 0
            if str1[str1_length] == str2[str2_length]:
                # We have found an lcs character, find some more
                return dp(str1_length-1,str2_length-1)+1
            else:
                # Select the longest lcs character
                return max(dp(str1_length-1, str2_length), dp(str1_length, str2_length-1))
        
        # str1_length and str2_length are now indexes of the final character in lcs
        return dp(len(str1)-1, len(str2)-1)

    @staticmethod
    def longestCommonSubsequenceDP(str1,str2) -> int:
        m, n = len(str1), len(str2)
        print("m, n :", m, n)

        # Construct DP table and set up base case
        dp = [[0] * (n+1) for _ in range(m + 1)]
        print('dp table', dp)


        for i in range(1, m+1):
        # Loop through the length of string 1
            for j in range(1, n +1):
            # Loop throught the length of string 2
                if str1[i - 1] == str2[j - 1]:
                # If a charcter is found in lcs the item in array is now 1 + previous item in array
                    dp[i][j] = 1 + dp[i-1][j-1]
                    print('LCs Character found!!', dp)
                else:
                    dp[i][j] = max(dp[i-1][j], dp[i][j-1], dp[i-1][j-1])
                    print('LCs character not found... yet ;)', dp)

        return dp[-1][-1]

       


print (Solution.longestCommonSubsequenceDP("abcde","ace"))