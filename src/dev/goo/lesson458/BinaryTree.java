package dev.goo.lesson458;

public class BinaryTree {
    public int data;
    public BinaryTree left;
    public BinaryTree right;

    public BinaryTree() {}
    public BinaryTree(int data) {
        this.data = data;
    }
    public BinaryTree(int data, BinaryTree left, BinaryTree right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
