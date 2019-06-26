class Solution:
    def fib(self, N: int) -> int:
        # We start by providing the fibonaccis for 0 and 1
        if (N == 0):
            return 0;
        elif (N == 1):
            return 1;
        
        first_fibonacci_number = 0;
        second_fibonacci_number = 1;
        
        # Since we've covered the fibonacci of 0 and 1, we continue the counter
        counter = 1;
        
        while (counter<N):
            new_fibonacci_number = first_fibonacci_number + second_fibonacci_number;
            print ("new_fibonacci_number", new_fibonacci_number);
            first_fibonacci_number = second_fibonacci_number;
            print ("first_fibonacci_number", first_fibonacci_number);
            second_fibonacci_number = new_fibonacci_number;
            print ("second_fibonacci_number", second_fibonacci_number);
            counter = counter + 1
            print ("counter", counter);
            print ("      ")
            
        return new_fibonacci_number;
            
s = Solution()
print(s.fib(5))
        
            