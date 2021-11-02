package dev.goo.lesson490;

public class Solution {
    public static int[] buildMaxHeap(int[] intArr) {
        int middle = parent(intArr.length);
        for(int i = middle; i >= 0; i--) {
            maxHeapify(intArr, i);
        }
        return intArr;
    }
    private static int left(int i) {
        return 2*i + 1;
    }
    private static int right(int i) {
        return 2*i + 2;
    }
    private static int parent(int i) {
        return (int) Math.floor((i - 1) / 2);
    }
    private static void maxHeapify(int[] arr, int i) {
        int l = left(i);
        int r = right(i);

        int biggest = i;
        if(l < arr.length && arr[l] > arr[biggest]) {
            biggest = l;
        }
        if(r < arr.length && arr[r] > arr[biggest]) {
            biggest = r;
        }
        if(biggest != i) {
            swap(arr, i, biggest);
            maxHeapify(arr, biggest);
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
