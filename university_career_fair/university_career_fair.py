# https://leetcode.com/discuss/interview-question/algorithms/374846/twitter-oa-2019-university-career-fair
# https://www.codespeedy.com/interval-scheduling-in-python/

# print(universityCareerFair([1, 3, 3, 5, 7], [2, 2, 1, 2, 1])) # 4
# print(universityCareerFair([1, 2], [7, 3])) # 1

def universityCareerFair(arrival, duration):
    # add duration to arrival time to get finish time for each
    finish = list(map(sum, zip(duration,arrival)))
    # get number of events
    index = list(range(len(arrival)))
    
    print ('finish_times', finish)
    
    # dictionary to hold max 
    max_set = set()
    prev_event_time = 0
    for i in index:
        # if arrival time is greater or equal to previous event 
        # start time add to max_set
        if arrival[i] >= prev_event_time:
            max_set.add(i)
        # set the previous event time to the finish time of current event
            prev_event_time = finish[i]
        
        print ('max set',max_set)
        #   get the largest number from the max set  
    return max(max_set)

result = universityCareerFair([1, 3, 3, 5, 7], [2, 2, 1, 2, 1])
print('Maximum number of tasks can be executed are', result)
