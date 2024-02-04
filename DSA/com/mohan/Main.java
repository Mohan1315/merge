package com.mohan;
public class Main {
    public static void main(String[] args) {
        // Create three ListNode objects with integer data values 1, 2, and 3
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        // Link the nodes together in a LinkedList
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);


        // Print the data values of the nodes in the LinkedList
        ListNode currentNode = node1;
        while (currentNode != null) {
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
        }
    }
}