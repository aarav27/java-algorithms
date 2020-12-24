package org.sharma.aarav.java.algorithms.list;

public class CircularLinkedList<T> {

    //6. Implement an algorithm to find whether a linked list is a circular or has loop :: Given head node
    public boolean hasLoop(Node<T> head) {
        Node<T> slow = head;
        Node<T> fast = head;

        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)  {
                return true;
            }
        }
        return false;
    }

}
