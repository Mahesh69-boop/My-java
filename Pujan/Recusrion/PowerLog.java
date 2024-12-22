import java.util.Scanner;
public class PowerLog{
    public static int power(int a, int b){
        if(b==1){
            return a;
        }
        if(b==0){
            return 1;
        }
        int x=power(a,b/2);
        int result;
        if(b%2!=0){
            result= x*x*a;
        }
        else{
            result=x*x;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.println("Enter the base");
        int base=sr.nextInt();
        Scanner sa=new Scanner(System.in);
        System.err.println("Enter the power");
        int power=sa.nextInt();
        System.out.println("The power of " + base + " raise to " + power + " is " + power(base,power) );

    }
}