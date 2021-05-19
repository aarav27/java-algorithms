package org.sharma.aarav.java.algorithms.arrays;

//13. Generate all sub arrays in an array having continuous index location

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aarav Sharma
 */
public class SubArrays {

    public List generate(int[] arr) {

        if(arr==null) return null;

        List results = new ArrayList<List>();

        int len = arr.length;
        // Pick starting point
        for (int i = 0; i < len; i++) {
            // Pick ending point
            for(int j = i ; j < len; j++) {
                List result = new ArrayList<Integer>();
                // Print subarray between current starting and ending points
                for(int k = i; k <= j; k++) {
                    result.add(arr[k]);
                    //System.out.print(arr[k] + " ");
                }
                results.add(result);
                //System.out.println();
            }
        }
        return results;

    }
}
