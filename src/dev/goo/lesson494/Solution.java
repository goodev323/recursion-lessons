package dev.goo.lesson494;

public class Solution {
    public static int[] minKElements(int[] intArr, int k){
        int[] result = new int[k];
        buildMinHeap(intArr);
        int heapEnd = intArr.length - 1;
        for(int i = 0; i < k; i++) {
            result[i] = intArr[0];
            swap(intArr, heapEnd, 0);
            heapEnd--;
            minHeapify(intArr, heapEnd, 0);
        }
        return result;
    }
    public static void buildMinHeap(int[] intArr) {
        int middle = parent(intArr.length);
        for(int i = middle; i >= 0; i--) {
            minHeapify(intArr, intArr.length - 1, i);
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
    private static void minHeapify(int[] arr, int heapEnd, int i) {
        int l = left(i);
        int r = right(i);

        int smallest = i;
        if(l <= heapEnd && arr[l] < arr[smallest]) {
            smallest = l;
        }
        if(r <= heapEnd && arr[r] < arr[smallest]) {
            smallest = r;
        }
        if(smallest != i) {
            swap(arr, i, smallest);
            minHeapify(arr, heapEnd, smallest);
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
