package org.sharma.aarav.java.algrothims.list;

// 1. Junit to test to Append Node to Tail of LinkedList :: Given head node and data to append as input
// 2. Junit to test to Append Node to Tail of LinkedList :: Given head node and a node to append as input

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sharma.aarav.java.algorithms.list.LinkedList;

public class LinkedListTest {

    private LinkedList linkedList;

    private LinkedList.Node head;

    @Before
    public void setUp() throws Exception {
        linkedList = new LinkedList();
        head = new LinkedList.Node(1);
    }

    @Test
    public void appendOneDataInTailOfLinkedListTestGivenHeadNode() {
        linkedList.append(head,2);
        Assert.assertEquals(1, head.data);
        Assert.assertEquals(2, head.next.data);
        Assert.assertNull(head.next.next);
    }

    @Test
    public void appendTwoDataInTailOfLinkedListTestGivenHeadNode() {
        linkedList.append(head,2);
        linkedList.append(head,3);
        Assert.assertEquals(1, head.data);
        Assert.assertEquals(2, head.next.data);
        Assert.assertEquals(3, head.next.next.data);
        Assert.assertNull(head.next.next.next);
    }

    @Test
    public void appendThreeDataInTailOfLinkedListTestGivenHeadNode() {
        linkedList.append(head,2);
        linkedList.append(head,3);
        linkedList.append(head,4);
        Assert.assertEquals(1, head.data);
        Assert.assertEquals(2, head.next.data);
        Assert.assertEquals(3, head.next.next.data);
        Assert.assertEquals(4, head.next.next.next.data);
        Assert.assertNull(head.next.next.next.next);
    }

    @Test
    public void appendOneNodeInTailOfLinkedListTestGivenHeadNode() {
        LinkedList.Node node = new LinkedList.Node(11);
        linkedList.append(head, node);
        Assert.assertEquals(1, head.data);
        Assert.assertEquals(11, head.next.data);
        Assert.assertNull(head.next.next);
    }

    @Test
    public void appendTwoNodeInTailOfLinkedListTestGivenHeadNode() {
        LinkedList.Node node1 = new LinkedList.Node(11);
        LinkedList.Node node2 = new LinkedList.Node(21);
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        Assert.assertEquals(1, head.data);
        Assert.assertEquals(11, head.next.data);
        Assert.assertEquals(21, head.next.next.data);
        Assert.assertNull(head.next.next.next);
    }

    @Test
    public void appendThreeNodeInTailOfLinkedListTestGivenHeadNode() {
        LinkedList.Node node1 = new LinkedList.Node(11);
        LinkedList.Node node2 = new LinkedList.Node(21);
        LinkedList.Node node3 = new LinkedList.Node(31);
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        linkedList.append(head, node3);
        Assert.assertEquals(1, head.data);
        Assert.assertEquals(11, head.next.data);
        Assert.assertEquals(21, head.next.next.data);
        Assert.assertEquals(31, head.next.next.next.data);
        Assert.assertNull(head.next.next.next.next);
    }

}
