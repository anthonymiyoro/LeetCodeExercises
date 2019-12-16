## University Career Fair (Scheduling)

### https://leetcode.com/discuss/interview-question/algorithms/374846/twitter-oa-2019-university-career-fair

### Question:
![Career Fair Question](https://i.imgur.com/cHg7Bod.png "Career Fair Question")


### Proposed Solution
Make use of the Interval Scheduling Algorithm as found [here](https://www.codespeedy.com/interval-scheduling-in-python/)

- Loop through arrival time array
- If a new event arrives during or after another event has ended add its arrival time to max set and set the previous event time to the finish time for this event
- Return the maximum of the max_set

```
INPUT:
universityCareerFair([1, 3, 3, 5, 7], [2, 2, 1, 2, 1])


--------------------------------- ---------------------------------
OUTPUT:
('finish_times', [3, 5, 4, 7, 8])
('max set', set([0]))
('max set', set([0, 1]))
('max set', set([0, 1]))
('max set', set([0, 1, 3]))
('max set', set([0, 1, 3, 4]))
('Maximum number of tasks can be executed are', 4)

```

