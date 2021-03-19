package org.sharma.aarav.java.algrothims.list;

// 8. Junit to test whether a linked list is a circular or has loop :: Given a linked list with loop or without loop.
// 9. Junit to test get node at the beginning of the loop of a circular linked list :: Given a linked list with loop or without loop.
// 10. Junit to test whether a linked list is a circular or has loop; and further remove the loop :: Given head node

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sharma.aarav.java.algorithms.list.CircularLinkedList;
import org.sharma.aarav.java.algorithms.list.LinkedList;
import org.sharma.aarav.java.algorithms.list.Node;

/**
 * @author Aarav Sharma
 */
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

    @Test
    public void findBeginningTestWithFiveNodesHavingLoop() {
        Node node1 = new Node(11);
        Node node2 = new Node(31);
        Node node3 = new Node(51);
        Node node4 = new Node(71);
        Node node5 = new Node(91);
        node5.next = head;
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        linkedList.append(head, node3);
        linkedList.append(head, node4);
        linkedList.append(head, node5);
        Node nodeAtBeginningOfLoop= circularLinkedList.getNodeAtLoopBeginning(head);
        Assert.assertEquals(1, nodeAtBeginningOfLoop.data);
    }

    @Test
    public void findBeginningTestWithSixNodesHavingLoop() {
        Node node1 = new Node(21);
        Node node2 = new Node(41);
        Node node3 = new Node(61);
        Node node4 = new Node(81);
        Node node5 = new Node(101);
        Node node6 = new Node(121);
        node6.next = node1;
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        linkedList.append(head, node3);
        linkedList.append(head, node4);
        linkedList.append(head, node5);
        linkedList.append(head, node6);
        Node nodeAtBeginningOfLoop= circularLinkedList.getNodeAtLoopBeginning(head);
        Assert.assertEquals(21, nodeAtBeginningOfLoop.data);
    }

    @Test
    public void findBeginningTestWithSevenNodesHavingLoop() {
        Node node1 = new Node(11);
        Node node2 = new Node(21);
        Node node3 = new Node(31);
        Node node4 = new Node(41);
        Node node5 = new Node(51);
        Node node6 = new Node(61);
        Node node7 = new Node(71);
        node7.next = node2;
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        linkedList.append(head, node3);
        linkedList.append(head, node4);
        linkedList.append(head, node5);
        linkedList.append(head, node6);
        linkedList.append(head, node7);
        Node nodeAtBeginningOfLoop= circularLinkedList.getNodeAtLoopBeginning(head);
        Assert.assertEquals(21, nodeAtBeginningOfLoop.data);
    }

    @Test
    public void findBeginningTestWithEightNodesHavingLoop() {
        Node node1 = new Node(11);
        Node node2 = new Node(21);
        Node node3 = new Node(31);
        Node node4 = new Node(41);
        Node node5 = new Node(51);
        Node node6 = new Node(61);
        Node node7 = new Node(71);
        Node node8 = new Node(81);
        node8.next = node7;
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        linkedList.append(head, node3);
        linkedList.append(head, node4);
        linkedList.append(head, node5);
        linkedList.append(head, node6);
        linkedList.append(head, node7);
        linkedList.append(head, node8);
        Node nodeAtBeginningOfLoop= circularLinkedList.getNodeAtLoopBeginning(head);
        Assert.assertEquals(71, nodeAtBeginningOfLoop.data);
    }

    @Test
    public void findBeginningTestWithNineNodesHavingLoop() {
        Node node1 = new Node(11);
        Node node2 = new Node(21);
        Node node3 = new Node(31);
        Node node4 = new Node(41);
        Node node5 = new Node(51);
        Node node6 = new Node(61);
        Node node7 = new Node(71);
        Node node8 = new Node(81);
        Node node9 = new Node(91);
        node9.next = node6;
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        linkedList.append(head, node3);
        linkedList.append(head, node4);
        linkedList.append(head, node5);
        linkedList.append(head, node6);
        linkedList.append(head, node7);
        linkedList.append(head, node8);
        linkedList.append(head, node9);
        Node nodeAtBeginningOfLoop= circularLinkedList.getNodeAtLoopBeginning(head);
        Assert.assertEquals(61, nodeAtBeginningOfLoop.data);
    }

    @Test
    public void findBeginningTestWithFiveNodesHavingNoLoop() {
        Node node1 = new Node(11);
        Node node2 = new Node(31);
        Node node3 = new Node(51);
        Node node4 = new Node(71);
        Node node5 = new Node(91);
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        linkedList.append(head, node3);
        linkedList.append(head, node4);
        linkedList.append(head, node5);
        Node nodeAtBeginningOfLoop= circularLinkedList.getNodeAtLoopBeginning(head);
        Assert.assertNull(nodeAtBeginningOfLoop);
    }

    @Test
    public void findBeginningTestWithSixNodesHavingNoLoop() {
        Node node1 = new Node(21);
        Node node2 = new Node(41);
        Node node3 = new Node(61);
        Node node4 = new Node(81);
        Node node5 = new Node(101);
        Node node6 = new Node(121);
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        linkedList.append(head, node3);
        linkedList.append(head, node4);
        linkedList.append(head, node5);
        linkedList.append(head, node6);
        Node nodeAtBeginningOfLoop= circularLinkedList.getNodeAtLoopBeginning(head);
        Assert.assertNull(nodeAtBeginningOfLoop);
    }

    @Test
    public void findBeginningTestWithSevenNodesHavingNoLoop() {
        Node node1 = new Node(11);
        Node node2 = new Node(21);
        Node node3 = new Node(31);
        Node node4 = new Node(41);
        Node node5 = new Node(51);
        Node node6 = new Node(61);
        Node node7 = new Node(71);
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        linkedList.append(head, node3);
        linkedList.append(head, node4);
        linkedList.append(head, node5);
        linkedList.append(head, node6);
        linkedList.append(head, node7);
        Node nodeAtBeginningOfLoop= circularLinkedList.getNodeAtLoopBeginning(head);
        Assert.assertNull(nodeAtBeginningOfLoop);
    }

    @Test
    public void findBeginningTestWithEightNodesHavingNoLoop() {
        Node node1 = new Node(11);
        Node node2 = new Node(21);
        Node node3 = new Node(31);
        Node node4 = new Node(41);
        Node node5 = new Node(51);
        Node node6 = new Node(61);
        Node node7 = new Node(71);
        Node node8 = new Node(81);
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        linkedList.append(head, node3);
        linkedList.append(head, node4);
        linkedList.append(head, node5);
        linkedList.append(head, node6);
        linkedList.append(head, node7);
        linkedList.append(head, node8);
        Node nodeAtBeginningOfLoop= circularLinkedList.getNodeAtLoopBeginning(head);
        Assert.assertNull(nodeAtBeginningOfLoop);
    }

    @Test
    public void findBeginningTestWithNineNodesHavingNoLoop() {
        Node node1 = new Node(11);
        Node node2 = new Node(21);
        Node node3 = new Node(31);
        Node node4 = new Node(41);
        Node node5 = new Node(51);
        Node node6 = new Node(61);
        Node node7 = new Node(71);
        Node node8 = new Node(81);
        Node node9 = new Node(91);
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        linkedList.append(head, node3);
        linkedList.append(head, node4);
        linkedList.append(head, node5);
        linkedList.append(head, node6);
        linkedList.append(head, node7);
        linkedList.append(head, node8);
        linkedList.append(head, node9);
        Node nodeAtBeginningOfLoop= circularLinkedList.getNodeAtLoopBeginning(head);
        Assert.assertNull(nodeAtBeginningOfLoop);
    }

    @Test
    public void detectAndRemoveTestWithFiveNodesHavingLoop() {
        Node node1 = new Node(11);
        Node node2 = new Node(31);
        Node node3 = new Node(51);
        Node node4 = new Node(71);
        Node node5 = new Node(91);
        node5.next = head;
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        linkedList.append(head, node3);
        linkedList.append(head, node4);
        linkedList.append(head, node5);
        Assert.assertEquals(Boolean.TRUE, circularLinkedList.detectAndRemoveLoop(head));
        Assert.assertEquals(1, head.data);
        Assert.assertEquals(11, head.next.data);
        Assert.assertEquals(31, head.next.next.data);
        Assert.assertEquals(51, head.next.next.next.data);
        Assert.assertEquals(71, head.next.next.next.next.data);
        Assert.assertEquals(91, head.next.next.next.next.next.data);
        Assert.assertNull(head.next.next.next.next.next.next);
    }

    @Test
    public void detectAndRemoveTestWithSixNodesHavingLoop() {
        Node node1 = new Node(21);
        Node node2 = new Node(41);
        Node node3 = new Node(61);
        Node node4 = new Node(81);
        Node node5 = new Node(101);
        Node node6 = new Node(121);
        node6.next = node1;
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        linkedList.append(head, node3);
        linkedList.append(head, node4);
        linkedList.append(head, node5);
        linkedList.append(head, node6);
        Assert.assertEquals(Boolean.TRUE, circularLinkedList.detectAndRemoveLoop(head));
        Assert.assertEquals(1, head.data);
        Assert.assertEquals(21, head.next.data);
        Assert.assertEquals(41, head.next.next.data);
        Assert.assertEquals(61, head.next.next.next.data);
        Assert.assertEquals(81, head.next.next.next.next.data);
        Assert.assertEquals(101, head.next.next.next.next.next.data);
        Assert.assertEquals(121, head.next.next.next.next.next.next.data);
        Assert.assertNull(head.next.next.next.next.next.next.next);
    }

    @Test
    public void detectAndRemoveTestWithSevenNodesHavingLoop() {
        Node node1 = new Node(11);
        Node node2 = new Node(21);
        Node node3 = new Node(31);
        Node node4 = new Node(41);
        Node node5 = new Node(51);
        Node node6 = new Node(61);
        Node node7 = new Node(71);
        node7.next = node2;
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        linkedList.append(head, node3);
        linkedList.append(head, node4);
        linkedList.append(head, node5);
        linkedList.append(head, node6);
        linkedList.append(head, node7);
        Assert.assertEquals(Boolean.TRUE, circularLinkedList.detectAndRemoveLoop(head));
        Assert.assertEquals(1, head.data);
        Assert.assertEquals(11, head.next.data);
        Assert.assertEquals(21, head.next.next.data);
        Assert.assertEquals(31, head.next.next.next.data);
        Assert.assertEquals(41, head.next.next.next.next.data);
        Assert.assertEquals(51, head.next.next.next.next.next.data);
        Assert.assertEquals(61, head.next.next.next.next.next.next.data);
        Assert.assertEquals(71, head.next.next.next.next.next.next.next.data);
        Assert.assertNull(head.next.next.next.next.next.next.next.next);
    }

    @Test
    public void detectAndRemoveTestWithEightNodesHavingLoop() {
        Node node1 = new Node(11);
        Node node2 = new Node(21);
        Node node3 = new Node(31);
        Node node4 = new Node(41);
        Node node5 = new Node(51);
        Node node6 = new Node(61);
        Node node7 = new Node(71);
        Node node8 = new Node(81);
        node8.next = node7;
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        linkedList.append(head, node3);
        linkedList.append(head, node4);
        linkedList.append(head, node5);
        linkedList.append(head, node6);
        linkedList.append(head, node7);
        linkedList.append(head, node8);
        Assert.assertEquals(Boolean.TRUE, circularLinkedList.detectAndRemoveLoop(head));
        Assert.assertEquals(1, head.data);
        Assert.assertEquals(11, head.next.data);
        Assert.assertEquals(21, head.next.next.data);
        Assert.assertEquals(31, head.next.next.next.data);
        Assert.assertEquals(41, head.next.next.next.next.data);
        Assert.assertEquals(51, head.next.next.next.next.next.data);
        Assert.assertEquals(61, head.next.next.next.next.next.next.data);
        Assert.assertEquals(71, head.next.next.next.next.next.next.next.data);
        Assert.assertEquals(81, head.next.next.next.next.next.next.next.next.data);
        Assert.assertNull(head.next.next.next.next.next.next.next.next.next);
    }

    @Test
    public void detectAndRemoveTestWithNineNodesHavingLoop() {
        Node node1 = new Node(11);
        Node node2 = new Node(21);
        Node node3 = new Node(31);
        Node node4 = new Node(41);
        Node node5 = new Node(51);
        Node node6 = new Node(61);
        Node node7 = new Node(71);
        Node node8 = new Node(81);
        Node node9 = new Node(91);
        node9.next = node6;
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        linkedList.append(head, node3);
        linkedList.append(head, node4);
        linkedList.append(head, node5);
        linkedList.append(head, node6);
        linkedList.append(head, node7);
        linkedList.append(head, node8);
        linkedList.append(head, node9);
        Assert.assertEquals(Boolean.TRUE, circularLinkedList.detectAndRemoveLoop(head));
        Assert.assertEquals(1, head.data);
        Assert.assertEquals(11, head.next.data);
        Assert.assertEquals(21, head.next.next.data);
        Assert.assertEquals(31, head.next.next.next.data);
        Assert.assertEquals(41, head.next.next.next.next.data);
        Assert.assertEquals(51, head.next.next.next.next.next.data);
        Assert.assertEquals(61, head.next.next.next.next.next.next.data);
        Assert.assertEquals(71, head.next.next.next.next.next.next.next.data);
        Assert.assertEquals(81, head.next.next.next.next.next.next.next.next.data);
        Assert.assertEquals(91, head.next.next.next.next.next.next.next.next.next.data);
        Assert.assertNull(head.next.next.next.next.next.next.next.next.next.next);
    }

}
