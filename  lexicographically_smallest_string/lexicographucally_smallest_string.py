# Input: "abczd"

def lexiSmallestString(string_input):
    # loop through one letter after another
    for index, letter in enumerate(string_input[:-1]):
        if letter > string_input[index+1]:
            # rebuild string without z if letter is greater than next
            # return "abcd"
            result_string = string_input[:index] + string_input[index+1:]
            print ("letter", letter)
            print ("result string", result_string)
            return (result_string)
        else:
            # else remove last character
            result_string = string_input[:index+1]
            print ("result string", result_string)
            
lexiSmallestString("abczd")
lexiSmallestString("abcde")          
            
        
        

