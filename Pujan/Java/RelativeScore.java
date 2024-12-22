import java.util.PriorityQueue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class RelativeScore {
    public static String[] RltScore(int[] Score){
        HashMap<Integer,Integer> Pujan = new HashMap<>();
     for(int i =0; i<Score.length; i++){
        Pujan.put(i, Score[i]);
    }
     PriorityQueue<Integer> Mahesh = new PriorityQueue<>(Collections.reverseOrder());
        for(int val : Pujan.values()){
            Mahesh.add(val);
        }
    String[] result = new String[Mahesh.size()];
    int rank =1;
    int x= -1;
    while(!Mahesh.isEmpty()){
       x = Mahesh.poll();
       int idx= 0;
       for(Map.Entry<Integer,Integer> entry : Pujan.entrySet()){
        if(entry.getValue()==x){
             idx= entry.getKey();
             break;
        }
       }
       if(rank ==1){
       result[idx]="GoldMedal";
       }
       else if(rank == 2){
        result[idx]="SilverMedal";
       }
       else if(rank==3){
        result[idx] ="BornzMedal";
       }
       else{
        result[idx]=Integer.toString(x);
       }
       rank++;

    }
    return result;

    }
    public static void main(String[] args) {
        int[] scores = {5,2,6,8,9,3,};
        String[] v=RltScore(scores);
        for(int i=0; i<v.length; i++){
            System.out.print(v[i] + " ");
        }
    }
}
