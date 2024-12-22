public class peak {
    
        public static int Peak(int[] arr){
            int low = 0;
            int high = arr.length - 1;
            
            while (low <= high) {
                int mid = low + (high - low) / 2;
                
                // Check if mid is the peak element
                if ((mid == 0 || arr[mid] > arr[mid - 1]) && (mid == arr.length - 1 || arr[mid] > arr[mid + 1])) {
                    return arr[mid];
                }
                // If the element to the left is greater, move left
                else if (mid > 0 && arr[mid] < arr[mid - 1]) {
                    high = mid - 1;
                }
                // If the element to the right is greater, move right
                else {
                    low = mid + 1;
                }
            }
            return -1;
        }
    
        public static void main(String[] args) {
            int[] arr = {11, 14, 17, 20, 24, 25, 24, 23, 10, 23, 45, 34, 31, 12};
            System.out.println("The peak element in the array is " + Peak(arr));
    }
    
    
}
