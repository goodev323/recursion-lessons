package dev.goo.lesson470;

import java.util.ArrayList;

import dev.goo.binarytree.BinaryTree;

public class Solution {
    public static int[] inorderTraversal(BinaryTree root){
        ArrayList<Integer> list = new ArrayList<>();
        inorderTraversalHelper(root, list);
        return list.stream().mapToInt(i -> i).toArray();
    }
    public static void inorderTraversalHelper(BinaryTree node, ArrayList<Integer> list) {
        if(node.left != null) inorderTraversalHelper(node.left, list);
        list.add(node.data);
        if(node.right != null) inorderTraversalHelper(node.right, list);
    }
}
