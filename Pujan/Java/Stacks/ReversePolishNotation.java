package Stacks;
import java.util.Scanner;

import java.util.LinkedList;
import java.util.Queue;
public class ReversePolishNotation {
    static int notation(String Mahesh){
        Queue<Character>stack=new LinkedList<>();
        Queue<Integer>stack2=new LinkedList<>();
        int result=0;

        for(char ch:Mahesh.toCharArray()){
            if(ch=='*'|| ch=='+'|| ch=='-' || ch=='/' || ch=='%'){
                stack.add(ch);
            }
            else{
                stack2.add(Character.getNumericValue(ch));
            } 
        }
            
            int s2=stack2.remove();
            int s3=stack2.remove();
            int s=stack.remove();
            
            if(s=='*'){
                result=s2*s3;
            }
            else if(s=='+'){
                result=s2+s3;
            }
            else if(s=='-'){
                result=s2-s3;
            }
            else if(s=='/'){
                result=s2/s3;
            }
            else if(s=='%'){
              result=s2%s3;
            }

        while(!stack.isEmpty() || !stack2.isEmpty()){
            s2=stack2.remove();
            s=stack.remove();
            if(s=='*'){
                result*=s2;
            }
            else if(s=='+'){
                result+=s2;
            }
            else if(s=='-'){
                result-=s2;
            }
            else if(s=='/'){
                result/=s2;
            }
            else if(s=='%'){
              result%=s2;
            } 
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the operation in Reverse polish notation");
        String Mahesh=sc.nextLine();
        System.out.println("The result is " + notation(Mahesh));
        
    }
    
}
