'''wap accpet a number from user and define a funtion SumOfCubesOfDigits()'''

def SumOfCubesOfDigits(num):
    rem=0
    cube=0
    while num!=0:              
        rem=num%10
        cube=rem*rem*rem+cube		
        num= int(num//10)       
    return cube


def main():
    num=input("Enter the number")
    num1=SumOfCubesOfDigits(num)
    print("Sum of Cubes of Digits %d" %num1)
    
if __name__=='__main__':
    main()
