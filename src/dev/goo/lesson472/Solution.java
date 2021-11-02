package dev.goo.lesson472;

import java.util.ArrayList;

import dev.goo.binarytree.BinaryTree;

public class Solution {
    public static int[] reverseInorderTraversal(BinaryTree root){
        return reverseInorderWalk(root, new ArrayList<Integer>()).stream().mapToInt(Integer::intValue).toArray();
    }
    private static ArrayList<Integer> reverseInorderWalk(BinaryTree node,
                                                         ArrayList<Integer> list) {
        if(node == null) {
            return list;
        }
        reverseInorderWalk(node.right, list);
        list.add(node.data);
        reverseInorderWalk(node.left, list);
        return list;
    }
}
