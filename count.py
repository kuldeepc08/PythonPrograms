''' accept a list from user and an element whose presence in the list is tobe counted'''
count=0
x=input("enter the number")
l2 = input("enter the list element")

for y in l2:
    #l2.count(x)
   if y==x:
        count+=1
print count
	


