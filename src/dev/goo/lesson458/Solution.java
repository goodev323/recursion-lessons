package dev.goo.lesson458;

import dev.goo.binarytree.BinaryTree;

public class Solution {
    public static BinaryTree bstSearch(BinaryTree root, int key) {
        if(root == null || root.data == key) {
            return root;
        }
        return key < root.data ? bstSearch(root.left, key) :
                bstSearch(root.right, key);
    }
}
