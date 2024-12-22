import java.util.Arrays;
public class Sumofarr {
    public static int Sum(int[] arr,int a){
        if(a>=arr.length){
             return 0;
        }
        return arr[a] + Sum(Arrays.copyOfRange(arr, a+1, arr.length),a++);
        
    }
    public static void main(String[] args) {
        int[] arr={1,45,67,23,19,60};
        int a=0;
        System.out.println("The sum of the element of the array is " + Sum(arr,a));
    
}
}
