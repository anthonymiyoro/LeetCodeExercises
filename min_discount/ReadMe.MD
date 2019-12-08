## Min discount problem (Monotous Stack)

### Problem
In simple words, there is an array - prices array : [5, 4, 5, 1, 3, 3, 8, 2]
The discount on the price is the first equal to or lowest element on the right side of current price. Output the total in the end and also list of items index that will not get any discount.

For example 
5 - 4 = 1
4 - 1 = 3
5 - 1 = 4
1 - 0 = 1 (This element didn't got any discount)
3 - 3 = 0
3 - 2 = 1
8 - 2 = 6
2 - 0 = 2 (This element will also not get discount as no equal to or less than price on right).

Output -
Total = 18
Elements ID not getting discount - 3, 7

Approaches I tried -

    Brute force - Timed out for 3 test cases (They expect lower time complexity)
    Keep a minimum index stored, so only find minIndex when current index is equal to or less than minIndex but it fails in test case like [3, 4, 4, 3].
    It will do 3 - 3, 4 - 3 (incorrect as it should be 4 - 4 as 4 is next equal to or less element available in first right).

Any O(n) or better solution than O(n^2)?

### Proposed Solution

