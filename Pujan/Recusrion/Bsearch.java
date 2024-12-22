import java.util.Scanner;
public class Bsearch {
    public static int Search(int[] arr,int low,int high, int target){

        if(low>high){
            return -1;
        }
        int mid= low+(high-low)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]<target){
            return Search(arr,mid+1,high,target);
        }
        return Search(arr,low,mid-1,target);

    }
    public static void main(String[] args) {
        int [] arr={1,4,6,7,12,45,56,67,75,83,85,99};
        int low= 0;
        int high= arr.length-1;
        Scanner Se=new Scanner(System.in);
        System.out.println("Enter the target");
        int target= Se.nextInt();
        int result=Search(arr,low,high,target);
        if(result==-1){
            System.out.println("There is no " + target + " in the array");
        }
        else{
            System.out.println("The index of " + target + " in the array is " + result);
        }
    }
    
}
