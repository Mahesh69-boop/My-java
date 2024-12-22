import java.util.Scanner;
public class CheckPresence {
    public static int Presence(int[] arr,int target){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                c++;
        
            }
       }return c; 
    }
    public static void main(String[] args) {
        int[] arr={12,34,21,5,6,7,23,43,90,7,12,7,};
        Scanner Sr= new Scanner(System.in);
        System.out.println("Enter the Target");
        int Target= Sr.nextInt();
        System.out.println("The " + Target + " is present " + Presence(arr,Target) + " in the array");

    }
    
}
