package com.alaskalany.datastructures;

/**
 * A {@link LinkedList} node that can store an {@link int} element and be linked to a next {@link Node} in a {@link LinkedList}
 */
public class Node {

    /**
     * Storage element of the {@link Node}
     */
    int elem;
    /**
     * Next {@link Node} in a {@link LinkedList}
     */
    Node next;

    /**
     * Create a Node that can store an {@link int} element and be linked to a next {@link Node} in a {@link LinkedList}
     *
     * @param i Element to be stored in the {@link Node}
     * @param n Next {@link Node} in a {@link LinkedList}
     */
    Node(int i, Node n) {
        elem = i;
        next = n;
    }
}
