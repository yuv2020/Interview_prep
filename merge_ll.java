/*
Merge Two Sorted Linked Lists
You are given two sorted linked lists. You have to merge them to produce a combined sorted linked list. 
You need to return the head of the final linked list.
*/

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class merge_ll {
    public static void main(String[] args){
        Node h1 = new Node(1);
        h1.next = new Node(2);
        h1.next.next = new Node(3);

        Node h2 = new Node(2);
        h2.next = new Node(4);
        h2.next.next = new Node(5);

        Node mergehead = merger(h1, h2);
        System.out.print("After merge list: " + " ");
        printlist(mergehead);
    }
    public static Node merger(Node head1, Node head2){
        // Your code here
        if(head1 == null) return head2;
        if(head2 == null) return head1;
        
        Node dummy;

        if(head1.data <= head2.data){
            dummy = head1;
            head1 = head1.next;
        }
        else{
            dummy = head2;
            head2 = head2.next;
        }

        Node curr = dummy;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                curr.next =head1;
                head1 = head1.next;
            }

            else{
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }   

        if(head1 != null){
            curr.next = head1;
        }
        else{
            curr.next = head2;
        }

        return dummy;
    }
    
    public static void printlist(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + ' ');
            temp = temp.next;
        }
        System.out.println();
    }
}
