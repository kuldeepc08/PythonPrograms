'''Write a program to accept lower bound from user and find out sum of even and odd numbers separately.'''
n=input("Enter the lower number")
num=input("Enter the upper number")
sum=0
for x in range (n,num):
    if x%2!=0:
        print(x)
        sum=sum+x
        print("Sum of odd Number is - %d  %d" %(n,sum))
