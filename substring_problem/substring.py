class Solution(object):
    def repeatedStringMatch(self, A, B):
        # initialise variables
        temp = ""
        counter = 0
        
        # Append to temporary string and check for substring while smaller than original size
        while len(temp) < len(B):
            temp = temp + A
            counter = counter + 1
            # Check if substring exists
            if B in temp:
                return counter
            
        # if still no match in larger than B appended string, continue appending
        temp = temp + A
        # Check if substring exists
        if B in temp:
            return counter + 1
        return -1