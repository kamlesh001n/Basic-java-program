class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    // Method to detect loop in the linked list
    public boolean detectLoop() {
        Node slowPointer = head;
        Node fastPointer = head;

        while (slowPointer != null && fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if (slowPointer == fastPointer) {
                return true; // Loop detected
            }
        }
        return false; // No loop
    }

    // Method to insert a new node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        // Creating a loop for testing
        list.head.next.next.next.next.next = list.head.next;

        if (list.detectLoop()) {
            System.out.println("Loop detected.");
        } else {
            System.out.println("No Loop detected.");
        }
    }
}
