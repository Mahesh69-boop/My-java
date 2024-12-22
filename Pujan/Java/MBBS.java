import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
public class MBBS{
    public static  int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mahesh= new HashMap<>();
        for(int n: nums){
            mahesh.put(n,mahesh.getOrDefault(n,0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> Pujan = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());

        for(Map.Entry<Integer, Integer> entry: mahesh.entrySet()){
            Pujan.add(entry);
            if(Pujan.size()>k){
                Pujan.poll();
            }
        }
        int[] result = new int[k];
        int Counter =0;
        while(!Pujan.isEmpty()){
            result[Counter++]= Pujan.poll().getKey();
        }
        return result;
    }
}
