package dev.goo.lesson419;

import java.util.ArrayDeque;
import java.util.HashMap;

public class Solution {
    private static HashMap<Character, Character> parenthesesMap = new HashMap<>() {
        {
            put('[', ']');
            put('{', '}');
            put('(', ')');
        }
    };
    public static boolean isParenthesesValid(String parentheses){
        ArrayDeque<Character> deque = new ArrayDeque<>();
        for(char c : parentheses.toCharArray()) {
            if(parenthesesMap.containsKey(c)) {
                deque.push(c);
            } else {
                if(deque.peek() == null) return false;
                if(parenthesesMap.get(deque.poll()) != c) {
                    return false;
                }
            }
        }
        return true;
    }
}
