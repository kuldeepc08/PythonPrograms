'''Write a program to input 3 numbers from user and compare largest among them.'''
def CompareThreeNumber(num,num1,num2):
    if num>num1 and num>num2:
        print ("%d is largest number " %num)
    elif num1>num2:
        print ("%d is largest number " %num1)
    else:
        print ("%d is largest number " %num2)
    return num,num1,num2

def main():
    num,num1,num2=input("Enter the numbers")
    a,b,c = CompareThreeNumber(num,num1,num2)

if __name__=='__main__':
    main()
        

	
