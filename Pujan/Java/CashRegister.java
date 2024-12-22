import java.util.Scanner;
public class CashRegister{
    public static void main(String[] args) {
        // First declare the Unitprice of each item as a constant Variable 
        final double Apple_price=0.99;
        final double Coke_price=1.99;
        final double Tshirt_price=5.99;
        // Take Input from User About the Quantity of each Item
        Scanner A=new Scanner(System.in);
        System.out.println("Enter the Quantity fo Apple :");
        int Apple= A.nextInt();
        Scanner B=new Scanner(System.in);
        System.out.println("Enter the Quantity fo Coke :");
        int Coke=B.nextInt();
        Scanner C=new Scanner(System.in);
        System.out.println("Enter the Quantity fo Tshirt :");
        int Tshirt=C.nextInt();
        // Create double variables to store the total of each items and the total price costumer has to pay
        double Totala= Apple*Apple_price,Totalc= Coke*Coke_price,Totalt= Tshirt*Tshirt_price,Pay=Totala+Totalc+Totalt;
        // Print it in formated form
        System.out.printf("Item      Unitprice    Quantity     Total%n");
        System.out.printf("-------------------------------------------%n");
        System.out.printf(" Apple       %.2f          %d         %.2f%n ",Apple_price,Apple,Totala);
        System.out.printf("Coke        %.2f          %d         %.2f%n ",Coke_price,Coke,Totalc);
        System.out.printf("T-shirt     %.2f          %d         %.2f%n ",Tshirt_price,Tshirt,Totalt);
        System.out.printf("-------------------------------------------%n");
        System.out.printf("       Total you need to pay    :    %.2f%n ",Pay);
         


       
       
    }
}