package org.sharma.aarav.java.algorithms.arrays;

//6. Given a matrix (Two dimensional array) in which each row and each column is sorted, write a method to find a value in it.
// Return Row and Column of the found value.

public class Matrix {

    public int[] findRowColumnInSorted(int[][] arr, int target, int m, int n) {

        if(arr==null) { return null; }

        int row = 0;
        int column = n-1;
        while(row < m && column >= 0) {
            if(arr[row][column]==target) return new int[]{row+1, column+1};
            else if(arr[row][column]<target) row++;
            else column--;
        }
        return new int[]{-1, -1};
    }

}
