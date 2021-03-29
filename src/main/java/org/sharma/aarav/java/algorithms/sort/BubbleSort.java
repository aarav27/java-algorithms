package org.sharma.aarav.java.algorithms.sort;

//1. Using Bubble Sort, sort elements of an array for given array of A with n elements A[1], A[2], ....., A[N].

/**
 * @author Aarav Sharma
 */
public class BubbleSort {

    public int[] sort(int[] array) {

        if(array==null || array.length <1) return array;

        int length = array.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < (length - 1) - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;

    }
}

