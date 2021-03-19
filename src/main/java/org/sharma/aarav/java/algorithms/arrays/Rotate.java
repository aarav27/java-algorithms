package org.sharma.aarav.java.algorithms.arrays;

//3. Rotate an array of size shifts each of the array's elements

/**
 * @author Aarav Sharma
 */
public class Rotate {

    //3. A left rotation operation on an array of size shifts each of the array's elements unit to the left.
    //  For example, if 4 left rotations are performed on array [1,2,3,4,5] then array would become [5,4,3,2,1].

    public int[] getLeftRotatedArray(int[] arr, int rotate) {
        if(arr==null || arr.length < 2 || rotate==0) {
            return arr;
        }

        int length = arr.length;
        int[] result = new int[length];

        // Required, if rotate is greater than length
        rotate = rotate % length;

        for(int i = 0; i<length; i++) {
            int newIndex = (i + (length - rotate)) % length;
            result[newIndex] = arr[i];
        }
        return result;
    }

}
