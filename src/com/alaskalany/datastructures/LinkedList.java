package com.alaskalany.datastructures;

/**
 * Linked list data structure that can contain linked storage {@link Node}s
 */
public class LinkedList {

    /**
     * First {@link Node} in this {@link LinkedList}
     */
    Node first;

    /**
     * Create a LinkedList
     */
    public LinkedList() {
        first = null;
    }

    /**
     * Add a new {@link Node} to this {@link LinkedList}
     *
     * @param i {@link int} value to store in the new {@link Node}
     */
    boolean add(int i) {
        // Create a new node and store the value in it
        Node newNode = new Node(i, null);
        // If the LinkedList is empty
        if (first == null) {
            // Add the new node as the first node in this LinkedList
            first = newNode;
            // If new node is added as the first node return true, otherwise return false
            return first.elem == i && first.next == null;
        }
        // If the LinkedList is not empty
        else {
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
            // If new node is added as the last node return true, otherwise return false
            return currentNode.next.elem == i && currentNode.next.next == null;
        }
    }

    /**
     * Get the value stored in the node of an index
     *
     * @param index Index of the {@link Node}
     * @return {@link int} value stored in the {@link Node}
     */
    int get(int index) {
        int i = 0;
        Node currentNode = first;
        // As long as there are nodes and index is not reached yet
        while (index != i && currentNode.next != null) {
            i++;
            // Check the next node
            currentNode = currentNode.next;
        }
        if (index <= i) {
            // Here we should be at the right place
            // Return the value stored
            return currentNode.elem;
        }
        // If required index exceeds the index of the last Node
        else {
            throw new IndexOutOfBoundsException();
        }
    }
}
