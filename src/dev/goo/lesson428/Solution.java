package dev.goo.lesson428;

import java.util.ArrayDeque;

public class Solution {
    public static int[] minWindowArrK(int[] intArr, int k) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && intArr[deque.peekLast()] >= intArr[i]) {
                deque.pollLast();
            }
            deque.add(i);
        }
        int[] resultArr = new int[intArr.length - k + 1];
        for (int i = k; i < intArr.length; i++) {
            resultArr[i - k] = intArr[deque.peek()];
            while (!deque.isEmpty() && deque.peek() <= i - k) {
                deque.poll();
            }
            while (!deque.isEmpty() && intArr[deque.peekLast()] >= intArr[i]) {
                deque.pollLast();
            }
            deque.add(i);
        }
        resultArr[intArr.length - k] = intArr[deque.peek()];
        return resultArr;
    }
}
