package org.sharma.aarav.java.algrothims.list;

// 1. Junit to test to Append Node to Tail of LinkedList :: Given head node and data for append node as input

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

}
