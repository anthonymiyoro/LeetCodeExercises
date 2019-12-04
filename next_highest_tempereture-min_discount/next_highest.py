import numpy as np

class Solution:
    def dailyTemperatures(self, T: List[int]) -> List[int]:
        # create a new list that will hold the solution and one that contains question items
        hotter = []
        temperature_list = np.array(T)
        
        # loop through list with question variables and compare currently se;ected
        # item with next item in list
        for index, temperature in enumerate(temperature_list):
            hotter.append(np.argmax(temperature_list[index:] > temperature))
            print ("hotter", hotter)
            
        return hotter
        