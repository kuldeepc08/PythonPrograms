'''even odd using funtion'''
print("Its fun")
def SumofOddAndEven(lb,ub):
    sum_even=0
    sum_odd=0
    while lb<=ub:
        if lb%2==0:
            sum_even=sum_even+lb
        else:
            sum_odd=sum_odd+lb
        lb+=1
    return sum_even, sum_odd
if __name__ == '__main__':                  
    lb,ub = input("Enter two variables :")
    r1,r2 = SumofOddAndEven(lb,ub)
    print("Value of %d %d" %(r1,r2))
