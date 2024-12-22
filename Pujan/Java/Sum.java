import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=0;
        int sum=0;
        System.out.println("Enter numbers to Calculate running sum");
        System.out.println("Enter 0 to End");
        input=sc.nextInt();
        while(input!=0){
            sum+=input;
            input=sc.nextInt();
        }
        System.out.println("The Sum is " + sum + ",bye!");


        
    }
}
