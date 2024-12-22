class Node{
    int data;
    Node Pointer;

    Node(int data){
        this.data=data;
        this.Pointer=null;
    }
}
class list{
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
    void search(int key){
        Node a=head;
        while (a!=null){
            if(a.data==key){
                System.out.println("The " +  key + " is present at the list");
                return;
            }
            a=a.Pointer;
    }
    System.out.println("The " + key + "is not present at the list");
}
}
public class Search {
    public static void main(String[] args) {
        list mahesh=new list();
            mahesh.insertAtFirst(10);
            mahesh.insertAtFirst(20);
            mahesh.insertAtFirst(90);
            mahesh.insertAtFirst(100);
            mahesh.display();
            mahesh.search(20);
    }
}
    
