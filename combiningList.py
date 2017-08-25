'''Combining two lists'''

def CombineLists(L1,L2):
    a=L1
    b=L2
    b.extend(a)
    return b


def main():
    L1,L2 = input("Enter List elements")
    result = CombineLists(L1,L2)
    print(result)
	

if __name__ == '__main__':
    main()
