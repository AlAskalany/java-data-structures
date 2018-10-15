package com.alaskalany.datastructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LinkedListTest {

    @Test
    void add() {
        LinkedList linkedList = new LinkedList();
        assertTrue(linkedList.addValue(99));
    }

    @Test
    void getValueAt() {
        LinkedList linkedList = new LinkedList();
        linkedList.addValue(5);
        assertEquals(5, linkedList.getValueAt(0));
    }

    @Test
    void get() {
        Node testNode = new Node(3);
        LinkedList linkedList = new LinkedList();
        linkedList.add(testNode);
        assertEquals(3, linkedList.get(0).getValue());
    }
}
