import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashMap;
class Arrow{
    int data;
    Arrow left,right;
    int height =1;

    public Arrow(int data){
        this.data=data;
        left=right=null;
    }
}

class Binarytree{
    Arrow root;
    int counter=0;
    int  result =-1;
    public static Arrow deleteNode(Arrow root, int key){
        if(root==null){
            return null;
        }
        if(root.data>key){
            root.left=deleteNode(root.left, key);
        }
        else if(root.data<key){
            root.right=deleteNode(root.right, key);
        }
        else{
            if(root.right==null){
                return root.left;
            }
            if(root.left==null){
                return root.right;
            }
            else{
                root.data=DeleteHelper(root.right);
                root.right=deleteNode(root.right,root.data );
            }
        }
        return root;

    }
    static HashMap<Integer,Integer> mahesh = new HashMap<>();
    public static void InorderforMode(Arrow root){
        if(root==null){
            return;
        }
        InorderforMode(root.left);
            if(mahesh.containsKey(root.data)){
                mahesh.put(root.data,mahesh.get(root.data)+1);
            }
            else{
                mahesh.put(root.data,1);
            }
        InorderforMode(root.right);
    }
    static int maxvalue = 0;
    public static int FindMode(Arrow root){
        InorderforMode(root);
        for(Integer value: mahesh.values()){
            maxvalue=Math.max(value,maxvalue);
        }
        return maxvalue;

    }
    public static int DeleteHelper(Arrow root){
        int Minvalue=0;
        while(root.left!=null){
            Minvalue=root.data;
        }
        return Minvalue;
    }

