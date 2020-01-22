class Solution:
    def firstUniqChar(self, s: str) -> int:
        # Count each character in string into dictionary
        counted_letters = {}
        for letter in s:
            if letter in counted_letters:
                counted_letters[letter] += 1
            else:
                counted_letters[letter] = 1
        print (counted_letters)
        
        # Return 1st character with a count of 1
        for k, v in counted_letters.items():
            print ("key", k)
            print ("value", v)
            if v == 1:
                return (s.find(k))

        return (-1)
        