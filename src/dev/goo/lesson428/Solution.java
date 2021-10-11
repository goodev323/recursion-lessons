package dev.goo.lesson428;

import java.util.ArrayDeque;

public class Solution {
    public static int[] minWindowArrK(int[] intArr, int k) {
        if (k == 1) {
            return intArr;
        }
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && intArr[deque.peek()] >= intArr[i]) {
                deque.poll();
            }
            deque.add(i);
        }
        int[] resultArr = new int[intArr.length - k + 1];
        for (int i = k; i < intArr.length; i++) {
            resultArr[i - k] = intArr[deque.peek()];
            while (!deque.isEmpty() && deque.peek() <= i - k) {
                deque.poll();
            }
            while (!deque.isEmpty() && intArr[deque.peek()] >= intArr[i]) {
                deque.poll();
            }
            deque.add(i);
        }
        resultArr[intArr.length - k] = intArr[deque.peek()];
        return resultArr;
    }
}
