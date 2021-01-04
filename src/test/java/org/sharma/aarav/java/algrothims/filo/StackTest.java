package org.sharma.aarav.java.algrothims.filo;

// 1. Junit to test to push, pop, peek and isEmpty function of a Stack.

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sharma.aarav.java.algorithms.filo.Stack;

public class StackTest {

    private Stack stack;

    @Before
    public void setUp() throws Exception {
        stack = new Stack();
    }

    @Test
    public void pushTestNull() {
        stack.push(null);
        Assert.assertNull(stack.top);
    }

    @Test
    public void pushTest() {
        stack.push(1);
        Assert.assertNotNull(stack.top);
        Assert.assertEquals(1, stack.top.data);
        stack.push(2);
        Assert.assertNotNull(stack.top);
        Assert.assertEquals(2, stack.top.data);
        stack.push(3);
        Assert.assertNotNull(stack.top);
        Assert.assertEquals(3, stack.top.data);
        stack.push(4);
        Assert.assertNotNull(stack.top);
        Assert.assertEquals(4, stack.top.data);
        stack.push(5);
        Assert.assertNotNull(stack.top);
        Assert.assertEquals(5, stack.top.data);
    }

    @Test
    public void popTestNull() {
        Assert.assertNull(stack.pop());
    }

    @Test
    public void popTest() {
        pushTest();
        Assert.assertEquals(Integer.valueOf(5), (Integer) stack.pop());
        Assert.assertEquals(Integer.valueOf(4), (Integer) stack.pop());
        Assert.assertEquals(Integer.valueOf(3), (Integer) stack.pop());
        Assert.assertEquals(Integer.valueOf(2), (Integer) stack.pop());
        Assert.assertEquals(Integer.valueOf(1), (Integer) stack.pop());
        Assert.assertNull(stack.pop());
    }

    @Test
    public void peekTestNull() {
        Assert.assertNull(stack.peek());
    }

    @Test
    public void peekTest() {
        pushTest();
        Assert.assertEquals(Integer.valueOf(5), (Integer) stack.peek());
    }

    @Test
    public void isEmptyTrue() {
        Assert.assertEquals(true, stack.isEmpty());
    }

    @Test
    public void isEmptyFalse() {
        pushTest();
        Assert.assertEquals(false, stack.isEmpty());
    }

}
