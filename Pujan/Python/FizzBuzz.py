Rg = int(input("Lets play a fizzBuzz Game, enter any Integer number to start"))
for i in range(Rg):
    if(i%3==0 and i%5==0):
        print("FizzBuzz")
    elif(i%5==0):
        print("Buzz")
    elif(i%3==0):
        print("Fizz")
    else:
        print(i)