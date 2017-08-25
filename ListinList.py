'''List in List'''

def ListInList(L1):
    i=0
    L2=[]
    L1.sort()
    while i<len(L1):
        L3=L1[i]
        print type(L3)
        if type(L1[i])!=list:
            L2.append(L1[i])
            
        else:
            ExtendList(L2,L1[i])
        i+=1
        print ("i=%d" %i)
    return L2

def ExtendList(L2,L3):
    j=0
    while j<len(L3):
        if type(L3[j])!=list:
            L2.append(L3[j])
        else:
            ExtendList(L2,L3[j])
            print("J=%d" %j)
        j+=1
		print("J=%d" %j)
def main():
    L1 = input('Enter the Lists')
    Li1 = ListInList(L1)
    print(Li1)

if __name__ == '__main__':
    main()
