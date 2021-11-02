package dev.goo.lesson491;

public class Solution {
    public static int[] buildMinHeap(int[] intArr) {
        int middle = parent(intArr.length);
        for(int i = middle; i >= 0; i--) {
            mixHeapify(intArr, i);
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
    private static void mixHeapify(int[] arr, int i) {
        int l = left(i);
        int r = right(i);

        int smallest = i;
        if(l < arr.length && arr[l] < arr[smallest]) {
            smallest = l;
        }
        if(r < arr.length && arr[r] < arr[smallest]) {
            smallest = r;
        }
        if(smallest != i) {
            swap(arr, i, smallest);
            mixHeapify(arr, smallest);
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

