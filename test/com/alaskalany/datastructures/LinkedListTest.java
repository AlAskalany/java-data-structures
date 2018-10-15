package com.alaskalany.datastructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LinkedListTest {

    @Test
    void add() {
        LinkedList linkedList = new LinkedList();
        assertTrue(linkedList.add(99));
    }

    @Test
    void get() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(5);
        assertEquals(5, linkedList.get(0));
    }
}
