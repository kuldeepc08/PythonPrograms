'''Programs on String'''
def Count(x,y):
    count=0
    i=0
    while i < len(x):
        if x[i]==y:
            count+=1
        i+=1
    print count
def main():
    x,y = input('Enter the Two String')
    result=Count(x,y)
    print result
if __name__ == '__main__':
    main()
