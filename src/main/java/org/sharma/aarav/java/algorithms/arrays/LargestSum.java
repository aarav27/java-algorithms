package org.sharma.aarav.java.algorithms.arrays;

//4. Given an array of integers (both positive and negative).
// Find the continuous sequence with the largest/maximum sum.
// Return the sum.

public class LargestSum {

    public int getMaximumContinousSequenceSum(int[] arr) {
        if(arr==null) {
            return -1;
        } else if(arr.length < 2) {
            return arr[0];
        }

        int sum = 0, maxSum = 0;
        for(int i=0; i<arr.length; i++) {
            sum = sum + arr[i];
            if(maxSum < sum) maxSum = sum;
            else if(sum < 0) sum = 0;
        }
        return maxSum;
    }

}
