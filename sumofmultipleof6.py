'''Write a program to accept a range from user and display sum of multiple of 6. Hint: Continue'''
ran=input("Enter the range")
sum=0
for x in range (0,ran+1):
    if x%6==0:
	    sum=sum+x
	    print(sum)
