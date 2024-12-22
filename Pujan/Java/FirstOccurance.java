import java.util.Scanner;
public class FirstOccurance {
    public static int Occurance(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        
        while (low<=high) {
            int mid=low+(high-low)/2;
            if(target==arr[mid]){
                for(int i=mid;i>=0;i--){
                    if(target!=arr[i]){
                        return i+1;
                    }
                }
            }
            else if(target<arr[mid]){
                high=mid-1;
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
        } return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,6,7,7,7,7,7,8,9,9};
        Scanner A=new  Scanner(System.in);
        System.out.println("Enter the target");
        int target=A.nextInt();
        System.out.println("The first accurance of " + target + " in the array is " + Occurance(arr,target) + " th index of array");
    }
    
}
