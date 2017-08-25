'''Write a function which can add 2 numbers, 3 numbers, 4 numbers and 5 numbers.'''

def AddMultipleNumber(*args):
    sum=0
    print (type(args))
    for i in args:
        sum=sum+i
        print(sum)
AddMultipleNumber(1,2,3)
AddMultipleNumber(2,5)
AddMultipleNumber(2,5,56,65)
AddMultipleNumber(2,5,5,32,45)
      
  

