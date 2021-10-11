package dev.goo.lesson427;

import java.util.Stack;

public class Solution {
    public static int[] stockSpan(int[] stocks){
        int[] spans = new int[stocks.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < stocks.length; i++) {
            int count = 1;
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && stocks[stack.peek()] <= stocks[i]) stack.pop();
                count = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            }
            stack.push(i);
            spans[i] = count;
        }
        return spans;
    }
}
