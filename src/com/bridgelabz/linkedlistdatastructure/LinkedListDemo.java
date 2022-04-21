package com.bridgelabz.linkedlistdatastructure;

import java.util.Scanner;

/*
 * @author : Ashwini  
 * Ability to search LinkedList to find Node with value 30
 * - Write Junit Test Case as demonstrated in class 
 * - Loop through LinkedList to find node with key 30
 */
class Node {
    public int data;
    public Node next;

    //Node Constructor for Creating New Node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    int location = 0;

    Node head;
    Node tail;
    //Insert Data in New Node
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        //Adding Data in Node
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        location++;
        System.out.println("Location:"+location);
    }

    //Insert Data from Last
    public void insertLast(int data) {
        Node newNode = new Node(data);
        if(tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        location++;
        System.out.println("Location:"+location);
    }

    //Insert New Node after Given Node
    public void insertNthPosition(int data,int nthdata) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            Node nextNode;
            while (temp != null) {
                nextNode = temp.next;
                if(temp.data == nthdata) {
                    temp.next = newNode;
                    newNode.next = nextNode;
                }
//                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
        }
    }

    //Method to Delete First Node from Linked List
    public void pop() {
        if(head == null) {
            System.out.println("Linked List is Empty.");
        } else {
            head = head.next;
        }
    }

    //Method to Delete Last Node from Linked List
    public void popLast() {
        if(head == null) {
            System.out.println("Linked List is Empty.");
        } else {
            Node second_Last = head;
            while(second_Last.next.next != null)
                second_Last = second_Last.next;
                second_Last.next = null;
        }
    }

    //Method to Search given Node in Linked List
    public void searchNode(int data) {
        if(head == null) {
            System.out.println("Linked List is Empty.");
        } else {
            int foundLocation = 1;
            Node temp = head;
            while(temp != null) {
                if(temp.data == data) {
                    System.out.println("Node found at Location : "+foundLocation);
                }
                foundLocation++;
                temp = temp.next;
            }
        }
    }

    //Display Node in Linked List
    public void showLinkedList() {
        if(head == null) {
            System.out.println("Linked List is Empty.");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
        }
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        //Welcome Message
        System.out.println("Welcome to LinkedList Data Structures Problems.");

        Scanner sc = new Scanner(System.in);

        LinkedList linkedList = new LinkedList();

        int choice;
        do {
            System.out.println("SIMPLE LINKED LIST OPERATIONS");
            System.out.println("1. INSERT FIRST \n2. INSERT LAST \n3. DISPLAY LIST \n4. INSERT AT Nth POSITION \n5. POP \n6. POP LAST \n7. SEARCH NODE \n8. EXIT \nEnter the Choice for Operation : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the Data to Insert at First : ");
                    int dataFirst = sc.nextInt();
                    linkedList.insertFirst(dataFirst);
                    break;
                case 2:
                    System.out.println("Enter the Data to Insert at Last : ");
                    int dataLast = sc.nextInt();
                    linkedList.insertLast(dataLast);
                    break;
                case 3:
                    linkedList.showLinkedList();
                    break;
                case 4:
                    System.out.println("Enter the Data After which to Insert New Data : ");
                    int nthData = sc.nextInt();
                    System.out.println("Enter the Data : ");
                    linkedList.insertNthPosition(sc.nextInt(),nthData);
                    break;
                case 5:
                    linkedList.pop();
                    break;
                case 6:
                    linkedList.popLast();
                    break;
                case 7:
                    System.out.println("Enter the Data to Search within Linked List : ");
                    linkedList.searchNode(sc.nextInt());
                    break;
            }
        }while(choice != 8);
    }
}
