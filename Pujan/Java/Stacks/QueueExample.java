package Stacks;
 class Queue{
    int front;
    int rare;
    int maxsize;
    int[] arrQ;

    Queue(int size){
        this.maxsize=size;
        this.arrQ=new int[maxsize];
        this.front=0;
        this.rare=-1;
    }
    int pop(){
        if(front>rare){
            System.out.println("The Queue is Empty");
            return -1;
        }
        else{
            return arrQ[front++];
        }
    }
    void push(int value){
        if(rare==maxsize-1){
            System.out.println("The Queue is Full");
        }
        else{
            arrQ[++rare]=value;
        }
    }
    int peek(){
        if(front>rare){
            System.out.println("The Queue is Empty");
            return -1;
        }
        else{
            return arrQ[front];
        }
    }
    boolean isEmpty(){
        return front>rare;
    }
    int size(){
        return rare-front+1;
    }
    void print(){
        if(front>rare){
            System.out.println("The Queue is Empty");
        }
        else{
            for(int i=front; i<=rare; i++){
                System.out.println(arrQ[i]);
            }
        }
    }
}
public class QueueExample {
    public static void main(String[] args) {
        Queue mahesh=new Queue(4);
        mahesh.push(20);
        mahesh.push(30);
        mahesh.push(40);
        mahesh.push(50);
        mahesh.print();
        System.err.println();
        System.out.println(mahesh.size());  
        


    }
}
