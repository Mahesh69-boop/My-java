package Stacks;
import java.util.Stack;
public class clean {
   static public String makeGood(String s) {
        Stack<Character>mahesh=new Stack<>();
        for(char ch:s.toCharArray()){
            
            while(!mahesh.isEmpty() && Character.toLowerCase(ch) == Character.toLowerCase(mahesh.peek()) &&((Character.isLowerCase(ch) && Character.isUpperCase(mahesh.peek())) || (Character.isUpperCase(ch) && Character.isLowerCase(mahesh.peek())))){
                mahesh.push(ch);
                mahesh.pop();
                mahesh.pop();
            }
           mahesh.push(ch);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < mahesh.size(); i++) {
            stringBuilder.append(mahesh.get(i));
        }
        String result = stringBuilder.toString();
        return result;
    }
    public static void main(String[] args) {
        String a="abBAcC";
        System.out.println(makeGood(a));
    }
    
}
