package dev.goo.lesson481;

import dev.goo.binarytree.BinaryTree;

public class Solution {
    public static BinaryTree<Integer>  bstDelete(BinaryTree<Integer> root, int key){
        BinaryTree<Integer> node = findNode(root, key);
        if (node == null) {
            return root;
        }
        if(node == root) {
            if(root.left == null) {
                root = root.right;
            } else if(root.right == null) {
                root = root.left;
            } else {
                BinaryTree<Integer> successor = findSuccessor(root.right);
                if(successor != node.right) {
                    BinaryTree<Integer> successorParent = findParent(node, successor);
                    transplant(successorParent, successor, successor.right);
                    successor.right = root.right;
                }
                successor.left = root.left;
                root = successor;
            }
            return root;
        }
        BinaryTree<Integer> nodeParent = (root == node) ? null : findParent(root, node);
        if(node.left == null) {
            transplant(nodeParent, node, node.right);
        } else if(node.right == null) {
            transplant(nodeParent, node, node.left);
        } else {
            BinaryTree<Integer> successor = findSuccessor(node.right);
            if(successor != node.right) {
                BinaryTree<Integer> successorParent = findParent(node, successor);
                transplant(successorParent, successor, successor.right);
                successor.right = node.right;
            }
            transplant(nodeParent, node, successor);
            successor.left = node.left;
        }
        return root;
    }
    public static BinaryTree<Integer> findParent(BinaryTree<Integer> node,
                                                 BinaryTree<Integer> target) {
        BinaryTree<Integer> iterator = node;
        while(iterator != null) {
            if(iterator.left != null && iterator.left.data == target.data) {
                 return iterator;
            }
            if(iterator.right != null && iterator.right.data == target.data) {
                return iterator;
            }
            iterator = iterator.data > target.data ? iterator.left : iterator.right;
        }
        return null;
    }
    public static BinaryTree<Integer> findNode(BinaryTree<Integer> node, int key) {
        if(node == null) {
            return null;
        }
        BinaryTree<Integer> iterator = node;
        while(iterator != null) {
            if(iterator.data == key) {
                return iterator;
            }
            iterator = iterator.data > key ? iterator.left : iterator.right;
        }
        return null;
    }
    public static BinaryTree<Integer> findSuccessor(BinaryTree<Integer> node) {
        BinaryTree<Integer> iterator = node;
        while(iterator.left != null) {
            iterator = iterator.left;
        }
        return iterator;
    }
    public static void transplant(BinaryTree<Integer> parent, BinaryTree<Integer> node, BinaryTree<Integer> target) {
        if (parent.left != node) {
            parent.right = target;
        } else {
            parent.left = target;
        }
    }
}
