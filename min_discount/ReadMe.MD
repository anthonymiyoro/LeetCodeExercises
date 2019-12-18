## Min discount problem (Monotonous Stack)

### Problem
In simple words, there is an array - prices array : 
[5, 4, 5, 1, 3, 3, 8, 2]

The discount on the price is the first equal to or lowest element on the right side of current price. Output the total in the end and also list of items index that will not get any discount.

For example:
5 - 4 = 1
4 - 1 = 3
5 - 1 = 4
1 - 0 = 1 (This element didn't got any discount)
3 - 3 = 0
3 - 2 = 1
8 - 2 = 6
2 - 0 = 2 (This element will also not get discount as no equal to or less than price on right).

Output:
- Total [18]
- Elements ID not getting discount  [3, 7]

### Proposed Solution
- Reverse the prices list and loop through it.
- For every item in this list, if the list is empty,add the discount, if any, and then add the current price to the stack.
- If the list is not empty, and the array item is greater than the price, pop element from stack.
- If the item survives this whole ordeal, append to result list.

- Lastly check for list items with the same value in both lists and return their index.

```
Input = [5, 4, 5, 1, 3, 3, 8, 2]

Output = 
('nle_stack', [2])
('result_list', [2])
   
('nle_stack', [2, 8])
('result_list', [2, 6])
   
('nle_stack', [2, 3])
('result_list', [2, 6, 1])
   
('nle_stack', [2, 3, 3])
('result_list', [2, 6, 1, 0])
   
('nle_stack', [1])
('result_list', [2, 6, 1, 0, 1])
   
('nle_stack', [1, 5])
('result_list', [2, 6, 1, 0, 1, 4])
   
('nle_stack', [1, 4])
('result_list', [2, 6, 1, 0, 1, 4, 3])
   
('nle_stack', [1, 4, 5])
('result_list', [2, 6, 1, 0, 1, 4, 3, 1])
   
3
7
('answer', [1, 3, 4, 1, 0, 1, 6, 2])

```

