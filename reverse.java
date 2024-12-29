//Reverse a linked list.

class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;
    public void add(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void reverse(){
        Node previous = null;
        Node current = head;
        Node next = nullA;

        while(current.next != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public void display(){
        Node current = head;
        while(current!= null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class reverse{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Original List: ");
        list.display();
        list.reverse();
        System.out.println("Reversed List: ");
        list.display();        
    }
}