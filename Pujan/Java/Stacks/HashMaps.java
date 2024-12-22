package Stacks;
import java.util.HashMap;
public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();

        map.put("Mahesh",18);
        map.put("Pujan",18);
        map.put("Parbat",24);
        System.out.println("Mahesh's Age:" + map.get("Mahesh"));
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        map.remove("Parbat");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
       System.out.println("Is Mahesh in the Map" +map.containsKey("Mahesh")); 
        
}
}
