import java.util.Scanner;
public class Cfoctor {
    public static int Factor(int a,int b){
        int x =Math.max(a,b);
        int y =Math.min(a,b);
        if(y==0){
            return x;
        }
        return Factor(y,x%y) ;
        
    }
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        System.out.println("Enter the integer : ");
        int B=a.nextInt();
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter the integer : ");
        int A=Sc.nextInt();
        System.out.println("The Greatest common divisor is : " + Factor(B,A));
    }
}
