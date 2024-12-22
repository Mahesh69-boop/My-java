import java.util.Scanner;
public class FTUBS {
    public static int Find(int[] arr, int target){
        int low=0,high=arr.length-1;  
        
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                high=mid-1;
                
            }
            else if(arr[mid]<target){
                low=mid+1;
                
            }
        }return -1;

    }
    public static void main(String[] args) {
        int[] arr={-12,-6,-4,-3,0,3,6,8,12,56,78,90,222};
        Scanner T=new Scanner(System.in);
        System.out.println("Enter the Target ");
        int target= T.nextInt();
        System.out.println("the target is in " + Find(arr,target) + " th index of array");
    }
}
