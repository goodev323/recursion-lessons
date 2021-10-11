package dev.goo.lesson420;

public class Solution {
    public static int largestRectangle(int[] h){
        int largestRectangle = 0;
        for(int i = 0; i < h.length; i++) {
            int front = i;
            int back = i;
            for(int j = i - 1; 0 <= j; j--) {
                if(h[i] > h[j]) {
                    break;
                }
                front = j;
            }
            for(int j = i + 1; j < h.length; j++) {
                if(h[i] > h[j]) {
                    break;
                }
                back = j;
            }
            int rectangle = (back - front + 1) * h[i];
            if(largestRectangle < rectangle) {
                largestRectangle = rectangle;
            }
        }
        return largestRectangle;
    }
}
