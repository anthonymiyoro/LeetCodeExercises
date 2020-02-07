def removeKdigits(num, k):
    result_number = ''
    while k>0:
        for index, digit in enumerate(num[:-1]):
            print ("index, digit",index, digit)
            print ("next number", num[index +1])
            print ("           ")
            if digit > num[index+1]:
                result_number = num[:index] + num[index+1:]
                print ("result_number", result_number)
                k = k-1
                num = result_number
                
    else:
        print ("result_final", result_number)
        return result_number
  
removeKdigits("1432219", 3)