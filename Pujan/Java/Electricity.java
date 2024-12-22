import java.util.Scanner;
public class Electricity {
    public static void MyBill(double a){
        double total=0.0;
        if(a<0){
            System.out.println("Invalid Power used !, Please check Again ");
            return;
        }
        else if(a<=360){
            total=a*0.12589;
        }
        else if(a>360 && a<=680){
            total=360*0.12589 + (a-360)*0.17901;
        }
        else if(a>680){
            total=360*0.12589 + 320*0.17901 + (a-680)*0.20971;
        }
       
        System.out.println("The bill for " + a + " is $" + total);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the KWH used :");
        double power=sc.nextDouble();
        MyBill(power);
    }
    
}
