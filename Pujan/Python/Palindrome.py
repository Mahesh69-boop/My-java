print("Hey ! Lets play a game, you enter a string and I will check if its a plaindrome or not ")
UserString = str(input("Enter any string"))
reversed_String = UserString[::-1]
if(UserString==reversed_String):
    print("It is a plaindrome number")
else:
    print("It is not a plaindrome number")