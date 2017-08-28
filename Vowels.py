def findVowels(text):
    vowels=0
    consonants=0
    for i in text:
        if(i=='a' or i=='e' or i=='i' or i=='o' or i=='u' or i=='A' or i=='E' or i=='I' or i=='O' or i=='U'):
            vowels=vowels+1
        else:
            consonants=consonants+1


    return vowels,consonants

def main():
    text = input("Enter the String")
    allVowels,allConsole = findVowels(text)
    print("Vowels are =  " +str(allVowels))
    print(" consonents are = " +str(allConsole))
if __name__ == '__main__':
    main()