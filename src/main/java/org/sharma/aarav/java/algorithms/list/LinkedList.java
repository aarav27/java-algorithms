package org.sharma.aarav.java.algorithms.list;

public class LinkedList<T> {

    public static class Node<T> {
        public Node<T> next;
        public T data;

        public Node(T data) {
            this.data = data;
        }
    }

    // 1. Append Node to Tail :: Given head node and data to append as input
    public void append(Node head, T data) {
        Node end = new Node(data);
        Node current = head;
        while (current.next!=null) current = current.next;
        current.next = end;
    }

    //2. Append Node to Tail Given Head node and a node to append as input
    public void append(Node head, Node end) {
        Node current = head;
        while (current.next!=null) current = current.next;
        current.next = end;
    }

}
