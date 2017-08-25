'''pattern
*****
****
***
**
*

'''

  
def Star(num):
    x=1
    for x in range(num,0,-1):
        print
        for y in range(1,x+1):
            print'*',
    print
    return 0
       
def main():
    num = input('Enter the number')
    num1=Star(num)

if __name__ == '__main__':
    main()
