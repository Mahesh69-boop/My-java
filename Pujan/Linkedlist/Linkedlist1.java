class Node{
    int data;
    Node Pointer;

    Node(int data){
        this.data=data;
        this.Pointer=null;

    }
}
class linkedList{
    Node head;

    public void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node temp =head;
            while (temp.Pointer!=null){
                temp=temp.Pointer;
            }
            temp.Pointer=newNode;
        }
    }
    public void displayElement(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.Pointer;
        }
        System.out.print("null");
    }
}

public class Linkedlist1{
    public static void main(String[] args) {
        Node mahesh=new Node(18);
        linkedList Pujan=new linkedList();
        Pujan.insertAtEnd(10);
        Pujan.insertAtEnd(23);
        Pujan.displayElement();
    }
}