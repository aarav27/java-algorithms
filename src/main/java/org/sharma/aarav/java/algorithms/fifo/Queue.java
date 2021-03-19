package org.sharma.aarav.java.algorithms.fifo;

// 1. Implement a Queue (having enqueue, dequeue, peek and isEmpty functions).

/**
 * @author Aarav Sharma
 */
public class Queue<T> {

    public Node<T> first;
    public Node<T> last;

    public void enqueue(T item) {
        if(item == null) return;
        Node<T> node = new Node<T>(item);
        if(last != null && first == last) {
            first.next = node;
        } else if(first != last)  {
            last.next = node;
        }
        last = node;
        if(first == null) {
            first = last;
        }
    }

    public T dequeue() {
        if(first == null) return null;
        T item = first.data;
        first = first.next;
        if(last == null) {
            first = null;
        }
        return item;
    }

    public T peek() {
        if(first == null) return null;
        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }

}
