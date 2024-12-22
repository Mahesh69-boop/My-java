import java.util.Scanner;
public class Dividetwo{
    public static void main(String[] args) {
        int count=0;
        int tr=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to see how many times it need to get down to zero by dividing it by 2");
        System.out.println("Enter 0 to quite");
        int num=sc.nextInt();
        int dub=num;
        do{
            tr=dub/2;
            dub=tr;
            count++;
        }while(tr!=0);
        
        System.out.println("It takes " + count + " Times to get " + num + " to 0 by dividing by 2");
    }
}