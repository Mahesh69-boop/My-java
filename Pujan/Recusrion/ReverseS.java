import java.util.Scanner;
public class ReverseS {
  public static String reverse(StringBuilder a){
    int b=a.length();
    if(b==0){
        return " ";
    }
    return a.charAt(b-1) + reverse(new StringBuilder(a.substring(0, b - 1)));
};

  public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter the String: ");
        String A= Sc.nextLine();
        StringBuilder sb = new StringBuilder(A);
        System.out.println("the reverse of " + sb + " is " + reverse(sb));
  }
    
}
