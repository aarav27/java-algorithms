package org.sharma.aarav.java.algorithms.arrays;

//2. Given an array arr[] of n integers, construct a Product Array prod[] (of same size) such that prod[i] is equal to the product of all the elements of arr[] except arr[i].
//   Solve it without division operator and in O(n).
//   Example:
//   arr[] = {10, 3, 5, 6, 2}
//   prod[] = {180, 600, 360, 300, 900}

/**
 * @author Aarav Sharma
 */
public class Product {

    public int[] getProductOfArray(int[] arr) {

        if(arr==null) {
            return arr;
        }
        else if(arr.length<2) {
            return new int[]{0};
        }

        int length = arr.length;
        int[] prod = new int[length];

        for(int i=0; i<length; i++) {
            prod[i] = 1;
        }

        //prod{1,10,30,150,900} after completion of following loop
        int temp = 1;
        for(int i=0; i<length; i++) {
            prod[i] = temp;
            temp *= arr[i];
        }

        //prod{180,600,360,300,900} after completion of following loop
        temp = 1;
        for(int i=length-1; i>=0; i--) {
            prod[i] *= temp;
            temp *= arr[i];
        }

        return prod;

    }
}
