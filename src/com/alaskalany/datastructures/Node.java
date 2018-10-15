package com.alaskalany.datastructures;

/**
 * A {@link LinkedList} node that can store an {@link int} element and be linked to a next {@link Node} in a {@link LinkedList}
 */
public class Node {

    /**
     * Storage element of the {@link Node}
     */
    private int value;
    /**
     * Next {@link Node} in a {@link LinkedList}
     */
    private Node next;

    /**
     * Create a Node that can store an {@link int} element and be linked to a next {@link Node} in a {@link LinkedList}
     *
     * @param i Element to be stored in the {@link Node}
     */
    Node(int i) {
        this(i, null);
    }

    /**
     * Create a Node that can store an {@link int} element and be linked to a next {@link Node} in a {@link LinkedList}
     *
     * @param i Element to be stored in the {@link Node}
     * @param n Next {@link Node} in a {@link LinkedList}
     */
    Node(int i, Node n) {
        value = i;
        next = n;
    }

    /**
     * Get value stored in the node
     *
     * @return {@link int} stored value
     */
    public int getValue() {
        return value;
    }

    /**
     * Set value in the node
     *
     * @param value {@link int} value to be stored in the node
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Get the next node
     *
     * @return {@link Node} next node
     */
    public Node getNext() {
        return next;
    }

    /**
     * Set next node
     *
     * @param next {@link Node} will be next node
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * Check if this {@link Node} has a next node
     *
     * @return true if has a next node
     */
    public boolean hasNext() {
        return next != null;
    }
}
