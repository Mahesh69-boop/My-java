class AAula{
    int val;
    AAula left,right;

    public AAula(int val){
        this.val=val;
        left=right=null;
    }
}
class BinaryRukh{
    AAula root;
    int counter=0;
    int  result =-1;

     public AAula Insert( AAula root, int value){
        if(root==null){
            root=new AAula(value);
            return new AAula(value);
        }
        else if(value<root.val){
            root.left= Insert(root.left,value);
        }
        else if (value>root.val){
            root.right= Insert(root.right, value);
        }
        return root;

    }
    private void inOrderTraversal(AAula node, StringBuilder sb) {
        if (node != null) {
            inOrderTraversal(node.left, sb);
            sb.append(node.val).append(" ");
            inOrderTraversal(node.right, sb);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        inOrderTraversal(root, sb);
        return sb.toString().trim();
    }
}
public class ARRtoBts {
    public static BinaryRukh ArrtoBST(int[] arr){
        BinaryRukh Mahesh = new BinaryRukh();
        int mid = arr.length/2;
        for(int i=mid; i>=0; i--){
           Mahesh.root= Mahesh.Insert(Mahesh.root,arr[i]);
        }
        for(int j=mid; j<arr.length; j++){
            Mahesh.root=Mahesh.Insert(Mahesh.root,arr[j]);
        }
        return Mahesh;

    }
    public static void main(String[] args) {
        int[] arr ={2,3,4,5,6,7,8,9,10};
        BinaryRukh bst=ArrtoBST(arr);
        System.out.println("BTS in order :" + bst);
        
    }
    
}
