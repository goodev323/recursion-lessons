package dev.goo.array;

public class ArrayImpl {
    public static int higherThanN(String[] arr) {
        int total = 0;
        for(int i = 0; i < arr.length; i++) {
            String targetStr = arr[i];
            for(int j = 0; j < targetStr.length(); j++) {
                char targetChar = targetStr.charAt(j);
                if(targetChar >= 'n') total++;
            }
        }
        return total;
    }
}
