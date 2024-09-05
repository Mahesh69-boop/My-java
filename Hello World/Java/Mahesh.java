import java.util.Scanner;
public class Mahesh {
 public static int factorial(int number) {
        int result = 1;

       
        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner A =new Scanner(System.in);
        System.out.println("Enter any Number");
        int Num= A.nextInt();

        int factorialResult = factorial(Num);
        System.out.println("The factorial of " + Num + " is: " + factorialResult);
    }
}
    


