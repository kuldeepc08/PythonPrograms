'''Accept string from user and replace the repeated char from string expect first eg. babble -> ba**le'''

def Replace(String,j):
    print String.replace(String,j)  
def main():
    String,j= input('Enter String')
    String1=Replace(String,j)
    print(String1)
if __name__ == '__main__':
    main()
