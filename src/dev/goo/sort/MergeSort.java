package dev.goo.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MergeSort implements Sort {
    @Override
    public void sort(int[] arr) {
        List<Integer> list =
                Arrays.stream(arr).boxed().collect(Collectors.toList());
    }

    public static ArrayList<Integer> sortHelper(List<Integer> arr, int start,
                                                int end) {
        if (start == end) {
            return new ArrayList<>(Arrays.asList(arr.get(start)));
        }
        int middle = (int) Math.floor((start + end) / 2);
        ArrayList<Integer> leftArr = sortHelper(arr, start, middle);
        ArrayList<Integer> rightArr = sortHelper(arr, middle + 1, end);
        leftArr.add(Integer.MAX_VALUE);
        rightArr.add(Integer.MAX_VALUE);
        int l = leftArr.size() + rightArr.size() - 2;
        int li = 0;
        int ri = 0;
        ArrayList<Integer> merged = new ArrayList<>();
        while (li + ri < l) {
            if (leftArr.get(li) <= rightArr.get(ri)) {
                merged.add(leftArr.get(li));
                li++;
            } else {
                merged.add(rightArr.get(ri));
                ri++;
            }
        }
        return merged;
    }

}
