import java.util.Scanner;
public class powerraise {
    public static int Power(int a, int b){
        if(b==0){
           return 1;
        }
        return a*Power(a,b-1);
    }
    public static void main(String[] args){
        Scanner A= new Scanner(System.in);
        System.out.println("Enter the base num :"); 
        int a=A.nextInt();
        Scanner B= new Scanner(System.in);
        System.out.println("Enter the Power to be raised :");
        int b=B.nextInt();
        System.out.println("The Power of " + a + " to the " + b + " is " + Power(a,b));

    }
    
}
