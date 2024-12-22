class Node{
    int data;
    Node Pointer;
     Node(int data){
        this.data=data;
        this.Pointer=null;
     }
}
class Link{
    Node head;
    void insertatFirst(int key){
        Node New=new Node(key);
        if(head==null){
            head=New;
        }
        else{
            New.Pointer=head;
            head=New;
        }     
    }
    public Node merge(Node A, Node B){
       Node h1=A;
       Node h2=B;
       Node New=new Node(0);
       while(h1!=null || h2!=null){
        if(h1.data<=h2.data){
            New.Pointer=h1;
            h1=h1.Pointer;
         }
         else{
            New.Pointer=h2;
            h2=h2.Pointer;
         }
         New=New.Pointer;
       }
       if(h1!=null){
        New.Pointer=h1;
       }
       else{
        New.Pointer=h2;
       }
       return New;


    }
    void loop(){
        head.Pointer.Pointer.Pointer=head.Pointer;
    }
    void insertAtLast(int b){
        Node New=new Node(b);
        if(head==null){
            head=New;
            return;
        }
        Node temp=head;
        while (temp.Pointer!=null) {
            temp=temp.Pointer;
        }
        temp.Pointer=New;
    }
    void deleteduplicate(){
        Node First=head.Pointer;
        Node Second=head;
        while(First!=null && First.Pointer!=null){
            if(First.data==Second.data){
                Second.Pointer=First.Pointer;
                First=First.Pointer;
            }
            else{
                Second=Second.Pointer;
                First=First.Pointer;
            }
        }
    }
    void findNthFromEnd(int a){
        Node first=head;
        Node second=head;
        for (int i = 0; i < a; i++) {
            if (first == null) {
                System.out.println("The list is shorter than " + a + " nodes.");
                return;
            }
            first = first.Pointer; 
        }
           
        while(first!=null){
            first=first.Pointer;
            second=second.Pointer;
        }
    System.out.println("The " + a +"th Node of the List is " + second.data);

    }
    void displayinfo(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ->");
            temp=temp.Pointer;
        }
        System.out.println("null");
    }
    void detect(){
        Node tort=head;
        Node rabbit=head;
        
        while(rabbit!=null && rabbit.Pointer!=null){
            tort=tort.Pointer;
            rabbit=rabbit.Pointer.Pointer;

            if(tort==rabbit){
                System.out.println("There is loop in the LinkedList");
                return;
            }
                
            }
            System.out.println("There is no loop in the linkedList");
            
        }
    void deleteList(){
        head=null;
    }
        
    }


public class Detectloop {
    public static void main(String[] args) {
        Link pujan=new Link();
        pujan.insertAtLast(20);
        pujan.insertAtLast(30);
        pujan.insertAtLast(40);
        pujan.insertAtLast(60);
        pujan.insertAtLast(100);
        Link mahesh=new Link();
        mahesh.insertAtLast(50);
        mahesh.insertAtLast(70);
        mahesh.insertAtLast(80);
        mahesh.insertAtLast(90);
        
    }
   
    
}
