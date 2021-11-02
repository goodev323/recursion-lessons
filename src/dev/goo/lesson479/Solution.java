package dev.goo.lesson479;

import java.util.ArrayList;
import java.util.Arrays;

import dev.goo.binarytree.BinaryTree;

public class Solution {
    public static boolean symmetricTree(BinaryTree<Integer> root){
        if(root == null) return true;
        if(root.left == null || root.right == null) {
            return false;
        }
        ArrayList<Integer> left = inOrderListHelper(root.left, new ArrayList<>());
        ArrayList<Integer> right = reverseInOrderListHelper(root.right, new ArrayList<>());

        return left.equals(right);
    }

    private static ArrayList<Integer> inOrderListHelper(BinaryTree<Integer> node, ArrayList<Integer> list) {
        if(node == null) {
            list.add(null);
            return list;
        }
        if(node.left == null && node.right == null && list.size() != 0) {
            list.add(node.data);
            return list;
        }
        inOrderListHelper(node.left, list);
        list.add(node.data);
        inOrderListHelper(node.right, list);
        return list;
    }
    private static ArrayList<Integer> reverseInOrderListHelper(BinaryTree<Integer> node, ArrayList<Integer> list) {
        if(node == null) {
            list.add(null);
            return list;
        }
        if(node.left == null && node.right == null && list.size() != 0) {
            list.add(node.data);
            return list;
        }
        reverseInOrderListHelper(node.right, list);
        list.add(node.data);
        reverseInOrderListHelper(node.left, list);
        return list;
    }
}