    public static Arrow search(Arrow root, int val){
        if(root==null|| root.data==val){
            return root;
        }
        if(root.data>val){
            return search(root.left, val);
        }
        else{
            return search(root.right, val);
        }
    
    }
    public int height(Arrow root){
        if(root==null){
            return -1;
        }
        else{
            return root.height;
        }
     }
     public int Balancefactor(Arrow root){
        return height(root.left)-height(root.right);
     }
     public Arrow Rightrotation(Arrow root){
        if(root==null){
            return null;
        }
        
            Arrow x=root.left;
            Arrow Temp= x.right;

            x.right=root;
            root.left=Temp;

            root.height = Math.max(height(root.left), height(root.right)) + 1;
            x.height = Math.max(height(x.left), height(x.right)) + 1;


            return x;
     }
     public Arrow leftrotation(Arrow root){
        if(root==null){
            return null;
        }

        Arrow x= root.right;
        Arrow Temp= x.left;

        x.left=root;
        root.right=Temp;

        root.height = Math.max(height(root.left), height(root.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;


        return x;
     }
     public Arrow insert( Arrow root, int value){
        if(root==null){
            root=new Arrow(value);
            return root;
        }
        else if(value<root.data){
            root.left=insert(root.left,value);
        }
        else if (value>root.data){
            root.right=insert(root.right, value);
        }
        
        root.height = Math.max(height(root.left), height(root.right)) + 1;

        int balancefact = Balancefactor(root);

        if(balancefact>1 && value<root.left.data){
            return Rightrotation(root);
        }
        else if(balancefact>1 && value>root.left.data){
            root.left=leftrotation(root.left);
            return Rightrotation(root);
        }
        else if(balancefact<-1 && value>root.right.data){
            return leftrotation(root);
        }
        else if(balancefact<-1 && value<root.right.data){
            root.right=Rightrotation(root.right);
            return leftrotation(root);
        }
        return root;

    }
    public void inOrderTransversal(Arrow root){
        if(root!=null){
            inOrderTransversal(root.left);
            System.err.print(root.data + " ");
            inOrderTransversal(root.right);
        }
    }
    public void inOrderTransversalforKth(Arrow root,int k){
        
        if(root==null){
            return;
        }
        
            inOrderTransversalforKth(root.left,k);
            counter++;
            if(counter==k){
                result= root.data;
                return;

            }
            inOrderTransversalforKth(root.right,k);
        
    }
    public int LowestCommonAncestor(Arrow root, Arrow p, Arrow q){
        if(root==null){
            return -1;
        }
        if((root.data<p.data && root.data>q.data) || (root.data>p.data && root.data<q.data)){
            return root.data;
        }
        if(root.data>p.data && root.data>q.data){
            return LowestCommonAncestor(root.left, p, q);
        }
        if(root.data<p.data && root.data<q.data){
            return LowestCommonAncestor(root.right, p, q);
        }
        return root.data;
    }
    /*public int LowestCommonAncestor(Arrow root, Arrow p, Arrow q){
        if(root==null){
            return -1;
        }
         if (root.data>p.data && root.data>q.data){
            return LowestCommonAncestor(root.left, p, q);
        }
        else if(root.data<p.data && root.data<q.data){
           return  LowestCommonAncestor(root.right, p, q);
        }
        else{
            return root.data;
        }
        
    }*/
    public void preOrdertransversal(Arrow root){
        if(root!=null){
            System.out.print(root.data + " ");
            preOrdertransversal(root.left);
            preOrdertransversal(root.right);
        }
    }
    public int FindKthSmallest(Arrow root,int k){
        inOrderTransversalforKth(root, k);
        return result;
        
    }
    public void preOrderTransversalforKthlargest(Arrow root,int v){
     if(root==null){
        return;
     }
     preOrderTransversalforKthlargest(root.right, v);
     counter ++;
     if(counter==v){
        result = root.data;
        return;
     }
     preOrderTransversalforKthlargest(root.left, v);
    }
    public int Findkthlargest(Arrow root, int v){
        preOrderTransversalforKthlargest(root, v);
        return result;

    }
    public void levelOrderTransversal(Arrow root){
        Queue<Arrow> mahesh = new LinkedList<>();
        mahesh.add(root);
        if(root==null){
            return;
        }
        while(! mahesh.isEmpty()){
            int size = mahesh.size();
            for(int i=0; i<size; i++){
                Arrow current = mahesh.poll();
                System.out.print(current.data + " ");
                if(current.left!=null){
                    mahesh.add(current.left);
                }
                if(current.right!=null){
                    mahesh.add(current.right);
                }
            }
            System.out.println();
        }
        
    

    }
     public void postOrdertransversal(Arrow root){
        if(root!=null){
            postOrdertransversal(root.left);
            postOrdertransversal(root.right);
            System.out.print(root.data + " ");
        }
     }
     public int depth(Arrow root){
        if(root==null){
            return 0;
        }
        return Math.max(depth(root.left), depth(root.right)) +1;
     }
     
     public boolean isValidBST(Arrow root){
       return isValidBST(root,Long.MIN_VALUE, Long.MAX_VALUE);
     }
     private boolean isValidBST(Arrow node, long min, long max){
        if(node==null){ //base case: null nodes are considered valid
            return true;
        }
        if(node.data<=min || node.data>=max){
            return false;
        }
        return isValidBST(node.left, min, node.data) && isValidBST(node.right, node.data, max);
     }
     int Sum=0;
     public int rangeSum(Arrow root, int low, int high){
        if(low>high){
            return -1;
        }
        if(root==null){
            return -1;
        }
        if(root.data>=low && root.data<=high){
           Sum+=root.data;
        }
        if(low<root.data){
            rangeSum(root.left,low,high);
        }
        if(high>root.data){
             rangeSum(root.right,low,high);
        }
        return Sum;

     }
     public void hightbalanced(Arrow root){
        if(root==null){
            System.out.println("The tree is empty");
        }
        int RightHieght= height(root.right);
        int leftHieght = height(root.left);
        int diff = RightHieght-leftHieght;
        if(diff<=1 && diff>=-1){
            System.out.println("The Tree is Balanced");
        }
        else{
            System.out.println("The Tree is not balanced");
        }
        
     }
     public void Search(Arrow root,int value){
        if(root==null){
            System.err.println("The value is not present in the data");
            return;
        }
        if(root.data==value){
            System.out.println("The Value is present in the tree");
            return;
        }
        else if(root.data<value){
            Search(root.right,value);
        }
        else if(root.data>value){
            Search(root.left, value);
        }
        
     }
     public int Maximum(Arrow root){
        if(root==null){
            return -1;
        }
        while(root.right!=null){
            root=root.right;
        }
        return root.data;
     }
    public static void main(String[] args) {
        Binarytree Tree = new Binarytree();
        Tree.root=Tree.insert(Tree.root,4);
        Tree.root=Tree.insert(Tree.root,2);
        Tree.root=Tree.insert(Tree.root,6);
        Tree.root=Tree.insert(Tree.root,1);
        Tree.root=Tree.insert(Tree.root,2);
        Tree.root=Tree.insert(Tree.root,5);
        Tree.root=Tree.insert(Tree.root,6);
        //Tree.root=Tree.insert(Tree.root,35);
        //Tree.root=Tree.insert(Tree.root,40);

        //Node
       
       //Tree.inOrderTransversal(Tree.root);
        int k=Tree.FindMode(Tree.root);
        System.out.println(k);

       


       //Tree.inOrderTransversal(Tree.root);
       //Tree.preOrdertransversal(Tree.root);
       //Tree.postOrdertransversal(Tree.root);
       // System.out.println(Tree.depth(Tree.root));
       //System.out.println(Tree.height(Tree.root));
       // Tree.hightbalanced(Tree.root);
       //Tree.Search(Tree.root,2);
       //System.out.println(Tree.Maximum(Tree.root) );
       //Tree.levelOrderTransversal(Tree.root);
       //System.out.println(Tree.FindKthLargest(Tree.root,7));
       //System.out.println(Tree.Findkthlargest(Tree.root,1));
       //System.out.println(Tree.rangeSum(Tree.root,2,8));
       //System.out.println(Tree.LowestCommonAncestor(Tree.root,Mahesh ,Pujan));
       //System.out.println(Tree.isValidBST(Tree.root));
       




       



    }
}

