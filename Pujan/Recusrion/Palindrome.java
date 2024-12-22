import java.util.Scanner;
public class Palindrome {
    public static void palindrome(String a){
        int n=a.length(), m=0;
        if(a.charAt(m)!= a.charAt(n-1)){
            System.out.println("The string is not plaindrome");
            return;
        }
        if(n<=1){
            System.out.println("the string is plaindrome ");
            return;
        }
        palindrome(a.substring(1, n-1));

    }
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter the String: ");
        String A= Sc.nextLine();
        palindrome(A);
    }
}
