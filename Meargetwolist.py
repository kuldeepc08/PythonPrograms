# Mearge two list
def MergeTwoList(Li1,Li2):
    Li3=[]
    i=0
    j=0
    if type(Li1) != type(Li2) or type(Li2) != type(Li1):
        print ("Li1 and Li2 is not a List")
        return
    if len(Li1)!=len(Li2):
        return
    Li1.sort()
    Li2.sort()
    while i<len(Li1) and j<len(Li2):
        if Li1[i] < Li2[j]:
            Li3.append(Li1[i])
            i+=1
        else:
           Li3.append(Li2[j])
           j+=1
    if i<len(Li1):
        Li3.extend(Li1[i:])
    if j<len(Li2):
        Li3.extend(Li2[j:])
    return Li3

def main():
    Li1,Li2 = input("Enter List elements")
    result = MergeTwoList(Li1,Li2)
    print(result)
	

if __name__ == '__main__':
    main()
