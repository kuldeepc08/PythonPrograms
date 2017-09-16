"""Write a program to count number of lines, number of words and number of character in the given file."""

def Counts():
    infile = open("count.txt", 'r')
    lines = 0
    words = 0
    characters = 0
    for line in infile:
        wordslist = line.split()
        lines = lines + 1
        words = words + len(wordslist)
        characters = characters + len(line)
        print(lines)
        print(words)
        print(characters)

def main():
   Counts()


if __name__ == "__main__":
    main()
