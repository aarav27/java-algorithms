package org.sharma.aarav.java.algrothims.fifo;

// 1. Junit to test to enqueue, dequeue, peek and isEmpty function of a Queue.

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sharma.aarav.java.algorithms.fifo.Queue;

public class QueueTest {

    private Queue queue;

    @Before
    public void setUp() throws Exception {
        queue = new Queue();
    }

    @Test
    public void enqueueTestNull() {
        queue.enqueue(null);
        Assert.assertNull(queue.first);
        Assert.assertNull(queue.last);
    }

    @Test
    public void enqueueTest() {
        queue.enqueue("A");
        Assert.assertNotNull(queue.last);
        Assert.assertEquals("A", queue.last.data);
        Assert.assertNull(queue.last.next);
        Assert.assertNotNull(queue.first);
        Assert.assertEquals("A", queue.first.data);
        Assert.assertNull(queue.first.next);
        queue.enqueue("B");
        Assert.assertNotNull(queue.last);
        Assert.assertEquals("B", queue.last.data);
        Assert.assertNull(queue.last.next);
        Assert.assertNotNull(queue.first);
        Assert.assertEquals("A", queue.first.data);
        Assert.assertNotNull(queue.first.next);
        Assert.assertEquals("B", queue.first.next.data);
        queue.enqueue("C");
        Assert.assertNotNull(queue.last);
        Assert.assertEquals("C", queue.last.data);
        Assert.assertNull(queue.last.next);
        Assert.assertNotNull(queue.first);
        Assert.assertEquals("A", queue.first.data);
        Assert.assertNotNull(queue.first.next);
        Assert.assertEquals("B", queue.first.next.data);
        Assert.assertNotNull(queue.first.next.next);
        Assert.assertEquals("C", queue.first.next.next.data);
        queue.enqueue("D");
        Assert.assertNotNull(queue.last);
        Assert.assertEquals("D", queue.last.data);
        Assert.assertNull(queue.last.next);
        Assert.assertNotNull(queue.first);
        Assert.assertEquals("A", queue.first.data);
        Assert.assertNotNull(queue.first.next);
        Assert.assertEquals("B", queue.first.next.data);
        Assert.assertNotNull(queue.first.next.next);
        Assert.assertEquals("C", queue.first.next.next.data);
        Assert.assertNotNull(queue.first.next.next.next);
        Assert.assertEquals("D", queue.first.next.next.next.data);
        queue.enqueue("E");
        Assert.assertNotNull(queue.last);
        Assert.assertEquals("E", queue.last.data);
        Assert.assertNull(queue.last.next);
        Assert.assertNotNull(queue.first);
        Assert.assertEquals("A", queue.first.data);
        Assert.assertNotNull(queue.first.next);
        Assert.assertEquals("B", queue.first.next.data);
        Assert.assertNotNull(queue.first.next.next.next);
        Assert.assertEquals("D", queue.first.next.next.next.data);
        Assert.assertNotNull(queue.first.next.next.next.next);
        Assert.assertEquals("E", queue.first.next.next.next.next.data);
    }

    @Test
    public void dequeueTestNull() {
        Assert.assertNull(queue.dequeue());
    }

    @Test
    public void dequeueTest() {
        enqueueTest();
        Assert.assertEquals("A", (String) queue.dequeue());
        Assert.assertEquals("B", (String) queue.dequeue());
        Assert.assertEquals("C", (String) queue.dequeue());
        Assert.assertEquals("D", (String) queue.dequeue());
        Assert.assertEquals("E", (String) queue.dequeue());
        Assert.assertNull(queue.dequeue());
    }

    @Test
    public void peekTestNull() {
        Assert.assertNull(queue.peek());
    }

    @Test
    public void peekTest() {
        enqueueTest();
        Assert.assertEquals("A", (String) queue.peek());
    }

    @Test
    public void isEmptyTrue() {
        Assert.assertEquals(true, queue.isEmpty());
    }

    @Test
    public void isEmptyFalse() {
        enqueueTest();
        Assert.assertEquals(false, queue.isEmpty());
    }

}
