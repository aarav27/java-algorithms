package org.sharma.aarav.java.algorithms.list;

public class LinkedList<T> {

    public static class Node<T> {
        public Node<T> next;
        public T data;

        public Node(T data) {
            this.data = data;
        }
    }

    // 1. Append Node to Tail :: Given head node and data for append node as input
    public void append(Node head, int data) {
        Node end = new Node(data);
        Node current = head;
        while (current.next!=null) current = current.next;
        current.next = end;
    }

}
