'''Write a program to accept DDMMYY from user and check if it is valid date.'''
dd=input("Enter the Date")
mm=input("Enter the month")
yy=input("Enter the year")

if dd<32 and dd>0:
    print ("%d is a valid Date" %dd)
else:
    print ("Entered Date is not valid")
if mm<13 and mm>0:
    print ("%d is a valid Month" %mm)
else:
    print ("Entered Month is not valid")
if yy>1918 and yy>0:
    print ("%d is a valid Year" %yy)
else:
    print ("Entered Year is not valid")

