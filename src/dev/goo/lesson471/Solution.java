package dev.goo.lesson471;

import java.util.ArrayList;

import dev.goo.binarytree.BinaryTree;

public class Solution {
    public static int[] postorderTraversal(BinaryTree root){
        return postOrderWalk(root, new ArrayList<>()).stream().mapToInt(Integer::intValue).toArray();
    }
    public static ArrayList<Integer> postOrderWalk(BinaryTree node,
                                                   ArrayList<Integer> list) {
        if(node == null) {
            return list;
        }
        postOrderWalk(node.left, list);
        postOrderWalk(node.right, list);
        list.add(node.data);
        return list;
    }
}
