'''
A
A B
A B C
A B C D
'''

def Pattern(n):
    for i in range(0,n):
        char = 65
        for j in range(0,i+1):
            ch=chr(char)
            print(ch),
            char += 1
        n=n+1
        print'\t\n'
            
def main():
    n=input("Enter the number and char")
    num= Pattern(n)
	

if __name__ == '__main__':
    main()
   
