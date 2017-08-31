def rotation(x,y):
    if len(x)!=len(y):
        return False
    return y in x+x

if __name__ == "__main__":
    x,y=input("Enter the strings")
    result = rotation(x,y)
    print(result)




