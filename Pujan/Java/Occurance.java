import java.util.Scanner;
public class Occurance {
    public static int occurance(int[] arr,int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }

     }return count;
     
    }
    public static void main(String[] args) {
        int[] arr={1,2,13,41,56,13,2,4,2,2,9};
        Scanner T=new Scanner(System.in);
        System.out.println("Enter Your Target");
        int target=T.nextInt();
        System.out.println("This target is occuring " + occurance(arr,target) + " times in the array");
        
    }
    
}

