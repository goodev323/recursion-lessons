package dev.goo.lesson473;

import dev.goo.binarytree.BinaryTree;

public class Solution {
    public static int maximumDepth(BinaryTree root){
        return preorderWalk(root, 1);
    }
    public static int preorderWalk(BinaryTree node, int currentDepth) {
        if(node == null) {
            return currentDepth;
        }
        int leftMaxDepth = preorderWalk(node.left, currentDepth + 1);
        int rightMaxDepth = preorderWalk(node.right, currentDepth + 1);
        return Math.max(leftMaxDepth, rightMaxDepth);
    }
}
