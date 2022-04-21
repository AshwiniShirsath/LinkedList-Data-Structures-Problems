package com.bridgelabz.linkedlistdatastructure;
/*
 * @author : Ashwini
 * Lets create a simple Linked List of 56, 30 and 70
 */
class Node {
    private int data;
    private Node next;

    //Node Constructor for Creating New Node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    Node tail;
    //Insert Data in New Node
    public void insertFirst(int data) {
        Node newNode = new Node(data);
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        //Welcome Message
        System.out.println("Welcome to LinkedList Data Structures Problems.");

        LinkedList linkedList = new LinkedList();
        //Insert 70, 50, 36 in Linked List Nodes
        linkedList.insertFirst(70);
        linkedList.insertFirst(30);
        linkedList.insertFirst(56);
    }
}


