public class PeakElement {
    public static int Peak(int[] arr){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
           int mid=low+(high-low)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return arr[mid];
            }
            else if(arr[mid]<arr[mid-1]){
                high=mid-1;
            }
            else if(arr[mid]>arr[mid-1]){
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={11,14,17,20,24,25,24,23,10,23,45,34,31,12};
        System.out.println("The peak element in the array is " + Peak(arr) );
    }
    
}
