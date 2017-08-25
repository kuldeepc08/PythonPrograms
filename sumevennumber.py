'''Write a program to accept value of n and display sum of even numbers from 0 to n.'''
n=input("Enter the number")
sum=0
for x in range (0,n+1):
    if x%2==0:
        sum=sum+x
        print ("Sum of %d is %d"%(x,sum))
