'''
       *****
        ****
	 ***
	  **
	   *
'''

def Star(n):
    for i in range(0,n):
        for j in range(0,i*2+1):    
            print '', #add comma to remove newline
        for j in range(0,n-i-1):   # if u start from 1 then  -1 not needed
            print '*',
        print '\n'
       
def main():
    n = input('Enter the number')
    num1=Star(n)

if __name__ == '__main__':
    main()
