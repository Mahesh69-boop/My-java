import java.util.Arrays;
public class DescendingBu {
    public static int[] descending(int[] arr){
        int a=arr.length;
        for(int i=0;i<a-1;i++){
            for(int j=0;j<a-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp; 
                }
            }
        }
      return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,34,56,78,83,23,19,5,2,9,7};
        System.out.println("The Descinding Shorted array is " + Arrays.toString(descending(arr)));
    }
}
