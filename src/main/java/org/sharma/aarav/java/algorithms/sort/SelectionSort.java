package org.sharma.aarav.java.algorithms.sort;

//2. Using Selection Sort, sort elements of an array for given array of A with n elements A[1], A[2], ....., A[N].

/**
 * @author Aarav Sharma
 */
public class SelectionSort {

    public int[] sort(int[] array) {

        if(array==null || array.length <1) return array;

        int length = array.length;
        for (int i = 0; i < length-1; i++) {
            int smallestIndex = i;
            for (int j = i+1; j < length; j++) {
                if (array[smallestIndex] > array[j]) {
                    smallestIndex = j;
                }
            }
            int temp = array[smallestIndex];
            array[smallestIndex] = array[i];
            array[i] = temp;
        }
        return array;

    }

}
