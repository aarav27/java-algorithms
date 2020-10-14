package org.sharma.aarav.java.algorithms.arrays;

//5. Given an array, find pair of integers within an array whose sum is specified to a value and return their indexes.
// Sorting of Array not allowed.

import java.util.HashMap;
import java.util.Map;

public class PairSum {

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

}
