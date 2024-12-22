import java.util.Arrays;
public class BubbleS {
    public static int[] Bubble(int[] arr){
        int a=arr.length;
        for(int i=0;i<a-1;i++){
            for(int j=0;j<a-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp= arr[j];
                arr[j]=arr[j+1];
                arr[j+1]= temp;
            
            }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={6,78,45,21,34,90,5,8,2};
        System.out.println( "The shorted array is : " +  Arrays.toString(Bubble(arr)));
    }
    
}
