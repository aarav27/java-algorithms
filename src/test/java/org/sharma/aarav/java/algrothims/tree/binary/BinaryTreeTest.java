package org.sharma.aarav.java.algrothims.tree.binary;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sharma.aarav.java.algorithms.tree.binary.BinaryTree;
import org.sharma.aarav.java.algorithms.tree.binary.Node;

/**
 * @author Aarav Sharma
 */
public class BinaryTreeTest<T> {

    private BinaryTree binaryTree;

    @Before
    public void setUp() throws Exception {
        binaryTree = new BinaryTree();
    }

    @Test
    public void isBinarySearchTreeTestNull() {
        Assert.assertTrue(binaryTree.isBinarySearchTree(null));
    }

    @Test
    public void isBinarySearchTreeTestTrue() {
        Assert.assertTrue(binaryTree.isBinarySearchTree(getBinarySearchTree()));
    }

    @Test
    public void isBinarySearchTreeTestFalse() {
        Assert.assertFalse(binaryTree.isBinarySearchTree(getBinaryTree()));
    }

    private Node<T> getBinarySearchTree() {
        Node rootLeftLeftLeft = new Node(8);
        Node rootLeftLeftRight = new Node(13);

        Node rootLeftRightLeft = new Node(16);

        Node rootLeftLeft = new Node(12);
        rootLeftLeft.setLeft(rootLeftLeftLeft);
        rootLeftLeft.setRight(rootLeftLeftRight);

        Node rootLeftRight = new Node(18);
        rootLeftRight.setLeft(rootLeftRightLeft);

        Node rootLeft = new Node(15);
        rootLeft.setLeft(rootLeftLeft);
        rootLeft.setRight(rootLeftRight);

        Node rootRightLeft = new Node(25);
        Node rootRightRight = new Node(35);

        Node rootRight = new Node(30);
        rootRight.setLeft(rootRightLeft);
        rootRight.setRight(rootRightRight);

        Node root = new Node(20);
        root.setLeft(rootLeft);
        root.setRight(rootRight);

        return root;
    }

    private Node<T> getBinaryTree() {
        Node rootLeftLeftLeft = new Node(13);
        Node rootLeftLeftRight = new Node(8);

        Node rootLeftRightLeft = new Node(16);

        Node rootLeftLeft = new Node(12);
        rootLeftLeft.setLeft(rootLeftLeftLeft);
        rootLeftLeft.setRight(rootLeftLeftRight);

        Node rootLeftRight = new Node(18);
        rootLeftRight.setLeft(rootLeftRightLeft);

        Node rootLeft = new Node(15);
        rootLeft.setLeft(rootLeftLeft);
        rootLeft.setRight(rootLeftRight);

        Node rootRightLeft = new Node(25);
        Node rootRightRight = new Node(35);

        Node rootRight = new Node(30);
        rootRight.setLeft(rootRightLeft);
        rootRight.setRight(rootRightRight);

        Node root = new Node(20);
        root.setLeft(rootLeft);
        root.setRight(rootRight);

        return root;
    }
}
