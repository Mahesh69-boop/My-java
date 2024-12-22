import java.util.Scanner;
public class pay {
    public static void Pay(){
        System.out.println("***********************************************");
        System.out.println("Enter the number to choose the desired pay rate");
        System.out.println("1). $8.75/hr               2). $9.33/hr");
        System.out.println("3). $10.00/hr              4). $12.20/hr");
        System.out.println("***********************************************");
        Scanner sc=new Scanner(System.in);
        double Payrate=0.0;
        double Grosspay=0.0;
        double Tax=0.0;
        double Netpay=0.0;
        int Index=sc.nextInt();
        switch(Index){
            case 1:
            Payrate=8.75;
            break;
            case 2:
            Payrate=9.33;
            break;
            case 3:
            Payrate=10.00;
            break;
            case 4:
            Payrate=12.20;
            break;
            default:
            System.out.println("Invalid option choosed!, Please select the desired payrate by selecting(1,2,3 or 4)");
            return;
        }
        System.out.println("You chose " + Index + ", pay rate will be " + Payrate);
        System.out.println("Enter the hours worked");
        double hours=sc.nextDouble();
       
        if(hours>=0 && hours<=40){
            Grosspay=hours*Payrate;
        }
        else if(hours>40){
            Grosspay=(hours-40)*1.5*Payrate + 40*Payrate;
        }
        else{
            System.out.println("Invalid Input! Please try again");
        }
        if(Grosspay>=0 && Grosspay<=300){
            Tax=(15.0/100)*Grosspay;
        }
        else if(Grosspay>=0 && Grosspay<=450){
            Tax=(15.0/100)*300 + (20.0/100)*(Grosspay-300);
        }
        else if (Grosspay>450){
            Tax=(15.0/100)*300 + (20.0/100)*(150) + (25.0/100)*(Grosspay-450);
        }
        Netpay=Grosspay-Tax;
        System.out.println("The hours worked: " + hours);
        System.out.println("Gross pay: " + Grosspay);
        System.out.println("Tax: " + Tax);
        System.out.println("Net Pay: " + Netpay);
    } 
    public static void main(String[] args) {
        Pay();
        
    }

    
}
