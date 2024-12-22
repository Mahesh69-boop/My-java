package Stacks;
import java.util.Stack;

public class BalancedPranthesis {
    static void isbalanced(String str){
        Stack<Character> stack=new Stack<>();
        for(char ch:str.toCharArray()){
            if(ch!='(' && ch!=')' && ch!='{' && ch!='}' && ch!='['&& ch!=']'){
                System.out.println("Sorry ! unsupported string, You can Only include (,),{,},[,] in Your String");
                return;
            }
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else if(ch==')'||ch=='}'||ch==']'){
                if(stack.isEmpty()){
                   System.out.println("The String is Not balanced");
                   return;
                }
                char top=stack.pop();
                if(ch==')'&& top!='(' || ch=='}' && top!='{' || ch==']' && top!='['){
                    System.out.println("The String is Not balanced");
                    return;
                }

            }
        }
        if(stack.isEmpty()){
            System.out.println("The String is balanced");
        }
        else{
            System.out.println("The String is Not balanced");
        }

    }
    public static void main(String[] args) {
        String Mahesh="(";
        isbalanced(Mahesh);

    }
    
}
