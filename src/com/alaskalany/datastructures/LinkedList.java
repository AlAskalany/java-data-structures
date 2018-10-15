package com.alaskalany.datastructures;

/**
 * Linked list data structure that can contain linked storage {@link Node}s
 */
public class LinkedList {

    Node first;

    public LinkedList() {
        first = null;
    }

    void add(int i) {
        Node newNode = new Node(i, null);
        if (first == null) {
            first = newNode;
        } else {
            // 1. step find the last node
            Node currentNode = first;
            while (currentNode.next != null) {
                // Current node is not the last node
                currentNode = currentNode.next;
            }
            // current.next == null
            // That means current node is the last node in this LinkedList
            // 2. step insert new node
            // Add the new node as the last node
            currentNode.next = newNode;
        }
    }
}
