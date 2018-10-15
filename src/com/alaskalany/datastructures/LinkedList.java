package com.alaskalany.datastructures;

/**
 * Linked list data structure that can contain linked storage {@link Node}s
 */
public class LinkedList {

    /**
     * First {@link Node} in this {@link LinkedList}
     */
    private Node first;

    /**
     * Create a LinkedList
     */
    public LinkedList() {
        init();
    }

    private void init() {
        first = null;
    }

    /**
     * Add a new {@link Node} to this {@link LinkedList}
     *
     * @param i {@link int} value to store in the new {@link Node}
     */
    boolean addValue(int i) {
        // Create a new node and store the value in it
        Node newNode = new Node(i, null);
        // If the LinkedList is empty
        if (isEmpty()) {
            // Add the new node as the first node in this LinkedList
            setFirst(newNode);
            // If new node is added as the first node return true, otherwise return false
            return getFirst().getValue() == i && !getFirst().hasNext();
        }
        // If the LinkedList is not empty
        else {
            // 1. step find the last node
            Node lastNode = getLast();
            // current.next == null
            // That means current node is the last node in this LinkedList
            // 2. step insert new node
            // Add the new node as the last node
            lastNode.setNext(newNode);
            // If new node is added as the last node return true, otherwise return false
            return getLast().getValue() == i && !getLast().hasNext();
        }
    }

    /**
     * Add a {@link Node} to this LinkedList
     *
     * @param node {@link Node} to be added
     * @return {@link boolean} true if the node was added, false otherwise
     */
    public boolean add(Node node) {
        // Create a new node and store the value in it
        Node newNode = node;
        // If the LinkedList is empty
        if (isEmpty()) {
            // Add the new node as the first node in this LinkedList
            setFirst(newNode);
            // If new node is added as the first node return true, otherwise return false
            return getFirst() == newNode && !getFirst().hasNext();
        }
        // If the LinkedList is not empty
        else {
            // 1. step find the last node
            Node lastNode = getLast();
            // current.next == null
            // That means current node is the last node in this LinkedList
            // 2. step insert new node
            // Add the new node as the last node
            lastNode.setNext(newNode);
            // If new node is added as the last node return true, otherwise return false
            return getLast() == newNode && !getLast().hasNext();
        }
    }

    /**
     * Set the first {@link Node} in the LinkedList
     *
     * @param newNode {@link Node} to be add as the first node in the LinkedList
     */
    private void setFirst(Node newNode) {
        first = newNode;
    }

    /**
     * Get the first node in this LinkedList
     *
     * @return First {@link Node} in the linked list
     */
    private Node getFirst() {
        return first;
    }

    private Node getLast() {
        Node currentNode = getFirst();
        while (currentNode.hasNext()) {
            // Current node is not the last node
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    /**
     * Check if the LinkedList is empty
     *
     * @return true if the LinkedList has no nodes
     */
    private boolean isEmpty() {
        return first == null;
    }

    /**
     * Get the value stored in the node of an index
     *
     * @param index Index of the {@link Node}
     * @return {@link int} value stored in the {@link Node}
     */
    int getValueAt(int index) {
        return get(index).getValue();
    }

    /**
     * Get the {@link Node} at given index
     *
     * @param index Index of the {@link Node}
     * @return {@link Node} at this index
     */
    public Node get(int index) {
        int i = 0;
        Node currentNode = getFirst();
        // As long as there are nodes and index is not reached yet
        while (index != i && currentNode.hasNext()) {
            i++;
            // Check the next node
            currentNode = currentNode.getNext();
        }
        if (index <= i) {
            // Here we should be at the right place
            // Return the value stored
            return currentNode;
        }
        // If required index exceeds the index of the last Node
        else {
            throw new IndexOutOfBoundsException();
        }
    }
}
