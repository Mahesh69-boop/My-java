import java.util.Scanner;
public  class Stairs{
    public static int stairs(int n){
        if(n<=1){
            return 1;
        }
        return stairs(n-1)+stairs(n-2);
    }
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter the number stairs : ");
        int A=Sc.nextInt();
        System.out.println("The Number of ways to climb stairs if only 2 or 1 steps are taken is " + stairs(A));
    }
    
}
