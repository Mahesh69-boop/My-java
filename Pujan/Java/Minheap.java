import java.util.Arrays;

public class Minheap {
    private int[] heap;
    private int capacity;
    private int size;

    public Minheap(int capacity){
       this.heap= new int[capacity];
       this.size=0;
       this.capacity= capacity;
    }

    private int Indexofparent(int i) {return (i-1)/2;}
    private int IndexofleftChild(int i) {return (i*2+1);}
    private int IndexofrightChild(int i) {return (i*2+2);}

    private boolean hasparent(int i) {return (i-1)/2>=0;}
    private boolean hasLeftChild(int i) {return (i*2+1)<=size;}
    private boolean hasRightChild(int i) {return (i*2+2)<=size;}

    private int valueofparent(int i){return heap[(i-1)/2];}
    private int valueofLeftChild(int i) {return heap[i*2+1];}
    private int valueofRightChild(int i){return heap[i*2+2];}

    private void swap(int i, int j){
        int temp = heap[i];
        heap[i]=heap[j];
        heap[j]=temp;
    }
    private void ensureCapacity(){
        if(capacity==size){
             heap = Arrays.copyOf(heap, capacity * 2);
             capacity *= 2;
        }
    }
    private void insert(int i){
        ensureCapacity();
        heap[size]= i;
        size++;
    }
    private void heapifyUp(){
        int index = size-1;
        while(hasparent(index) && heap[Indexofparent(index)]>heap[index]){
            swap(Indexofparent(index),index);
            index=Indexofparent(index);
        }
    }
    private int extractMin(){
        if (size == 0) throw new IllegalStateException("Heap is empty");
        int Minval=heap[0];
        heap[0]=heap[size-1];
        size--;
        Heapyfydown();
        return Minval;
        }
    private void Heapyfydown(){
        int index =0;
        while(hasLeftChild(index)){
            int SmallerchildIndex = IndexofleftChild(index);
            if(hasRightChild(index) && valueofRightChild(index)<valueofLeftChild(index)){
                SmallerchildIndex = IndexofrightChild(index);
            }
            if(heap[index]<heap[SmallerchildIndex]){
                break;
            }
            else{
                swap(index,SmallerchildIndex);
            }
            index=SmallerchildIndex;
        }
    }
    private void PrintHeap(){
        for(int i=0; i<size; i++){
            System.err.print(heap[i] + " ");
        }
        System.out.println();
    }
    private int peek(){
        if(size==0) throw new IllegalStateException("Heap is empty");
        return heap[0];
    }
    public static void main(String[] args) {
        Minheap Mahesh = new Minheap(5);
        Mahesh.insert(1);
        Mahesh.insert(2);
        Mahesh.insert(3);
        Mahesh.insert(4);
        Mahesh.insert(5);
        Mahesh.PrintHeap();
        Mahesh.peek();
        Mahesh.extractMin();
        Mahesh.PrintHeap();

    }

}
