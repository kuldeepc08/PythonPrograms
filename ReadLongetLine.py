"""Write a program which returns longest line in the given file."""

def length():
    maxlength = 0
    maxlinetext = ""
    infile = open("readfile.txt","r")
    for line in infile:
        linelength = len(line)
        if linelength > maxlength:
            #If linelength is greater than maxlength value the new value is linelength
            maxlength = linelength
            maxlinetext = line
    print maxlinetext
    infile.close()

def main():
    length()

if __name__ == "__main__":
    main()