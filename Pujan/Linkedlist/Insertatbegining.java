class Node{
    int data;
    Node Pointer;

    Node(int data){
        this.data=data;
        this.Pointer=null;
    }
}
class LinkedList{
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
        System.out.print("Null");
    }

}
public class Insertatbegining {
    public static void main(String[] args) {
        LinkedList mahesh=new LinkedList();
        mahesh.insertAtFirst(10);
        mahesh.insertAtFirst(20);
        mahesh.insertAtFirst(90);
        mahesh.insertAtFirst(100);
        mahesh.display();
    }
    
}
