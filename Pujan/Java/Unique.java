import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class Unique {
    static int Unique(String s){
        Queue<Character> mahesh= new LinkedList<>();
        Queue<Character> pujan= new LinkedList<>();
        for(char ch: s.toCharArray()){
            mahesh.add(ch);
            
        }
        while(!mahesh.isEmpty()){
            char Current = mahesh.poll();
            boolean flag = false;
            boolean tlg = false;
            for(char c:mahesh ){
                for(char d:pujan){
                    if(c==d){
                        tlg = true;
                    }

                }
                if(Current==c || tlg  ){
                    flag=true;
                    pujan.add(Current);
                    break;

                }
            }
            if(!flag){
                return s.indexOf(Current);
            }
        }
        return -1;
    }
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a String");
    String c= sc.nextLine();
    System.out.println("That Character is " + Unique(c));
   }
    
}
