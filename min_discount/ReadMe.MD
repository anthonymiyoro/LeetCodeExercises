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

