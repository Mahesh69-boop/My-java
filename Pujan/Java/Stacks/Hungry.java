package Stacks;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Hungry {
    static public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> Mahesh=new Stack<>();
        Queue<Integer> Pujan = new LinkedList<>();
        int a = students.length;
        int b = sandwiches.length;
        for(int i=0; i<a; i++){
            Pujan.add(students[i]);
        }
        for(int j= b-1; j>=0; j--){
            Mahesh.push(sandwiches[j]);
        }
        int count=0;
        while(count!=Pujan.size() && !Mahesh.isEmpty()){
                if(Pujan.peek()==Mahesh.peek()){
                   Pujan.poll();
                   Mahesh.pop();
                   count =0;
           }
                 else{
                  Pujan.add(Pujan.poll());
                  count++;
            }
            }
  
        
        return Pujan.size();
        
    }
    
       public static void main(String[] args) {
        int[] std={0,0,0,1,1,1,1,1,1,0,1,1,1,1,0,1,1,1,1,0,0,1,1,1,0,1,0,1,1,0,0,0,0,0,1,1,1,1,0,0,0,0,0,1,1,1};
        int[] swh={1,0,0,0,0,0,0,1,1,0,1,1,0,1,1,1,0,0,0,1,1,0,1,1,1,1,1,1,1,0,0,1,0,0,1,0,1,0,1,0,1,1,1,0,1,0};
        System.err.println(countStudents(std,swh));
    }
    
}
