A = "cdabcdab"
B = "abcd"
result = ""
counter = 0

for char in A:
    result = result + char
    print (result)
    if B.find(result):
        print ("here!")
        print (B)
        # Resest result string
        result = ""
        counter = counter + 1
        
    
