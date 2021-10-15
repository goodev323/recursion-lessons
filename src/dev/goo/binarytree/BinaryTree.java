package dev.goo.binarytree;

public class BinaryTree {
    public int data;
    public BinaryTree left;
    public BinaryTree right;

    public BinaryTree() {}
    public BinaryTree(int data) { this.data = data; }
    public BinaryTree(int data, BinaryTree left, BinaryTree right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public void printPreOrder() {
        System.out.println(this.data);
        if(this.left != null) {
            this.left.printPreOrder();
        }
        if(this.right != null) {
            this.right.printPreOrder();
        }
    }

    public void printInOrder() {
        if(this.left != null) {
            this.left.printInOrder();
        }
        System.out.print(this.data + " ");
        if(this.right != null) {
            this.right.printInOrder();
        }
    }

    public void printPostOrder() {
        if(this.left != null) {
            this.left.printPostOrder();
        }
        if(this.right != null) {
            this.right.printPostOrder();
        }
        System.out.print(this.data + " ");
    }

    public void printReverseOrder() {
        if(this.right != null) {
            this.right.printReverseOrder();
        }
        System.out.println(this.data);
        if(this.left != null) {
            this.left.printReverseOrder();
        }
    }
}
