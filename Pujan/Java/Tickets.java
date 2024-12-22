import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class Tickets {
    static int ticket(int[] arr, int k){
        Queue<Integer> Mahesh=new LinkedList<>();
        for(int i=0; i<arr.length; i++){
            Mahesh.add(i);
        }
        int time =0;
        while(!Mahesh.isEmpty()){
            int Personindex = Mahesh.poll();

            time++;
            arr[Personindex]--;

            if(Personindex==k && arr[Personindex]==0){
                return time;
            }

            if(arr[Personindex]>0){
                Mahesh.add(Personindex);
            }
        }
        return time;
          
    }
    public static void main(String[] args) {
        int[] arr ={5,1,1,1};
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the index");
        int index = sc.nextInt();
        System.out.println("The total time is " + ticket(arr, index));
    }
    
}
