package dev.goo.sort;

import java.util.Arrays;

public class InsertSort implements Sort{
    @Override
    public void sort(int[] arr) {
        System.out.println(Arrays.toString(arr));
        for(int i = 1; i < arr.length; i++) {
            int target = arr[i];
            for(int j = i - 1; j >= 0; j--) {
                if(target <= arr[j]) {
                    arr[j+1] = arr[j];
                    arr[j] = target;
                } else {
                    break;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
    }
}
