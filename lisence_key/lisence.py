def solution(S, K):
    
    # Count number of alphanumericals
    numbers = sum(map(str.isdigit, S))
    words = sum(map(str.isalpha, S))
    num_char = numbers + words
    
    # get remainder if any
    remainder = (num_char%K)
    print (remainder)
    
    # get divisor without remainder
    div_result = (num_char//K)
    print (div_result)
    
    if remainder == 0, 
        number_of_groups = div_result
        
    pass
