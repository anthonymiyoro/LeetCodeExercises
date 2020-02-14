#!/bin/python3

import math
import os
import random
import re
import sys



# Complete the compute_number_score function below.
def compute_number_score(number):
    score = 0

    number_string = str(number)
    for num in number_string:
        if int(num) is 5:
            score = score + 2
    print ("5s score", score)

    number_string = str(number)
    str_start, str_end = 0,0
    for num in number_string:
        if number_string[str_start] != number_string[str_end] != 3:
            score = score + (str_end - str_start - 1)*4
            str_start = str_end 
        str_end = str_end + 1
    score = score + (str_end - str_start - 1)*4
    print ("4s score", score )


    number_string = str(number)
    str_start, str_end = 0,1
    pointer = 0
    while str_end < len(number_string):
        if int(number_string[pointer]) + 1 == int(number_string[str_end]):
            pointer = pointer + 1
            str_end = str_end + 1
        else:
            score = score + pow(str_end - str_start, 2)
            str_start = str_end
            pointer = pointer + 1
            str_end = str_end + 1

    score = score + pow(str_end - str_start, 2)
    print ("length score", score)

    if number % 5 == 0:
        score = score + 6
    print ("5s score", score)

    number_string = str(number)
    for num in number_string:
        if int(num) % 2 != 0:
            score = score + 1
    print ("evens score", score)

    return (score)
