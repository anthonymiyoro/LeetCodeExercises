A = "cdabcdab"
B = "abcd"
counter = 0
appended_string = ""
string_length = len(B)
print ("String Length", string_length)


char_index = 0
while char_index <= len(A):
    # print(A[char_index])
    
    # Build A to new string using each character one by one
    appended_string = appended_string + (A[char_index])
    

    # search using last 2 characters of string B
    search_string_end = B[-2:]
    search_string_start = B[:2]
    
    if appended_string.endswith(search_string_end):
        print ("appended_string_end", appended_string)
        # Reset result string
        appended_string = ""
        counter = counter + 1
        print (counter)
        print (" ")
        char_index += 1

        
    elif appended_string.startswith(search_string_start):
        print ("appended_string_start", appended_string)
        # Reset result string
        appended_string = ""
        counter = counter + 1
        print (counter)
        print (" ")
        # if we find a match at the begonning of the string, skip to next part of string
        char_index = char_index + (2-string_length)
        
    else:
        print ("appended_string", appended_string)
        print (" ")
        char_index += 1
        