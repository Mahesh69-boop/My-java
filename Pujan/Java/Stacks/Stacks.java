package Stacks;
class  Stack{
    private int MaxSize;
    private int[] Stackarr;
    private int top;

    public Stack(int maxsize){
        this.MaxSize=maxsize;
        this.Stackarr=new int[maxsize];
        this.top=-1;
    }
    void push(int value){
        if(top==MaxSize-1){
            System.out.println("The Stack is full");
        }
        else{
            Stackarr[++top]=value;
        }
    }
    int pop(){
        if(top==-1){
            System.out.println("The Stack is Empty");
            return -1;
        }
        else{
            return Stackarr[top--];
        }
    }   
    int peek(){
        if(top==-1){
            System.out.println("The Stack is Empty");
            return -1;
        }
        else{
            return Stackarr[top];
        }
    }
    boolean isempty(){
        return top==-1;
    }
    void printStack(){
        if(top==-1){
            System.out.println("the Stack is Empty");
        }
        else{
            for(int i=top;i>=0;i--){
                System.out.println(Stackarr[i] + " ");
            }
            System.err.println();
        }
    }
 }

public class Stacks {
    public static void main(String[] args) {
        Stack mahesh=new Stack(6);
        mahesh.push(10);
        mahesh.push(20);
        mahesh.push(30);
        mahesh.push(40);
        mahesh.push(50);
        mahesh.printStack();
        mahesh.peek();
    }


}
