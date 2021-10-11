package dev.goo.trump;

public class HelperFunctions {
    public static int maxInArrayIndex(int[] intArr) {
        int maxIndex = 0;
        int maxValue = intArr[0];
        for(int i = 1; i < intArr.length; i++) {
            if(intArr[i] > maxValue) {
                maxIndex = i;
                maxValue = intArr[i];
            }
        }
        return maxIndex;
    }
}
