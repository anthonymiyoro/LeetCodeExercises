## Base task
Given a list of integers, find the consecutive, non-empty subsequence with the highest _sum_.

## Usage
### Input:
A file path to a file with a single line that contains the integer sequence separated by space, e.g.,
```
3 -5 1 2 -1 4 -3 1 -2
```

### Output:
The command should print to stdout the _sum_ of the desired non-empty subsequence, e.g., for the input above the output would be `6` from the subsequence `1 2 -1 4`.


## Extension tasks
After finishing the first task, the following other tasks should be tackled:
* The input is extended by a second parameter `n` that restricts the maximum length of the subsequence to n.
* The input is extended by a third parameter which changes how the metric is calculated.
  Instead of the _sum_ of the values we want to find the highest _sum_ of the absolute values of the differences of neighboring pairs.
  As an example, for the input above the absolute differences would be: `8 6 1 3 5 7 4 3` and therefore the output should be `16` for `n = 4` as `-1 4 -3 1` result in the absolute differences of `5 7 4` which adds up to `16`.
  The expected input parameter is `values` for the original behavior and `differences` for the new one.

## Examples
You can find example input files in the data folder.


```
python find_subsequence.py data/input_1.txt 9 values
>> 6
```

```
python find_subsequence.py data/input_1.txt 4 differences
>> 16
```

```
python find_subsequence.py data/input_2.txt 10 values
>> 27
```

```
python find_subsequence.py data/input_2.txt 5 differences
>> 58
```

```
python find_subsequence.py data/input_3.txt 30 values
>> 44
```

```
python find_subsequence.py data/input_3.txt 10 differences
>> 40
```

### SOLUTION
This is done by iterating over every sub-array from largest_size to smallest_size while using a prefix sum to improve performance

Part of solution is from here: https://www.geeksforgeeks.org/maximum-sum-subsequence-of-length-k/
