package org.sharma.aarav.java.algrothims.list;

// 6. Junit to test whether a linked list is a circular or has loop :: Given a linked list with loop or without loop.

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sharma.aarav.java.algorithms.list.CircularLinkedList;
import org.sharma.aarav.java.algorithms.list.LinkedList;
import org.sharma.aarav.java.algorithms.list.Node;

public class CircularLinkedListTest {

    private CircularLinkedList circularLinkedList;

    private LinkedList linkedList;

    private Node head;

    @Before
    public void setUp() throws Exception {
        circularLinkedList = new CircularLinkedList();
        linkedList = new LinkedList();
        head = new Node(1);
    }

    @Test
    public void hasLoopTestWithOneNodeHavingLoop() {
        Node node1 = new Node(11);
        node1.next = head;
        linkedList.append(head, node1);
        Assert.assertEquals(Boolean.TRUE, circularLinkedList.hasLoop(head));
    }

    @Test
    public void hasLoopTestWithTwoNodeHavingLoop() {
        Node node1 = new Node(21);
        Node node2 = new Node(41);
        node2.next = node1;
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        Assert.assertEquals(Boolean.TRUE, circularLinkedList.hasLoop(head));
    }

    @Test
    public void hasLoopTestWithThreeNodeHavingLoop() {
        Node node1 = new Node(11);
        Node node2 = new Node(21);
        Node node3 = new Node(31);
        node3.next = node2;
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        linkedList.append(head, node3);
        Assert.assertEquals(Boolean.TRUE, circularLinkedList.hasLoop(head));
    }

    @Test
    public void hasLoopTestWithFourNodeHavingLoop() {
        Node node1 = new Node(11);
        Node node2 = new Node(21);
        Node node3 = new Node(31);
        Node node4 = new Node(41);
        node4.next = node1;
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        linkedList.append(head, node3);
        linkedList.append(head, node4);
        Assert.assertEquals(Boolean.TRUE, circularLinkedList.hasLoop(head));
    }

    @Test
    public void hasLoopTestWithOneNodeHavingNoLoop() {
        Node node1 = new Node(11);
        linkedList.append(head, node1);
        Assert.assertEquals(Boolean.FALSE, circularLinkedList.hasLoop(head));
    }

    @Test
    public void hasLoopTestWithTwoNodeHavingNoLoop() {
        Node node1 = new Node(21);
        Node node2 = new Node(41);
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        Assert.assertEquals(Boolean.FALSE, circularLinkedList.hasLoop(head));
    }

    @Test
    public void hasLoopTestWithThreeNodeHavingNoLoop() {
        Node node1 = new Node(11);
        Node node2 = new Node(21);
        Node node3 = new Node(31);
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        linkedList.append(head, node3);
        Assert.assertEquals(Boolean.FALSE, circularLinkedList.hasLoop(head));
    }

    @Test
    public void hasLoopTestWithFourNodeHavingNoLoop() {
        Node node1 = new Node(11);
        Node node2 = new Node(21);
        Node node3 = new Node(31);
        Node node4 = new Node(41);
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        linkedList.append(head, node3);
        linkedList.append(head, node4);
        Assert.assertEquals(Boolean.FALSE, circularLinkedList.hasLoop(head));
    }

}
