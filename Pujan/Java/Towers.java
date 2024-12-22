import java.util.Scanner;
public class Towers {
    public static void tower(int a, char s,char h,char d){
        if(a==0){
            return;
        }
        tower(a-1,s,d,h);
        System.err.println(s+"->"+d);
        tower(a-1,h,s,d);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of towers :");
        int n=sc.nextInt();
        char a,b,c ="A","B","C"; 
        tower(n,"a","b ","c");

    }
    
}
