import java.util.Scanner;
public class Print1ton {
    public static void Print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        Print(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter any Integer");
        int A=Sc.nextInt();
        Print(A);
    }

    
}
