package org.sharma.aarav.java.algorithms.arrays;

// 1. Inversion Count for an array indicates n how far (or close) the array is from being sorted.
// If array is already sorted then inversion count is 0.
// If array is sorted in reverse order that inversion count is the maximum.

/**
 * @author Aarav Sharma
 */
public class Inversion {

    public int getInversion(int[] array) {
        if(array==null || array.length <1) return 0;
        int length = array.length;
        int inversion = 0;
        for(int i=0; i < length -1; i++)
            for(int j= i+1; j < length; j++)
                if(array[i] > array[j])
                    inversion ++;
        return inversion;
    }

}
