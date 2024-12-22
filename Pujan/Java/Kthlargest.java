import java.util.PriorityQueue;
class Kthlargest {
    private PriorityQueue<Integer> minheap;
    private int k;

    public Kthlargest(int k, int[] num){
        this.k=k;
        minheap = new PriorityQueue<>();
        for(int i: num){
            minheap.add(i);
        }
    }
    public int add(int val){
        minheap.add(val);
        while(minheap.size()>k){
            minheap.poll();
        }
        return minheap.peek();
    }
    public static void main(String[] args) {
        int k = 3;
        int[] nums ={2,4,5,3};
        Kthlargest obj = new Kthlargest(k, nums);
        System.err.println(obj.add(3));
        System.err.println(obj.add(6));
        System.err.println(obj.add(8));
        System.err.println(obj.add(0));
        
    }

    
}
