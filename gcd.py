'''Write a program to accpet 2 numbers from user and find gcd of them'''
def GCD(num,num1):

    while(num!=num1):
        if(num>num1):
            num=num-num1
            print("GCD is %d" %num)
        else:
            num1=num1-num
    return num
		
def main():
    num,num1=input('Enter the numbers')
    num2,num3=GCD(num,num1)

if __name__=='__main__':
    main()
