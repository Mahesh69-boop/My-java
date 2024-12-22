import java.util.Scanner;
public class Printto1 {
    public static void print(int a){
        printHelper(1,a);
    }
    public static void printHelper(int i,int a){
        if(i>a){
            return;
         }
         System.out.println(i);
         printHelper(i+1,a);
    }
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the integer");
        int A=a.nextInt();
        print(A);
    }
    
}
