class Node{
    int data;
    Node Pointer;

    Node(int data){
        this.data=data;
        this.Pointer=null;
    }
}
class lst{
    Node head;

    void insertAtEnd(int data){
        Node New=new Node(data);
        if(head==null){
            head=New;
        }
        else{
            New.Pointer=head;
            head=New;
        }
    }
    void displayinfo(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ->");
            temp=temp.Pointer;
        }
        System.out.println("null");
    }
    void Reverse(){
        Node current=head, prev=null, next=null;
        while(current!=null){
            next=current.Pointer;
            current.Pointer=prev;

            prev=current;
            current=next;
        }
        head=prev;
    }
}
public class Reverse {
    public static void main(String[] args) {
    lst mahesh=new lst();
    mahesh.insertAtEnd(10);
    mahesh.insertAtEnd(20);
    mahesh.insertAtEnd(90);
    mahesh.insertAtEnd(100);
    mahesh.displayinfo();
    mahesh.Reverse();
    mahesh.displayinfo();
    }
    
}
