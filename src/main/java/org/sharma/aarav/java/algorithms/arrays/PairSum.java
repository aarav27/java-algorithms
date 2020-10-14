package org.sharma.aarav.java.algorithms.arrays;

//5. Given an array, find pair of integers within an array whose sum is specified to a value and return their indexes.

import java.util.HashMap;
import java.util.Map;

public class PairSum {

    // 5.1 Sorting of Array Not allowed. Find original indexes only.
    public int[] findIndexes(int[] arr, int target) {

        if(arr==null) {
            return null;
        } else if (arr.length < 2){
            return new int[]{0, 0};
        }

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i <arr.length; i ++) {
            if(map.containsKey(target - arr[i])) {
                return new int[] {map.get(target-arr[i]), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{0, 0};
    }

    // 5.2 Sorting of Array allowed and then find Indexes after sorting.
    public int[] findIndexesAfterSorting(int[] arr, int target) {

        if(arr==null) {
            return null;
        } else if (arr.length < 2){
            return new int[]{0, 0};
        }

        java.util.Arrays.sort(arr);
        int first = 0;
        int last = arr.length-1;
        while(first < last) {
            int sum = arr[first] + arr[last];
            if(sum == target) {
                return new int[] {first, last};
            } else if(sum < target) {
                first++;
            } else {
                last--;
            }
        }
        return new int[]{0, 0};
    }

}
