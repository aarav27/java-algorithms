package org.sharma.aarav.java.algorithms.filo;

// 1. Implement a Stack (having push, pop, peek and isEmpty functions).

public class Stack<T> {

    public Node<T> top;

    public void push(T item) {
        if(item == null) return;
        Node<T> node = new Node<T>(item);
        node.next = top;
        top = node;
    }

    public T pop() {
        if(top == null) return null;
        T item = top.data;
        top = top.next;
        return item;
    }

    public T peek() {
        if(top == null) return null;
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

}
