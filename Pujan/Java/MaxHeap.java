
import java.util.Arrays;

public class MaxHeap {
    private int[] heap;
    private int size;
    private int capacity;

    // Constructor to initialize the heap
    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    // Helper method to get the index of the parent, left child, and right child
    private int getParentIndex(int i) { return (i - 1) / 2; }
    private int getLeftChildIndex(int i) { return 2 * i + 1; }
    private int getRightChildIndex(int i) { return 2 * i + 2; }

    // Helper methods to check if a node has children or a parent
    private boolean hasParent(int i) { return getParentIndex(i) >= 0; }
    private boolean hasLeftChild(int i) { return getLeftChildIndex(i) < size; }
    private boolean hasRightChild(int i) { return getRightChildIndex(i) < size; }

    // Helper methods to get the value of the parent or children
    private int parent(int i) { return heap[getParentIndex(i)]; }
    private int leftChild(int i) { return heap[getLeftChildIndex(i)]; }
    private int rightChild(int i) { return heap[getRightChildIndex(i)]; }

    // Swap two elements in the heap
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Ensure enough space in the array (double size if necessary)
    private void ensureExtraCapacity() {
        if (size == capacity) {
            heap = Arrays.copyOf(heap, capacity * 2);
            capacity *= 2;
        }
    }

    // Insert an element into the heap
    public void insert(int value) {
        ensureExtraCapacity();
        heap[size] = value;
        size++;
        heapifyUp();
    }

    // Heapify up to maintain max-heap property after insertion
    private void heapifyUp() {
        int index = size - 1;
        while (hasParent(index) && parent(index) < heap[index]) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    // Remove and return the maximum element (root) of the heap
    public int extractMax() {
        if (size == 0) throw new IllegalStateException("Heap is empty");
        int maxValue = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown();
        return maxValue;
    }

    // Heapify down to maintain max-heap property after deletion
    private void heapifyDown() {
        int index = 0;
        while (hasLeftChild(index)) { // only need to check left child in a complete binary tree
            int largerChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && rightChild(index) > leftChild(index)) {
                largerChildIndex = getRightChildIndex(index);
            }

            if (heap[index] > heap[largerChildIndex]) {
                break;
            } else {
                swap(index, largerChildIndex);
            }
            index = largerChildIndex;
        }
    }

    // Utility method to print the heap elements
    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    // Get the maximum value without removing it
    public int peek() {
        if (size == 0) throw new IllegalStateException("Heap is empty");
        return heap[0];
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.insert(10);
        maxHeap.insert(15);
        maxHeap.insert(20);
        maxHeap.insert(17);
        
        System.out.println("Max-Heap elements:");
        maxHeap.printHeap();  // Expected output should show max-heap order
        
        System.out.println("Extract Max: " + maxHeap.extractMax());  // Should return the largest element (20)
        maxHeap.printHeap();  // Should show the new max-heap after extraction
    }
}


