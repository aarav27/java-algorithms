package org.sharma.aarav.java.algorithms.tree.binary;

//1. Given a root of a binary tree, Find whether it is a valid Binary Search Tree (BST)

/**
 * @author Aarav Sharma
 */
public class BinaryTree<T> {

    public boolean isBinarySearchTree(Node<Integer> root) {
        return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBinarySearchTree(Node<Integer> root, int low, int high) {
        if(root==null) return true;
        if(root.getData() >= high || root.getData() <= low) return false;
        return isBinarySearchTree(root.getLeft(), low, root.getData()) && isBinarySearchTree(root.getRight(), root.getData(), high);
    }

}
