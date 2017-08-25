'''wap to implemnet queue using list'''
def Push(L1,data):
    L1.append(data)
def Pop(L1):
    data = L1(-1)
    L1.pop(-1)
    return data
#return L1==[]
def isEmpty(L1):
    if (L1==[]):
        Print "List is Empty"
def isFull(L1):
     

def main():
    L1,data= input('Enter the List element and data')
    Li1=Push(L1,data)
    print(Li1)
if __name__ == '__main__':
    main()
