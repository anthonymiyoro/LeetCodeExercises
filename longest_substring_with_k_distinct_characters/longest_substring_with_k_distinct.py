# Create hash table to hold each unique character
# Loop through string
# Check if hash table has more than k items (keys)

'''
This method finds the longest substring with at most K
Distinct characters.
input: string and a number k
output: longest substring that has at most k distinct characters
'''

class Solution:
    
    def longest_substring(self, input_string, k):
        
        char_freq_table = {}
        start = 0
        end = 0
        longest_substring_size = 0
        
        # Expand the window
        for end in range(len(input_string)):
            # Collect the new characther and add it to the hash table
            newCharacter = input_string[end]
            
            if newCharacter in char_freq_table.keys():
                char_freq_table[newCharacter] = char_freq_table[newCharacter] + 1
            else:
                char_freq_table[newCharacter] = 1
                
            # If the number of distinct characters is more than 
            # K 
            while len(char_freq_table) > k:
                print ("Char freq 1", char_freq_table)
                startCharacter = input_string[start]
                start = start + 1
                char_freq_table[startCharacter] = char_freq_table[startCharacter] - 1
                # if frequency becomes 0 then remove the character
                if char_freq_table[startCharacter] == 0:
                    char_freq_table.pop(startCharacter)
                    print ("Char freq popped", char_freq_table)
            
            # if the current window is the lrgest make ot longest       
            if(end - start +1>longest_substring_size):
                longest_substring_size = end - start + 1
                
        return (longest_substring_size)
        
s = Solution()
print(s.longest_substring("ababcbcca", 2))
          