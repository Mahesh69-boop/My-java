import random
print("lets play a Number Guissing Game")
while  True:
    Userinput = int(input("Enter any Random Number form 0 to 10"))
    a= random.randint(1,10)
    if(Userinput>10 or Userinput<0 ):
        print("You Enter Number is Out of the Boundry 0 to 10, Remember , only enter Number less than 10 and Greater than 0")
        continue
    if(a==Userinput):
        print("Wow! you guessed the Correct Number, The Random Number genereated is indeed " + str(a))
        break
    else:
        print("Opps! Your Number Doesn't match,Please try Again")
    
