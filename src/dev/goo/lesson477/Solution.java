package dev.goo.lesson477;

import dev.goo.binarytree.BinaryTree;

public class Solution {
    public static BinaryTree bstInsert(BinaryTree root, int key){
        BinaryTree target = findNode(root, key);
        if(target != null) {
            return root;
        }
        BinaryTree iterator = root;
        while(iterator != null) {
            if(iterator.data > key && iterator.left == null) {
                iterator.left = new BinaryTree(key);
            } else if(iterator.data < key && iterator.right == null) {
                iterator.right = new BinaryTree(key);
            } else {
                iterator = iterator.data < key ? iterator.right : iterator.left;
            }
        }
        return root;
    }
    public static BinaryTree findNode(BinaryTree root, int key) {
        BinaryTree iterator = root;
        while(iterator != null) {
            if(iterator.data == key) {
                return iterator;
            }
            iterator = iterator.data < key ? iterator.right : iterator.left;
        }
        return null;
    }
}
