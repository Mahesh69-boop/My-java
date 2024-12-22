import java.util.Arrays;
public class SelectionS {
    public static int[] Selection(int[] arr){
        int a= arr.length;
        for(int i=0; i<a-1;i++){
            int min=i;
            for(int j=i+1; j<a;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }

            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={6,78,45,21,34,90,5,8,2};
        System.out.println( "The shorted array is : " +  Arrays.toString(Selection(arr)));
    }
    
}
