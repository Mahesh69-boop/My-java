public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int a = nums.length;
        int totalSum =0;
        int rightSum=0;
        int leftSum=0;
        for( int i=0; i<a; i++){
             totalSum +=nums[i];
        }
        for(int j =0; j<a; j++){
            rightSum = totalSum-leftSum-nums[j];
            if(rightSum==leftSum){
                return j;
            }
            leftSum +=nums[j];
        }
        return -1;
           
    }
    public static void main(String[] args) {
        int[] arr={1, 7, 3, 6, 5, 6};
        System.out.println("The Pivot Index is " + pivotIndex(arr));
    }
    
}
