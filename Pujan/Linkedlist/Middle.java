class Node{
    int data;
    Node Pointer;
     Node(int data){
        this.data=data;
        this.Pointer=null;
     }
}
class link{
    Node head;

    void insertatfirst(int key){
        Node New=new Node(key);
        if(head==null){
            head=New;
        }
        else{
            New.Pointer=head;
            head=New;
        }
        
    }
    void midde(){
        Node slow=head;
        Node fast=head;
        while(fast!=null  && fast.Pointer!=null ){
            slow=slow.Pointer;
            fast=fast.Pointer.Pointer;
        }
        System.out.println("The middle node is " + slow.data);

    }
    void displayinfo(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ->");
            temp=temp.Pointer;
        }
        System.out.println("null");
    }
}


public class Middle {
    public static void main(String[] args) {
        link mahesh=new link();
        mahesh.insertatfirst(10);
        mahesh.insertatfirst(20);
        mahesh.insertatfirst(90);
        mahesh.insertatfirst(100);
        mahesh.displayinfo();
        mahesh.midde();
        }
    
}
