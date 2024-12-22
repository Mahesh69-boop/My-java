package Stacks;
import java.util.Stack;

public class NextGreaterElement {
    static int[] isGreater(int[] arr){
        Stack<Integer> stack=new Stack<>();
        int a=arr.length;
        int[] result=new int[a];
        for(int i=0;i<a;i++){
            result[i]=-1;
        }
        for(int i=0; i<a;i++){
            while(!stack.isEmpty() && arr[stack.peek()]<arr[i]){
                result[stack.pop()]=arr[i];
            }
            stack.push(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={5,6,8,9,3,4,6};
        int[] result= isGreater(arr);
        for(int num: result){
            System.out.print(num + " ");
        }


    }
       
    }

    

