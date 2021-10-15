package dev.goo.lesson463;

import dev.goo.binarytree.BinaryTree;

public class Solution {
    public static BinaryTree predecessor(BinaryTree root, int key) {
        BinaryTree targetNode = findNode(root, key);
        if(targetNode == null) {
            return null;
        }
        if(targetNode.left != null) {
            return maximumNode(targetNode.left);
        }
        BinaryTree predecessor = null;
        BinaryTree iterator = root;
        while(iterator != null) {
            if(iterator.data <= targetNode.data) {
                iterator = iterator.right;
            } else {
                if(iterator.data < predecessor.data) {
                    predecessor = iterator;
                }
                iterator = iterator.left;
            }
        }
        return predecessor;
    }

    private static BinaryTree findNode(BinaryTree node, int key) {
        if(node == null) return null;
        if(node.data == key) return node;
        return node.data < key ? findNode(node.right, key) : findNode(node.left, key);
    }

    private static BinaryTree maximumNode(BinaryTree node) {
        return node.right == null ? node : maximumNode(node.right);
    }
}
