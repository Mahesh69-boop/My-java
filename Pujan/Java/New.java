import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class New {
   
    public static int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequency of each number
        HashMap<Integer, Integer> Pujan = new HashMap<>();
        for (int num : nums) {
            Pujan.put(num, Pujan.getOrDefault(num, 0) + 1);
        }

        // Step 2: Use a min-heap to keep track of top k frequent numbers
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue() // Min-heap, sorted by frequency
        );

        // Add all entries to the heap, and keep only k most frequent numbers
        for (Map.Entry<Integer, Integer> entry : Pujan.entrySet()) {
            minHeap.add(entry);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the least frequent element if size exceeds k
            }
        }

        // Step 3: Prepare the result array
        int[] result = new int[k];
        int counter = 0;
        while (!minHeap.isEmpty()) {
            result[counter++] = minHeap.poll().getKey();  // Get the number from the heap
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 1, 2, 3, 2, 3, 1, 2};
        int[] last = topKFrequent(a, 2);
        for (int n : last) {
            System.out.println(n);
        }
    }
}


