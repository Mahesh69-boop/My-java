public class Project{
    public static void main(String[] args) {
        int arr[]= {23,26,65,45,78,93,};
        int Max= arr[0];
        for(int i=1; i<arr.length;i++){
            if(Max<arr[i]){
                Max=arr[i];
                }
        }
        int Max2 =arr[0];
        for(int j=1;j<arr.length;j++){
            if(Max2<arr[j] && arr[j]<Max){
                Max2=arr[j];
            }
        }
        System.out.println("The second HIghest NUmber of the array is" +Max2);
}
}