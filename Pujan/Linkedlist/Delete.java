class Node{
    int data;
    Node Pointer;

    Node(int data){
        this.data=data;
        this.Pointer=null;
    }
}
class List{
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
    void deletenode(int a){
        Node temp=head, prev=null;
        if(temp!=null && temp.data==a){
            head=temp.Pointer;
            return;
        }
        while(temp!=null && temp.data!=a){
            prev=temp;
            temp=temp.Pointer;
        }
        if(temp==null){
            System.out.println("No key Found in the list");
            return;
        }
        prev.Pointer=temp.Pointer;
        }
     
    void display(){
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.data + "->");
                temp=temp.Pointer;
            }
            System.out.println("Null");
        }
    }

public class Delete {
    public static void main(String[] args) {
        List mahesh=new List();
            mahesh.insertAtFirst(10);
            mahesh.insertAtFirst(20);
            mahesh.insertAtFirst(90);
            mahesh.insertAtFirst(100);
            mahesh.display();
            mahesh.deletenode(20);
            mahesh.display();
    }
    
}

