'''InterSection'''

def InverseIntersection(L1,L2):
    L3=[]
    i=0
    j=0
    if type(L1) != type(L2) or type(L2) != type(L1):
        print ("L1 and L2 is not a List")
        return
    L1.sort()
    L2.sort()
	
    while i<len(L2):
        if L2[i] not in L1:
            L3.append(L2[i])
        else:
            L1.remove(L2[i])
        i+=1
    L3.extend(L1)
    return L3
	  

def main():
    L1,L2 = input('Enter the Two Lists')
    Li1=InverseIntersection(L1,L2)
    print(Li1)
if __name__ == '__main__':
    main()
