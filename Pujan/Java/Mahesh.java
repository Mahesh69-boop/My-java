import java.util.Scanner;
public class Mahesh{
    public static int Foccurance(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
              
        }return -1;
    }
    public static void main(String[] args) {
        int[] Arr={12,3,8,7,45,9};
        Scanner a =new Scanner (System.in);
        System.err.println("Enter the Target :");
        int Target= a.nextInt();
        System.out.println(Foccurance(Arr,Target));
    }
}