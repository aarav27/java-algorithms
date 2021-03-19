package org.sharma.aarav.java.algorithms.arrays;

//6. Given a matrix (Two dimensional array) in which each row and each column is sorted, write a method to find a value in it.
// Return Row and Column of the found value.

//7. Given a matrix (Two dimensional array)
// Return an array containing the elements of column c of arr2D in the same order as they appear in arr2D

//8. Given a matrix (Two dimensional array)
// Return an array containing the elements of row r of arr2D in the same order as they appear in arr2D

/**
 * @author Aarav Sharma
 */
public class Matrix {

    //6. Given a matrix (Two dimensional array) in which each row and each column is sorted, write a method to find a value in it.
    // Return Row and Column of the found value.
    public int[] findRowColumnInSorted(int[][] arr2D, int target, int m, int n) {
        if(arr2D==null) { return null; }
        int row = 0;
        int column = n-1;
        while(row < m && column >= 0) {
            if(arr2D[row][column]==target) return new int[]{row+1, column+1};
            else if(arr2D[row][column]<target) row++;
            else column--;
        }
        return new int[]{-1, -1};
    }

    //7. Given a matrix (Two dimensional array)
    // Return an array containing the elements of column c of arr2D in the same order as they appear in arr2D
    public int[] getCoulmn(int[][] arr2D, int c) {
        if(arr2D==null || arr2D[0].length <= c) { return null; }
        int[] colArray = new int[arr2D.length];
        for(int row = 0; row < arr2D.length; row++) {
            colArray[row] = arr2D[row][c];
        }
        return colArray;
    }

    //8. Given a matrix (Two dimensional array)
    // Return an array containing the elements of row r of arr2D in the same order as they appear in arr2D
    public int[] getRow(int[][] arr2D, int r) {
        if(arr2D==null || arr2D.length <= r) { return null; }
        int[] rowArray = new int[arr2D[0].length];
        for(int col = 0; col < arr2D[0].length; col++) {
            rowArray[col] = arr2D[r][col];
        }
        return rowArray;
    }

}
