package dev.goo.lesson462;

import dev.goo.binarytree.BinaryTree;

public class Solution {
    public static BinaryTree successor(BinaryTree root, int key){
        BinaryTree maxNode = maximumNode(root);
        if(!exists(root, key) || maxNode.data == key) {
            return null;
        }
        return successorHelper(root, key, maxNode);
    }

    public static BinaryTree successorHelper(BinaryTree node, int key, BinaryTree current) {
        if(node == null) {
            return current;
        }
        if(node.data == key) {
            return successorHelper(node.right, key, current);
        }
        if(node.data < key) {
            return successorHelper(node.right, key, current);
        }
        if(node.data < current.data) {
            return successorHelper(node.left, key, node);
        }
        return successorHelper(node.left, key, current);
    }

    public static boolean exists(BinaryTree node, int key){
        if(node == null) return false;
        if(node.data == key) return true;
        return key < node.data ? exists(node.left, key) : exists(node.right, key);
    }

    public static BinaryTree maximumNode(BinaryTree root){
        return root.right == null ? root : maximumNode(root.right);
    }
}
