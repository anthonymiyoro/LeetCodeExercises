# if there is a group with a lenght of more than 3, increment sum 

from itertools import groupby

# def minimum_moves(input_data):
#     sum = 0
#     for key, group in groupby(input_data):
#         print (key, list(group))
#         d = len(list(group))
#         if d >= 3:
#             sum = sum + (d//3)
#             print ("sum incremented", sum)
    
#     return sum
# minimum_moves('baaaaa')

def minMove(S):
    for _, g in groupby(S):
       print (sum(len(list(g)) // 3))
 
S = 'baaaaa'
minMove(S)  


def minMove(S):
    print sum(len(list(g)) // 3 for _, g in groupby(S))   

S = 'baaabbaabbba'
minMove(S)     