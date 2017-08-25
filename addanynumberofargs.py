'''Function to which add any number of arguments'''

def AnyNumberOfArgs(* args):
    sum=0
    for x in args:
        sum=sum+x
        print (sum)
AnyNumberOfArgs()

    
