'''Palindrome number'''


def Reverse(num):
    rem=0
    while num!=0:              
        rem=num%10+rem*10        
        num= int(num//10)       
    return rem

def main():
    num=input("Enter the number")
    num1=Reverse(num)
    print("Reverse number is %d" %num1)

    if (num1==num):
        print("Number is palindrome")
    else:
        print("Number is not palindrome")
    
if __name__=='__main__':
    main()
