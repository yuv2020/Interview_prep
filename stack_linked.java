//Implement of stack using linked list

import java.util.Scanner;
import javax.security.sasl.Sasl;
import java.util.*;

class stack {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        } 
    }
    Node top = null;

        void push(Scanner sc){
            System.out.println("Enter data: ");
            int data = sc.nextInt();
            Node newNode = new Node(data);
            if(top == null){
                top = newNode;
            }
            else{
                newNode.next = top;
                top = newNode;
            }
        }

        void pop(){
            if(top == null){
                System.out.print("Stack is empty");
            }
            else{
                top = top.next;
            }
        }

        void display(){
            Node temp = top;
            while(temp != null){
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }
    }


public class stack_linked{
    public static void main(String[] args){
        int data;
        Scanner sc = new Scanner(System.in);
        stack s = new stack();
        int list;

        do { 
            System.out.println("Press 1 to push");
            System.out.println("Press 2 to pop");
            System.out.println("Press 3 to display");
            System.out.println("Enter your choice...");

            data = sc.nextInt();
            switch(data) {
                case 1:{
                    System.out.println("Enter data to push:");
                    s.push(sc);
                    break;
                }              
                
                case 2:{
                    s.pop();
                    break;
                }

                case 3:{
                    s.display();
                    break;
                }
                
                default:
                System.out.println("Invalid choice");
                break;

            }

            System.out.println("Enter 0 to go back to the main menu...");
            System.out.println("Enter any key to exit...");
            list=sc.nextInt();

        } 
        while (list == 0);
        System.out.println("Enter any key to exit...");

    } 
    
}
