'''Write a program to accept DDMMYY from user and check if it is valid date'''

def ValidDDMMYY(dd,mm,yy):
    if dd<32 and dd>0:
        print("%d is Valid Date" %dd)
    else:
        print("Please enter valid date")
    if mm<13 and mm>0:
        print("%d is the valid month" %mm)
    else:
        print("Please enter valid month")
    if yy>0:
        print("%d is the valid Year " %yy)
    else:
        print("Please enter valid Year")
    return dd,mm,yy

def main():
    dd,mm,yy = input("Enter the Valid Date")
    d,m,y = ValidDDMMYY(dd,mm,yy)
		
if __name__ == '__main__':
    main()

