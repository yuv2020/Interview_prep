// Find the middle element of a linked list.

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Method to add a new node at the end of the list
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Method to find the middle element
    public int findMiddle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // Move slow pointer by 1
            fast = fast.next.next;   // Move fast pointer by 2
        }

        return (slow != null) ? slow.data : -1; // Return the data of the middle node
    }

    // Method to convert the linked list to a string representation
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.data).append(" -> ");
            current = current.next;
        }
        sb.append("null");
        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        // Adding elements to the linked list
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        System.out.println("Original list: " + list.toString());

        // Finding the middle element
        System.out.println("The middle element is: " + list.findMiddle());
    }
}
