import java.util.Scanner;
public class BorderChar{
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Please Enter a String");
        String A=src.nextLine().trim();
        String New=""+A.charAt(0)+A.charAt(A.length()-1);
        System.out.println("The String entered by user : " + A);
        System.out.println("The new border char String : " + New);
    }    
}
