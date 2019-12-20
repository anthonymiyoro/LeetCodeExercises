# To do two way sort. First sort even numbers in ascending order, 
# then odd numbers in descending order. 

def twoWaySort(arr):
    
    n = len(arr)
    
    # Make all odd numbers negative 
    for i in range(0, n):
        
        # Check for odd number and make it negative
        if ((arr[i] % 2) != 0):  
            arr[i] = arr[i] * -1
            
    # Sort all numbers 
    arr.sort() 
    
    # Return the original array
    for i in range(0, n):
        if ((arr[i] % 2) != 0):
            arr[i] = arr[i] * -1
            
    print (arr)
            
arr = [1, 2, 3, 5, 4, 7, 10]
twoWaySort(arr)
