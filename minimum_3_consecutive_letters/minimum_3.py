# if there is a group with a lenght of more than 3, increment sum 

from itertools import groupby

def minimum_moves(input_data):
    sum = 0
    for key, group in groupby(input_data):
        print (key, list(group))
        print ("length", (len(list(group))))
        if (len(list(group))) >= 3:
            sum = sum + ((len(list(group)))//3)
            print ("sum incremented", sum)
    
    return sum
minimum_moves('abbbbbbb')

# def minMove(S):
#     for _, g in groupby(S):
#        print (sum(len(list(g)) // 3))
 
# S = 'baaaaa'
# minMove(S)  


def minMove(S):
    print sum(len(list(g)) // 3 for _, g in groupby(S))   

S = 'abbbbbbb'
minMove(S)     