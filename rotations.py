"""    Write a program to accept a string from user which has consecutive repetitive character output should be the string (Running length encoding)

Input: aaabbbcccdabe

Output: a3b3c3dabe  """


def rotation(text):
    count=1
    length=""
    for i in range(1,len(text)):
        if text[i-1]== text[i]:
            count+=1
        else :
            length += text[i-1]+" "+str(count) +" "
            count=1
    length += (text[i]+" "+str(count))
    return length


def main():
    text = input("enter the string")
    string = rotation(text)
    print(string)
if __name__ == "__main__":
    main()