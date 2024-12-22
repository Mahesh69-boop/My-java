import java.util.Scanner;
public class factorial {
    public static int factorial(int a){
        if(a==0){
            return 1;
        }
        
            return a*factorial(a-1);
    }
    public static void main(String[] args) {
        Scanner b=new Scanner(System.in);
        System.out.println("Enter any integer :");
        int B=b.nextInt();
        System.out.println("The factorial of " + B + " is " + factorial(B));
        
    }
    
}
