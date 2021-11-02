package dev.goo.lesson478;

import dev.goo.binarytree.BinaryTree;

public class Solution {
    public static boolean validateBST(BinaryTree root) {
        if(root == null) {
            return true;
        }
        return walkLeftTree(root.left, root.data) && walkRightTree(root.right, root.data) &&  validateBST(root.left) && validateBST(root.right);
    }
    public static boolean walkLeftTree(BinaryTree root, int key) {
        if(root == null) {
            return true;
        }
        if(root.data > key) {
            return false;
        }
        return walkLeftTree(root.left, key) && walkLeftTree(root.right, key);
    }
    public static boolean walkRightTree(BinaryTree root, int key) {
        if(root == null) {
            return true;
        }
        if(root.data < key) {
            return false;
        }
        return walkRightTree(root.left, key) && walkRightTree(root.right, key);
    }
}
