import java.util.Scanner;
public class Java{
  public static void main(String[] args) {
    Scanner Digits = new Scanner(System.in);
    System.out.println("Enter any Number with at least 5 digits");
    int A= Digits.nextInt();

    int Sum=0;
    int CurrentDigit;

    while (A!=0) {
      CurrentDigit=A%10;
      Sum += CurrentDigit;
      A/=10;
       }
    System.out.println("The Sum of the Digits of Your Number is"+Sum);
    

  }
}