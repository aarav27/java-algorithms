package org.sharma.aarav.java.algorithms.list;

public class CircularLinkedList<T> {

    //8. Implement an algorithm to find whether a linked list is a circular or has loop :: Given head node
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

    //9. Implement an algorithm to get node at the beginning of the loop of a circular linked list :: Given head node
    public Node<T> getNodeAtLoopBeginning(Node<T> head) {
        Node<T> slow = head;
        Node<T> fast = head;

        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) break;
        }

        if(fast==null || fast.next==null) return null;

        slow = head;
        while(slow!=fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }

    //10. Implement an algorithm to detected whether a linked list is a circular or has loop; and further remove the loop :: Given head node
    public boolean detectAndRemoveLoop(Node<T> head) {
        Node<T> slow = head;
        Node<T> fast = head;

        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)  {
                removeLoop(slow, head);
                return true;
            }
        }
        return false;
    }

    private void removeLoop(Node slow, Node head) {
        Node<T> ptr1 = head;
        Node<T> ptr2 = null;
        while(1==1) {
            ptr2 = slow;
            while(ptr2.next!=slow && ptr2.next!=ptr1) {
                ptr2 = ptr2.next;
                //System.out.println("ptr2.data"+ptr2.data);
            }

            // if ptr2.next is ptr1 then ptr2 is at end of loop. So break the loop
            if(ptr2.next==ptr1) break;

		    /* If ptr2.next did't reach ptr1 then try the next node after ptr1.
		       Because then the circular list doesn't start from head.
		       So we have to increment ptr1 as its intially pointing to head.
		    */
            ptr1 = ptr1.next;
        }
	    /* After the end of loop ptr2 is the last node of the loop. So
           make next of ptr2 as NULL
	    */
        ptr2.next = null;
    }

}
