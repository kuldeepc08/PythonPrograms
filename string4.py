'''Accept string from user and replace occurance of not bad with Good'''

def Replace_Occurance(String,text):
    print String.replace(text,"good")    
	     
def main():
    String,text= input('Enter String')
    String1=Replace_Occurance(String,text)
    print(String1)
if __name__ == '__main__':
    main()
