import java.util.Scanner;
public class NumberFun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        double count=0.0;
        double average=0.0;
        System.out.println("Enter numbers to Calculate running sum");
        System.out.println("Enter 0 to End");
        input=sc.nextInt();
        while(input!=0){
            sum+=input;
            count++;
            max=Math.max(max,input);
            min=Math.min(min,input);
            input=sc.nextInt();

        }
        average=sum/count;

        System.out.println("The Sum is " + sum );
        System.out.println("The Minimum Number is " + min);
        System.out.println("The maximum Number is " + max);
        System.out.println("The average of all Numbers is " + average);



        
    }
}
