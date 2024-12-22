import java.util.Scanner;
public class Zigzaj {
    public static void zig(int a){
        if(a==0){
            return;
        }
        System.out.print(a);
        zig(a-1);
        System.out.print(a);
        zig(a-1);
        System.out.print(a);
        return;
    }
    public static void main(String[] args) { 
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Intiger");
        int a=sc.nextInt();
        zig(a);

      
    }
    
}
