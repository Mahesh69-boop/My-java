import java.util.Scanner;
public class SimpleCalculator{
    public static void main(String[] args){
        int a=0,b=0, result=0;
        Scanner A = new Scanner(System.in);
        System.out.println("Enter A");
        a= A.nextInt();
        Scanner B = new Scanner(System.in);
        System.out.println("Enter B");
        b= B.nextInt();
        result = a*b;
        System.out.println("The product of" + a + "and" + b + "is" + result);
        System.out.printf("The producu of %d and %d is %d%n ", a,b,result);
    }

}