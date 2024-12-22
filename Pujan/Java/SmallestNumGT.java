import java.util.Scanner;
public class SmallestNumGT {
    public static int SmallestG(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while (low<=high) {
            int mid=low+(high-low)/2;
            if(target<arr[mid] && target>=arr[mid-1]){
                return arr[mid];
            }
            else if(target<arr[mid] ){
                high=mid-1;
            }
            else if(target>arr[mid] || target==arr[mid]){
                low=mid+1;
            }
            
        }return -1;

    
    }
    public static void main(String[] args) {
        int[] arr={0,1,3,4,4,4,6,7,9,9,10,17,17,23};
        Scanner A=new Scanner(System.in);
        System.out.println("Enyer the target :");
        int target=A.nextInt();
        System.out.println("The number that is smallest greatest than the " + target + " in the array is "  + SmallestG(arr,target));
        
    }
}
