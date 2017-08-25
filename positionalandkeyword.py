'''Write function to understand positional and keyword argument which takes 5 different combinations of function call.'''

def Add(e,a=1,b=2.3,c=3,d=1.2):
    return a+b+c+d+e
add=Add(1)
print(add)
add1=Add(10,30,10,30,40)
print(add1)

    
