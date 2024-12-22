import java.util.LinkedList;
class ListNode{
    int data;
    ListNode Pointer;

    ListNode(int data){
        this.data=data;
        this.Pointer=null;
    }
}
class Tir{
    int data;
    Tir left,right;

    public Tir(int data){
        this.data=data;
        left=right=null;
    }
}
public class BSTtoList {
    public static ListNode BSTtolist(Tir root){
        LinkedList<Integer> Mahesh = new LinkedList<>();

       helper(root,Mahesh);

       ListNode head = null;
       ListNode Current = null;

       for(int val : Mahesh){
          ListNode newNode =  new ListNode(val);
          if(head==null){
            head=newNode;
            Current=head;
          }
          else{
            Current.Pointer=newNode;
            Current=Current.Pointer;
          }
       }
       return head;
    


    }
    private static void helper(Tir root, LinkedList Mahesh  ){
        if(root==null){
            return;
        }
        helper(root.left, Mahesh);
        Mahesh.add(root.data);
        helper(root.right, Mahesh);
    }
    public static void main(String[] args) {
        Tir root = new Tir(5);
        root.left = new Tir(3);
        root.right = new Tir(8);
        root.left.left = new Tir(2);
        root.left.right = new Tir(4);
        root.right.left = new Tir(7);
        root.right.right = new Tir(9);

        ListNode Crr = BSTtolist(root);
        while(Crr!=null){
            System.err.print(Crr.data + "->");
            Crr=Crr.Pointer;

        }
    }
}
