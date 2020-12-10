package org.sharma.aarav.java.algorithms.list;

import java.util.HashMap;
import java.util.Map;

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

    //3. Delete first node with matching value and return the list(head node)
    // Given head of the list and value to be deleted are given.
    public Node delete(Node head, T value) {

        if(head==null) return null;
        if(head.data == value) return head.next;

        Node current = head;
        while(current.next!=null) {
            if(current.next.data == value) {
                current.next = current.next.next;
                return head;
            }
            current = current.next;
        }
        return head;
    }

    //4. Delete a node in the middle of a single linked list, given only access to that node.
    public boolean delete(Node node) {
        if(node==null && node.next==null) return false;
        node.data = node.next.data;
        node.next = node.next.next;
        return true;
    }

    //5. Remove duplicates from an unsorted linked list, given head of the list.
    public void removeDuplicates(Node head) {
        Map<T, Boolean> map = new HashMap<T, Boolean>();
        Node previous = null;
        Node current = head;
        while(current != null) {
            if(!map.containsKey(current.data)) {
                map.put((T) current.data, true);
                previous = current;
            } else {
                previous.next = current.next;
            }
            current = current.next;
        }
    }

}
