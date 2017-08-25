'''fibonacci series'''

a=0
b=1
c=input("Enter the number")
print("%d %d"%(a,b))
for x in range(0,c+1,1):
    d=a+b                 
    print(d)
    a=b              
    b=d              
    
