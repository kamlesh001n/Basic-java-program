// Merge to Sorted Linkedlist 1. input- Linkedlist 1 100, 300, 500, 700
// 2. Second linkedlist  101, 301, 501, 701

class ListNode {
    int value;
    ListNode next;
    
    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

public class MergeLInkedList {
    
    public static ListNode mergeTwoSortedLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // Dummy node to simplify edge cases
        ListNode current = dummy;
        
        while (l1 != null && l2 != null) {
            if (l1.value < l2.value) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        
        // Attach the remaining nodes, if any
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }
        
        return dummy.next;
    }
    
    // Helper function to create a linked list from an array
    public static ListNode createLinkedList(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        
        return head;
    }
    
    // Helper function to print a linked list
    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.value + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        // Input linked lists
        int[] arr1 = {100, 300, 500, 700};
        int[] arr2 = {101, 301, 501, 701};
        
        ListNode list1 = createLinkedList(arr1);
        ListNode list2 = createLinkedList(arr2);
        
        // Merge linked lists
        ListNode mergedList = mergeTwoSortedLists(list1, list2);
        
        // Print the merged linked list
        printLinkedList(mergedList);
    }
}