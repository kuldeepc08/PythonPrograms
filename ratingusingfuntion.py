'''Write a program to calculate rating where 5 is Exceptional, 4 is Excellent, 3 is Very good, 2 is good and 1 is Poor.'''

def CalculateRating(rating):
    if rating==1 and rating>0:
	    print("Your rating is %d" %rating)
	if rating==2 and rating>1:
	    print("Your rating is %d" %rating)
	if rating==3 and rating>2:
	    print("Your rating is %d" %rating)
	if rating==4 and rating>3:
	    print("Your rating is %d" %rating)
	if rating==5 and rating>0:
	    print("Your rating is %d" %rating)
		
	return rating
	
def main():
    rating=input("Enter the rating")
	rate = CalculateRating(rating)

if __name__ == '__main__':
    main()
 