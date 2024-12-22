package Stacks;
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class MergeTwoSortedLists {
    static public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to simplify the merging process
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Iterate through both lists
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1; // Link to the smaller node
                list1 = list1.next;   // Move to the next node in list1
            } else {
                current.next = list2; // Link to the smaller node
                list2 = list2.next;   // Move to the next node in list2
            }
            current = current.next; // Move the current pointer forward
        }

        // If one of the lists is not exhausted, link the rest of it
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // Return the merged list, which starts from the next of dummy
        return dummy.next;
    }

    public static void main(String[] args) {
        // Example usage
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode mergedList =mergeTwoLists(list1, list2);
        // Print merged list
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}
