import java.util.Scanner;
public class TwoSum{
    public static void Smaller(int arr[], int target){
        for(int i=0; i<arr.length;i++){
            if(arr[i]<target){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={12,23,32,12,21,32,61};
        Scanner Tgt= new Scanner(System.in);
        System.out.println("Enter Your target");
        int Target = Tgt.nextInt();
        System.out.println("The array elements Smaller Than" + Target + "are :");
        Smaller(arr, Target);


    }

}
