package dev.goo.lesson82;
import java.util.HashSet;
import java.util.ArrayList;

public class Solution {
    public static int[] missingIntegers(int[] numbers){
        HashSet<Integer> missingIntegerSet = new HashSet<>();
        for(int num: numbers) {
            missingIntegerSet.add(num);
        }
        ArrayList<Integer> missingIntegerList = new ArrayList();
        for(int i = 1; i <= numbers.length; i++) {
            if(!missingIntegerSet.contains(i)){
                missingIntegerList.add(i);
            }
        }
        return missingIntegerList.stream().mapToInt(Integer::valueOf).toArray();
    }
}
