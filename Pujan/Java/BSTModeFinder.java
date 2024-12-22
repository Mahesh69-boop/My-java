import java.util.HashMap;
import java.util.Map;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class BSTModeFinder {
    private static int maxCount = 0; // To track the maximum frequency of values
    private static int currentCount = 0; // To count occurrences of the current value
    private static Integer previousValue = null; // To keep track of the last visited node's value

    public static void main(String[] args) {
        // Create a sample binary search tree
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7); // Duplicate value for mode

        // Find the modes of the BST
        int[] modes = findMode(root);

        // Print the modes
        System.out.print("Modes of the BST: ");
        for (int mode : modes) {
            System.out.print(mode + " ");
        }
    }

    public static int[] findMode(TreeNode root) {
        // Use a HashMap to count frequencies
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        inOrderTraversal(root, frequencyMap);

        // Determine the maximum count
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
            }
        }

        // Collect modes
        return frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() == maxCount)
                .map(Map.Entry::getKey)
                .mapToInt(i -> i)
                .toArray();
    }

    private static void inOrderTraversal(TreeNode node, HashMap<Integer, Integer> frequencyMap) {
        if (node == null) {
            return;
        }
        // Traverse the left subtree
        inOrderTraversal(node.left, frequencyMap);

        // Process the current node
        frequencyMap.put(node.val, frequencyMap.getOrDefault(node.val, 0) + 1);

        // Traverse the right subtree
        inOrderTraversal(node.right, frequencyMap);
    }
}
