package dev.goo.lesson469;

import java.util.ArrayList;

import dev.goo.binarytree.BinaryTree;

public class Solution {
    public static int[] preorderTraversal(BinaryTree root){
        ArrayList<Integer> result = new ArrayList<>();
        preorderTraversalHelper(root, result);
        return result.stream().mapToInt(i -> i).toArray();
    }
    private static void preorderTraversalHelper(BinaryTree node, ArrayList<Integer> list) {
        list.add(node.data);
        if(node.left != null) preorderTraversalHelper(node.left, list);
        if(node.right != null) preorderTraversalHelper(node.right, list);
    }
}
