package org.sharma.aarav.java.algorithms.fifo;

// Queue Node

/**
 * @author Aarav Sharma
 */
public class Node<T> {

    public Node<T> next;
    public T data;

    public Node(T data) {
        this.data = data;
    }
}
