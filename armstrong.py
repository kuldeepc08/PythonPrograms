'''wap to accept a number from user and check if it is amstrong number'''


def ArmStrongNumber(num):
    rem=0
    cube=0
    while num!=0:              
        rem=num%10
        cube=rem*rem*rem+cube			
        num= int(num//10)       
    return cube


def main():
    num=input("Enter the number")
    num1=ArmStrongNumber(num)
    print("Reverse number is %d" %num1)
    if (num==num1):
        print("Number is ArmStrong")
    else:
        print("Number is not ArmStrong")
    
if __name__=='__main__':
    main()
