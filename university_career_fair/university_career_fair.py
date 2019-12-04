# https://leetcode.com/discuss/interview-question/algorithms/374846/twitter-oa-2019-university-career-fair
# https://www.codespeedy.com/interval-scheduling-in-python/

def universityCareerFair(arrival, duration):
    finish = list(map(sum, zip(duration,arrival)))
    index = list(range(len(arrival)))
    print ("index", index)
    
    max_set = set()
    prev_event_time = 0
    for i in index:
        if arrival[i] >= prev_event_time:
            max_set.add(i)
            prev_event_time = finish[i]
            
    return max(max_set)

result = universityCareerFair([1, 3, 3, 5, 7], [2, 2, 1, 2, 1])
print('Maximum number of tasks can be executed are', result)
