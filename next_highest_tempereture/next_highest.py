import numpy as np

class Solution:
    def dailyTemperatures(self, T):
        # create a new list that will hold the solution and 
        # one that contains question items
        hotter = []
        temperature_list = np.array(T)
        
        # loop through list with question variables and compare currently 
        # selected item with next item in list 
        for index, temperature in enumerate(temperature_list):
            hotter.append(np.argmax(temperature_list[index:] > temperature))
            
            # print ("hotter", hotter)
        print ()
        return hotter

T = [5, 4, 5, 1, 3, 3, 8, 2]
solution = Solution()
solution.dailyTemperatures(T)