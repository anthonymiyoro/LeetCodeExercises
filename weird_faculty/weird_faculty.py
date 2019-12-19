def exam(v):
    # Write your code here
    v_length = len(v)

    #convert all 0s to -1
    for i in range(v_length):
        if not v[i]:
            v[i] = -1

    total_sum = sum(v)
    current_sum = 0

    # Loop through items and find point at which my results can be greater
    for item in range(v_length):
        if current_sum > total_sum:
            return item
        current_sum = current_sum + v[item]
        total_sum = total_sum - v[item]
    # if point does not exist, return length
    return v_length