package org.sharma.aarav.java.algrothims.list;

// 1. Junit to test to Append Node to Tail of LinkedList :: Given head node and data to append as input
// 2. Junit to test to Append Node to Tail of LinkedList :: Given head node and a node to append as input
// 3. Junit to test to Delete first node with matching value and return the list(head node) :: Given head of the list and value to be deleted as input
// 4. Junit to test to Delete a node in the middle of a single linked list :: Given only access to that node as input
// 5. Junit to test to remove duplicates from an unsorted linked list :: Given head of the list.

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

    @Test
    public void deleteFirstNodeWithMatchingValueFromLinkedListTestHavingFourNodes() {
        LinkedList.Node node1 = new LinkedList.Node(11);
        LinkedList.Node node2 = new LinkedList.Node(21);
        LinkedList.Node node3 = new LinkedList.Node(31);
        LinkedList.Node node4 = new LinkedList.Node(41);
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        linkedList.append(head, node3);
        linkedList.append(head, node4);
        linkedList.delete(head, 31);
        Assert.assertEquals(1, head.data);
        Assert.assertEquals(11, head.next.data);
        Assert.assertEquals(21, head.next.next.data);
        Assert.assertEquals(41, head.next.next.next.data);
        Assert.assertNull(head.next.next.next.next);
    }

    @Test
    public void deleteFirstNodeWithMatchingValueFromLinkedListTestHavingFiveNodes() {
        LinkedList.Node node1 = new LinkedList.Node(11);
        LinkedList.Node node2 = new LinkedList.Node(21);
        LinkedList.Node node3 = new LinkedList.Node(31);
        LinkedList.Node node4 = new LinkedList.Node(41);
        LinkedList.Node node5 = new LinkedList.Node(51);
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        linkedList.append(head, node3);
        linkedList.append(head, node4);
        linkedList.append(head, node5);
        linkedList.delete(head, 31);
        Assert.assertEquals(1, head.data);
        Assert.assertEquals(11, head.next.data);
        Assert.assertEquals(21, head.next.next.data);
        Assert.assertEquals(41, head.next.next.next.data);
        Assert.assertEquals(51, head.next.next.next.next.data);
        Assert.assertNull(head.next.next.next.next.next);
    }

    @Test
    public void deleteFirstNodeWithMatchingValueFromLinkedListTestHavingSixNodes() {
        LinkedList.Node node1 = new LinkedList.Node(11);
        LinkedList.Node node2 = new LinkedList.Node(21);
        LinkedList.Node node3 = new LinkedList.Node(31);
        LinkedList.Node node4 = new LinkedList.Node(41);
        LinkedList.Node node5 = new LinkedList.Node(51);
        LinkedList.Node node6 = new LinkedList.Node(61);
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        linkedList.append(head, node3);
        linkedList.append(head, node4);
        linkedList.append(head, node5);
        linkedList.append(head, node6);
        linkedList.delete(head, 31);
        Assert.assertEquals(1, head.data);
        Assert.assertEquals(11, head.next.data);
        Assert.assertEquals(21, head.next.next.data);
        Assert.assertEquals(41, head.next.next.next.data);
        Assert.assertEquals(51, head.next.next.next.next.data);
        Assert.assertEquals(61, head.next.next.next.next.next.data);
        Assert.assertNull(head.next.next.next.next.next.next);
    }

    @Test
    public void deleteNodeFromMiddleFromLinkedListTestHavingSevenNodes() {
        LinkedList.Node node1 = new LinkedList.Node(11);
        LinkedList.Node node2 = new LinkedList.Node(21);
        LinkedList.Node node3 = new LinkedList.Node(31);
        LinkedList.Node node4 = new LinkedList.Node(41);
        LinkedList.Node node5 = new LinkedList.Node(51);
        LinkedList.Node node6 = new LinkedList.Node(61);
        LinkedList.Node node7 = new LinkedList.Node(71);
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        linkedList.append(head, node3);
        linkedList.append(head, node4);
        linkedList.append(head, node5);
        linkedList.append(head, node6);
        linkedList.append(head, node7);
        linkedList.delete(node4);
        Assert.assertEquals(1, head.data);
        Assert.assertEquals(11, head.next.data);
        Assert.assertEquals(21, head.next.next.data);
        Assert.assertEquals(31, head.next.next.next.data);
        Assert.assertEquals(51, head.next.next.next.next.data);
        Assert.assertEquals(61, head.next.next.next.next.next.data);
        Assert.assertEquals(71, head.next.next.next.next.next.next.data);
        Assert.assertNull(head.next.next.next.next.next.next.next);
    }

    @Test
    public void deleteNodeFromMiddleFromLinkedListTestHavingEightNodes() {
        LinkedList.Node node1 = new LinkedList.Node(11);
        LinkedList.Node node2 = new LinkedList.Node(21);
        LinkedList.Node node3 = new LinkedList.Node(31);
        LinkedList.Node node4 = new LinkedList.Node(41);
        LinkedList.Node node5 = new LinkedList.Node(51);
        LinkedList.Node node6 = new LinkedList.Node(61);
        LinkedList.Node node7 = new LinkedList.Node(71);
        LinkedList.Node node8 = new LinkedList.Node(81);
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        linkedList.append(head, node3);
        linkedList.append(head, node4);
        linkedList.append(head, node5);
        linkedList.append(head, node6);
        linkedList.append(head, node7);
        linkedList.append(head, node8);
        linkedList.delete(node4);
        Assert.assertEquals(1, head.data);
        Assert.assertEquals(11, head.next.data);
        Assert.assertEquals(21, head.next.next.data);
        Assert.assertEquals(31, head.next.next.next.data);
        Assert.assertEquals(51, head.next.next.next.next.data);
        Assert.assertEquals(61, head.next.next.next.next.next.data);
        Assert.assertEquals(71, head.next.next.next.next.next.next.data);
        Assert.assertEquals(81, head.next.next.next.next.next.next.next.data);
        Assert.assertNull(head.next.next.next.next.next.next.next.next);
    }

    @Test
    public void deleteNodeFromMiddleFromLinkedListTestHavingNineNodes() {
        LinkedList.Node node1 = new LinkedList.Node(11);
        LinkedList.Node node2 = new LinkedList.Node(21);
        LinkedList.Node node3 = new LinkedList.Node(31);
        LinkedList.Node node4 = new LinkedList.Node(41);
        LinkedList.Node node5 = new LinkedList.Node(51);
        LinkedList.Node node6 = new LinkedList.Node(61);
        LinkedList.Node node7 = new LinkedList.Node(71);
        LinkedList.Node node8 = new LinkedList.Node(81);
        LinkedList.Node node9 = new LinkedList.Node(91);
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        linkedList.append(head, node3);
        linkedList.append(head, node4);
        linkedList.append(head, node5);
        linkedList.append(head, node6);
        linkedList.append(head, node7);
        linkedList.append(head, node8);
        linkedList.append(head, node9);
        linkedList.delete(node4);
        Assert.assertEquals(1, head.data);
        Assert.assertEquals(11, head.next.data);
        Assert.assertEquals(21, head.next.next.data);
        Assert.assertEquals(31, head.next.next.next.data);
        Assert.assertEquals(51, head.next.next.next.next.data);
        Assert.assertEquals(61, head.next.next.next.next.next.data);
        Assert.assertEquals(71, head.next.next.next.next.next.next.data);
        Assert.assertEquals(81, head.next.next.next.next.next.next.next.data);
        Assert.assertEquals(91, head.next.next.next.next.next.next.next.next.data);
        Assert.assertNull(head.next.next.next.next.next.next.next.next.next);
    }

    @Test
    public void removeDuplicatesFromLinkedListTestHavingTenNodes() {
        LinkedList.Node node1 = new LinkedList.Node(11);
        LinkedList.Node node2 = new LinkedList.Node(21);
        LinkedList.Node node3 = new LinkedList.Node(11);
        LinkedList.Node node4 = new LinkedList.Node(31);
        LinkedList.Node node5 = new LinkedList.Node(41);
        LinkedList.Node node6 = new LinkedList.Node(31);
        LinkedList.Node node7 = new LinkedList.Node(51);
        LinkedList.Node node8 = new LinkedList.Node(61);
        LinkedList.Node node9 = new LinkedList.Node(71);
        LinkedList.Node node10 = new LinkedList.Node(71);
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        linkedList.append(head, node3);
        linkedList.append(head, node4);
        linkedList.append(head, node5);
        linkedList.append(head, node6);
        linkedList.append(head, node7);
        linkedList.append(head, node8);
        linkedList.append(head, node9);
        linkedList.append(head, node10);
        linkedList.removeDuplicates(head);
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
    public void removeDuplicatesFromLinkedListTestHavingElevenNodes() {
        LinkedList.Node node1 = new LinkedList.Node(11);
        LinkedList.Node node2 = new LinkedList.Node(21);
        LinkedList.Node node3 = new LinkedList.Node(31);
        LinkedList.Node node4 = new LinkedList.Node(41);
        LinkedList.Node node5 = new LinkedList.Node(51);
        LinkedList.Node node6 = new LinkedList.Node(61);
        LinkedList.Node node7 = new LinkedList.Node(41);
        LinkedList.Node node8 = new LinkedList.Node(61);
        LinkedList.Node node9 = new LinkedList.Node(71);
        LinkedList.Node node10 = new LinkedList.Node(81);
        LinkedList.Node node11 = new LinkedList.Node(71);
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        linkedList.append(head, node3);
        linkedList.append(head, node4);
        linkedList.append(head, node5);
        linkedList.append(head, node6);
        linkedList.append(head, node7);
        linkedList.append(head, node8);
        linkedList.append(head, node9);
        linkedList.append(head, node10);
        linkedList.append(head, node11);
        linkedList.removeDuplicates(head);
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
    public void removeDuplicatesFromLinkedListTestHavingTwelveNodes() {
        LinkedList.Node node1 = new LinkedList.Node(11);
        LinkedList.Node node2 = new LinkedList.Node(21);
        LinkedList.Node node3 = new LinkedList.Node(31);
        LinkedList.Node node4 = new LinkedList.Node(41);
        LinkedList.Node node5 = new LinkedList.Node(51);
        LinkedList.Node node6 = new LinkedList.Node(61);
        LinkedList.Node node7 = new LinkedList.Node(1);
        LinkedList.Node node8 = new LinkedList.Node(11);
        LinkedList.Node node9 = new LinkedList.Node(21);
        LinkedList.Node node10 = new LinkedList.Node(31);
        LinkedList.Node node11 = new LinkedList.Node(41);
        LinkedList.Node node12 = new LinkedList.Node(51);
        linkedList.append(head, node1);
        linkedList.append(head, node2);
        linkedList.append(head, node3);
        linkedList.append(head, node4);
        linkedList.append(head, node5);
        linkedList.append(head, node6);
        linkedList.append(head, node7);
        linkedList.append(head, node8);
        linkedList.append(head, node9);
        linkedList.append(head, node10);
        linkedList.append(head, node11);
        linkedList.append(head, node12);
        linkedList.removeDuplicates(head);
        Assert.assertEquals(1, head.data);
        Assert.assertEquals(11, head.next.data);
        Assert.assertEquals(21, head.next.next.data);
        Assert.assertEquals(31, head.next.next.next.data);
        Assert.assertEquals(41, head.next.next.next.next.data);
        Assert.assertEquals(51, head.next.next.next.next.next.data);
        Assert.assertEquals(61, head.next.next.next.next.next.next.data);
        Assert.assertNull(head.next.next.next.next.next.next.next);
    }

}
