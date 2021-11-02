package dev.goo.lesson480;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

import dev.goo.binarytree.BinaryTree;

public class Solution {
    public static Integer[] levelOrderTraversal(BinaryTree<Integer> root){
        if(root == null) {
            return new Integer[]{};
        }
        ArrayList<Integer> list = new ArrayList<>();
        ArrayDeque<BinaryTree<Integer>> queue = new ArrayDeque<>();
        queue.add(root);
        while(queue.peek() != null) {
            BinaryTree<Integer> node = queue.remove();
            list.add(node.data);
            if((node.left == null && node.right == null && node.data == null)) {
                continue;
            }
            queue.add(node.left != null ? node.left : new BinaryTree<>());
            queue.add(node.right != null ? node.right : new BinaryTree<>());
        }
        while(list.get(list.size() - 1) == null) {
            list.remove(list.size() - 1);
        }

        return list.toArray(new Integer[]{});
    }

}
