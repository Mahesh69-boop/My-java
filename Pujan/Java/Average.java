import java.util.Scanner;
public class Average{
     
    public static void main (String[] args){
        Scanner a= new Scanner(System.in);
        System.out.println("Enter your first exam Score;");
        double A= a.nextDouble();
        Scanner b=new Scanner(System.in);
        System.out.println("Enter your mid term score:");
        double B=b.nextInt();
        Scanner c=new Scanner (System.in);
        System.out.println("enter your Final grade");
        double C= c.nextDouble();
        double Avg= (A+B+C)/3;
        System.out.printf("The score of First tarm exam is %.2f%n",A);
        System.out.printf("The score of mid term exam is %.2f%n",B);
        System.out.printf("The score of final term exam is %.2f%n",C);
        System.out.printf("The average grade is %.2f%n", Avg);

    }
   
}