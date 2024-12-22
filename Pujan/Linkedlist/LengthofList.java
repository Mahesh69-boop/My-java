class Node{
    int data;
    Node Pointer;

    Node(int data){
        this.data=data;
        this.Pointer=null;
    }
}
class Llist{
    Node head;

    void insertAtFirst(int num){
        Node first=new Node(num);
        if(head==null) {
            head=first;
        }
        else{
            first.Pointer=head;
            head=first;
        }
    }
    void display(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data + "->");
            temp=temp.Pointer;
        }
        System.out.println("Null");
    }
    int Length(){
        Node temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.Pointer;
        }
        return len;
    }
}
public class LengthofList {
        public static void main(String[] args) {
            Llist mahesh=new Llist();
            mahesh.insertAtFirst(10);
            mahesh.insertAtFirst(20);
            mahesh.insertAtFirst(90);
            mahesh.insertAtFirst(100);
            mahesh.display();
            int length=mahesh.Length();
            System.out.println("The length of Linkedlist is " + length);
        }   
    }
