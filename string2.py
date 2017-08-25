'''WAP To Accpet two strings from user input string  and count the occurance of search string in Input string with using count method'''

def SearchString(x,y):
    i=0
    count=0
    while i<len(x):
        if x[i]==y:
            count +=1
        i+=1
    return count

def main():
    x,y= input('Enter the List element and data')
    Li1=SearchString(x,y)
    print(Li1)
if __name__ == '__main__':
    main()
