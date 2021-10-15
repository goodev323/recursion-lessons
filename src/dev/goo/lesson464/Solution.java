package dev.goo.lesson464;

import dev.goo.binarytree.BinaryTree;

public class Solution {
    public static BinaryTree sortedArrToBST(int[] numberList) {
        return sortedArrToBSTHelper(0, numberList.length - 1, numberList);
    }

    private static BinaryTree sortedArrToBSTHelper(int start, int end, int[] numberList) {
        if (start == end) return new BinaryTree(numberList[start]);
        int mid = (int) Math.floor((start + end) / 2);
        BinaryTree left = start == mid ? null : sortedArrToBSTHelper(start, mid - 1, numberList);
        BinaryTree right = start == mid ? null : sortedArrToBSTHelper(mid + 1, end, numberList);
        BinaryTree root = new BinaryTree(numberList[mid]);
        root.left = left;
        root.right = right;
        return root;
    }
}
