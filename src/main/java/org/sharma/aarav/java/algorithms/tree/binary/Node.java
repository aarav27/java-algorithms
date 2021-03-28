package org.sharma.aarav.java.algorithms.tree.binary;

// Binary Tree Node

/**
 * @author Aarav Sharma
 */
public class Node<T> {

    private Node<T> left;
    private Node<T> right;

    private T data;

    public Node(T data) {
        this.data = data;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
