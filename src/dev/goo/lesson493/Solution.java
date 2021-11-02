package dev.goo.lesson493;

public class Solution {
    public static int[] topKElements(int[] intArr, int k){
        int[] result = new int[k];
        buildMaxHeap(intArr);
        int heapEnd = intArr.length - 1;
        for(int i = 0; i < k; i++) {
            result[i] = intArr[0];
            swap(intArr, heapEnd, 0);
            heapEnd--;
            maxHeapify(intArr, heapEnd, 0);
        }
        return result;
    }
    public static void buildMaxHeap(int[] intArr) {
        int middle = parent(intArr.length);
        for(int i = middle; i >= 0; i--) {
            maxHeapify(intArr, intArr.length - 1, i);
        }
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
    private static void maxHeapify(int[] arr, int heapEnd, int i) {
        int l = left(i);
        int r = right(i);

        int biggest = i;
        if(l <= heapEnd && arr[l] > arr[biggest]) {
            biggest = l;
        }
        if(r <= heapEnd && arr[r] > arr[biggest]) {
            biggest = r;
        }
        if(biggest != i) {
            swap(arr, i, biggest);
            maxHeapify(arr, heapEnd, biggest);
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
