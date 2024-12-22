public class BinarySearch {
    public static int BinarySearch(int[] arr, int key){
        int first =0;
        int last = arr.length-1;
        while(first<=last){
            int Mid = (arr[first]+ arr[last])/2;
            if(arr[Mid]<key){
                first = Mid+1;
            }
            else if(arr[Mid]>key){
                last = Mid-1;
            }
            else if (arr[Mid]==key){
                return Mid;
            }
        }
        return -1;


    }
    public static void main(String[] args) {
        
    }
    
}
