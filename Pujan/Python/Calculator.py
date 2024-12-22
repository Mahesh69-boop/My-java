Num1= int(input("Enter any Number"))
Num2= int(input("Enter a Second Number"))
operator = str(input("Enter a Operation you want to perform, Only choose among +,-,*,%,/"))
if(operator=="+"):
    result=Num1+Num2
    print("The result is " + str(result))
elif(operator=="-"):
    result=Num1-Num2
    print("The result is " + str(result))
elif(operator=="*"):
    result= Num1*Num2
    print("The result is " + str(result))
elif(operator=="%"):
    result=Num1%Num2
    print("The result is " + str(result))
elif(operator=="/"):
    result=Num1/Num2
    print("The result is " + str(result))
print("Thanks")