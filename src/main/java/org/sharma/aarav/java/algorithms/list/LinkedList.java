package org.sharma.aarav.java.algorithms.list;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aarav Sharma
 */
public class LinkedList<T> {

    // 1. Append Node to Tail :: Given head node and data to append as input
    public void append(Node<T> head, T data) {
        Node<T> end = new Node<T>(data);
        Node<T> current = head;
        while (current.next != null) current = current.next;
        current.next = end;
    }

    //2. Append Node to Tail Given Head node and a node to append as input
    public void append(Node<T> head, Node<T> end) {
        Node<T> current = head;
        while (current.next != null) current = current.next;
        current.next = end;
    }

    //3. Delete first node with matching value and return the list(head node)
    // Given head of the list and value to be deleted are given.
    public Node<T> delete(Node<T> head, T value) {

        if (head == null) return null;
        if (head.data == value) return head.next;

        Node<T> current = head;
        while (current.next != null) {
            if (current.next.data == value) {
                current.next = current.next.next;
                return head;
            }
            current = current.next;
        }
        return head;
    }

    //4. Delete a node in the middle of a single linked list, given only access to that node.
    public boolean delete(Node<T> node) {
        if (node == null && node.next == null) return false;
        node.data = node.next.data;
        node.next = node.next.next;
        return true;
    }

    //5. Remove duplicates from an unsorted linked list, given head of the list.
    public void removeDuplicates(Node<T> head) {
        Map<T, Boolean> map = new HashMap<T, Boolean>();
        Node<T> previous = null;
        Node<T> current = head;
        while (current != null) {
            if (!map.containsKey(current.data)) {
                map.put((T) current.data, true);
                previous = current;
            } else {
                previous.next = current.next;
            }
            current = current.next;
        }
    }

    // 6. Write an algorithm to find the node at which the intersection of two singly linked lists begins.
    // For example, the following two linked lists:
    // A:           a1 ? a2
    //                     ?
    //                       c1 ? c2 ? c3
    //                     ?
    // B:     b1 ? b2 ? b3
    public Node<T> getIntersectionNode(Node<T> headA, Node<T> headB) {
        //boundary check
        if (headA == null || headB == null) return null;

        int lenA = length(headA), lenB = length(headB);

        // move headA and headB to the same start point
        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }
        while (lenA < lenB) {
            headB = headB.next;
            lenB--;
        }

        // find the intersection until end
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

    private int length(Node<T> node) {
        int length = 0;
        while (node != null) {
            node = node.next;
            length++;
        }
        return length;
    }

    // 7. Write an algorithm to find the node at which the intersection of two singly linked lists begins without knowing/using the difference in length.
    // For example, the following two linked lists:
    // A:           a1 ? a2
    //                     ?
    //                       c1 ? c2 ? c3
    //                     ?
    // B:     b1 ? b2 ? b3
    public Node<T> findIntersectionNode(Node<T> headA, Node<T> headB) {
        //boundary check
        if(headA == null || headB == null) return null;

        Node<T> a = headA;
        Node<T> b = headB;

        //if a & b have different len, then we will stop the loop after second iteration
        while( a != b){
            //for the end of first iteration, we just reset the pointer to the head of another linkedlist
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;
        }
        return a;
    }

}
