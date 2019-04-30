class Solution:
    @staticmethod
    def lengthOfLongestSubstring(word):
        begin = 0
        end = 0
        longest = (0,0)
        for i in xrange(len(word)):
            try:
                j = word.index(word[i],begin,end)
                # longest?
                if end-begin >= longest[1]-longest[0]:
                    longest = (begin,end)
                begin = j+1
                if begin==end:
                    end += 1
            except:
                end = i+1
        end=i+1
        if end-begin >= longest[1]-longest[0]:
            longest = (begin,end)
        return word[slice(*longest)]


print (Solution.lengthOfLongestSubstring('abcabcbb'))
            