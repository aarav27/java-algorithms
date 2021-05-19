package org.sharma.aarav.java.algrothims.arrays;

//6. Junit to find a value in an 2D array n which each row and each column is sorted.
//7. Junit to get an array having elements of column c from a 2D array in the same order as they appear
//8. Junit to get an array having elements of row r from a 2D array in the same order as they appear
//9. Junit to reverse all the rows of given 2D array
//10. Junit to reverse all the columns of given 2D array
//11. Junit to reverse given matrix or 2D array

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sharma.aarav.java.algorithms.arrays.Matrix;

import java.util.Arrays;

/**
 * @author Aarav Sharma
 */
public class MatrixTest {

    private Matrix matrix;

    @Before
    public void setUp() throws Exception {
        matrix = new Matrix();
    }

    @Test
    public void findRowColumnInSortedTestNull() { Assert.assertNull(matrix.findRowColumnInSorted(null, 5, 0, 0)); }

    @Test
    public void findRowColumnInSortedTestWithTwoRowColumnAndMatch() {
        Assert.assertEquals(Arrays.toString(new int[]{2, 2}), Arrays.toString(matrix.findRowColumnInSorted(new int[][] { { 1, 2 }, { 3, 4 } },4, 2, 2)));
    }

    @Test
    public void findRowColumnInSortedTestWithTwoRowsColumnAndNotMatch() {
        Assert.assertEquals(Arrays.toString(new int[]{-1, -1}), Arrays.toString(matrix.findRowColumnInSorted(new int[][] { { 1, 2 }, { 3, 4 } },5, 2, 2)));
    }

    @Test
    public void findRowColumnInSortedTestWithThreeRowsColumnAndMatch() {
        Assert.assertEquals(Arrays.toString(new int[]{3, 1}), Arrays.toString(matrix.findRowColumnInSorted(new int[][] { { 2, 4, 6 }, { 8, 10, 12 }, { 14, 16, 18 }},14, 3, 3)));
    }

    @Test
    public void findRowColumnInSortedTestWithThreeRowsColumnAndNoMatch() {
        Assert.assertEquals(Arrays.toString(new int[]{-1, -1}), Arrays.toString(matrix.findRowColumnInSorted(new int[][] { { 2, 4, 6 }, { 8, 10, 12 }, { 14, 16, 18 }},17, 3, 3)));
    }

    @Test
    public void findRowColumnInSortedTestWithThreeRowsFiveColumnAndMatch() {
        Assert.assertEquals(Arrays.toString(new int[]{3, 4}), Arrays.toString(matrix.findRowColumnInSorted(new int[][] { { 1, 3, 5, 7, 9 }, { 11, 13, 15, 17, 19 }, { 21, 23, 25, 27, 29 }},27, 3, 5)));
    }

    @Test
    public void findRowColumnInSortedTestWithThreeRowsFiveColumnAndNoMatch() {
        Assert.assertEquals(Arrays.toString(new int[]{-1, -1}), Arrays.toString(matrix.findRowColumnInSorted(new int[][] { { 1, 3, 5, 7, 9 }, { 11, 13, 15, 17, 19 }, { 21, 23, 25, 27, 29 }},28, 3, 5)));
    }

    @Test
    public void getColumnTestNull() { Assert.assertNull(matrix.getCoulmn(null, 1)); }

    @Test
    public void getColumnTestNullOutOfBounds() { Assert.assertNull(matrix.getCoulmn(new int[][] { { 2, 4, 6 }, { 8, 10, 12 }, { 14, 16, 18 }},3)); }

    @Test
    public void getColumnTestWithThreeRowColumn() {
        Assert.assertEquals(Arrays.toString(new int[]{6, 12, 18}), Arrays.toString(matrix.getCoulmn(new int[][] { { 2, 4, 6 }, { 8, 10, 12 }, { 14, 16, 18 }},2)));
    }

    @Test
    public void getColumnTestWithFourRowAndThreeColumn() {
        Assert.assertEquals(Arrays.toString(new int[]{1, 4, 7, 5}), Arrays.toString(matrix.getCoulmn(new int[][] { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, {9, 5, 3}},1)));
    }

    @Test
    public void getColumnTestWithThreeRowAndFiveColumn() {
        Assert.assertEquals(Arrays.toString(new int[]{7, 17, 27}), Arrays.toString(matrix.getCoulmn(new int[][] { { 1, 3, 5, 7, 9 }, { 11, 13, 15, 17, 19 }, { 21, 23, 25, 27, 29 }},3)));
    }

    @Test
    public void getRowTestNull() { Assert.assertNull(matrix.getRow(null, 1)); }

    @Test
    public void getRowTestNullOutOfBounds() { Assert.assertNull(matrix.getRow(new int[][] { { 2, 4, 6 }, { 8, 10, 12 }, { 14, 16, 18 }},3)); }

    @Test
    public void getRowTestWithThreeRowColumn() {
        Assert.assertEquals(Arrays.toString(new int[]{14, 16, 18}), Arrays.toString(matrix.getRow(new int[][] { { 2, 4, 6 }, { 8, 10, 12 }, { 14, 16, 18 }},2)));
    }

    @Test
    public void getRowTestWithFourRowAndThreeColumn() {
        Assert.assertEquals(Arrays.toString(new int[]{3, 4, 5}), Arrays.toString(matrix.getRow(new int[][] { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, {9, 5, 3}},1)));
    }

    @Test
    public void getRowTestWithThreeRowAndFiveColumn() {
        Assert.assertEquals(Arrays.toString(new int[]{1, 3, 5, 7, 9}), Arrays.toString(matrix.getRow(new int[][] { { 1, 3, 5, 7, 9 }, { 11, 13, 15, 17, 19 }, { 21, 23, 25, 27, 29 }},0)));
    }

    @Test
    public void reverseAllRowsTestWithThreeRowAndTwoColumn() {
        int[][] arr2D = new int[][] { { 5, 7 }, { 15, 17 }, { 25, 27 }};
        matrix.reverseAllRows(arr2D);
        Assert.assertEquals(Arrays.toString(new int[] { 7, 5 }), Arrays.toString((arr2D)[0]));
        Assert.assertEquals(Arrays.toString(new int[] { 17, 15 }), Arrays.toString((arr2D)[1]));
        Assert.assertEquals(Arrays.toString(new int[] { 27, 25 }), Arrays.toString((arr2D)[2]));
    }

    @Test
    public void reverseAllRowsTestWithThreeRowColumn() {
        int[][] arr2D = new int[][] { { 2, 4, 6 }, { 8, 10, 12 }, { 14, 16, 18 }};
        matrix.reverseAllRows(arr2D);
        Assert.assertEquals(Arrays.toString(new int[] { 6, 4, 2 }), Arrays.toString((arr2D)[0]));
        Assert.assertEquals(Arrays.toString(new int[] { 12, 10, 8 }), Arrays.toString((arr2D)[1]));
        Assert.assertEquals(Arrays.toString(new int[] { 18, 16, 14 }), Arrays.toString((arr2D)[2]));
    }

    @Test
    public void reverseAllRowsTestWithFourRowAndFiveColumn() {
        int[][] arr2D = new int[][] { { 1, 3, 5, 7, 9 }, { 11, 13, 15, 17, 19 }, { 21, 23, 25, 27, 29 }, {31, 33, 35, 37, 39 }};
        matrix.reverseAllRows(arr2D);
        Assert.assertEquals(Arrays.toString(new int[] { 9, 7, 5, 3, 1 }), Arrays.toString((arr2D)[0]));
        Assert.assertEquals(Arrays.toString(new int[] { 19, 17, 15, 13, 11}), Arrays.toString((arr2D)[1]));
        Assert.assertEquals(Arrays.toString(new int[] { 29, 27, 25, 23, 21}), Arrays.toString((arr2D)[2]));
        Assert.assertEquals(Arrays.toString(new int[] { 39, 37, 35, 33, 31}), Arrays.toString((arr2D)[3]));
    }

    @Test
    public void reverseAllColumnsTestWithThreeRowAndTwoColumn() {
        int[][] arr2D = new int[][] { { 5, 7 }, { 15, 17 }, { 25, 27 }};
        matrix.reverseAllColumns(arr2D);
        // Column 1
        Assert.assertEquals(25, (arr2D)[0][0]);
        Assert.assertEquals(15, (arr2D)[1][0]);
        Assert.assertEquals(5, (arr2D)[2][0]);
        // Column 2
        Assert.assertEquals(27, (arr2D)[0][1]);
        Assert.assertEquals(17, (arr2D)[1][1]);
        Assert.assertEquals(7, (arr2D)[2][1]);
    }

    @Test
    public void reverseAllColumnsTestWithThreeRowColumn() {
        int[][] arr2D = new int[][] { { 2, 4, 6 }, { 8, 10, 12 }, { 14, 16, 18 }};
        matrix.reverseAllColumns(arr2D);
        // Column 1
        Assert.assertEquals(14, (arr2D)[0][0]);
        Assert.assertEquals(8, (arr2D)[1][0]);
        Assert.assertEquals(2, (arr2D)[2][0]);
        // Column 2
        Assert.assertEquals(16, (arr2D)[0][1]);
        Assert.assertEquals(10, (arr2D)[1][1]);
        Assert.assertEquals(4, (arr2D)[2][1]);
        // Column 3
        Assert.assertEquals(18, (arr2D)[0][2]);
        Assert.assertEquals(12, (arr2D)[1][2]);
        Assert.assertEquals(6, (arr2D)[2][2]);
    }

    @Test
    public void reverseAllColumnsTestWithFourRowAndFiveColumn() {
        int[][] arr2D = new int[][] { { 1, 3, 5, 7, 9 }, { 11, 13, 15, 17, 19 }, { 21, 23, 25, 27, 29 }, {31, 33, 35, 37, 39 }};
        matrix.reverseAllColumns(arr2D);
        // Column 1
        Assert.assertEquals(31, (arr2D)[0][0]);
        Assert.assertEquals(21, (arr2D)[1][0]);
        Assert.assertEquals(11, (arr2D)[2][0]);
        Assert.assertEquals(1, (arr2D)[3][0]);
        // Column 2
        Assert.assertEquals(33, (arr2D)[0][1]);
        Assert.assertEquals(23, (arr2D)[1][1]);
        Assert.assertEquals(13, (arr2D)[2][1]);
        Assert.assertEquals(3, (arr2D)[3][1]);
        // Column 3
        Assert.assertEquals(35, (arr2D)[0][2]);
        Assert.assertEquals(25, (arr2D)[1][2]);
        Assert.assertEquals(15, (arr2D)[2][2]);
        Assert.assertEquals(5, (arr2D)[3][2]);
        // Column 4
        Assert.assertEquals(37, (arr2D)[0][3]);
        Assert.assertEquals(27, (arr2D)[1][3]);
        Assert.assertEquals(17, (arr2D)[2][3]);
        Assert.assertEquals(7, (arr2D)[3][3]);
        // Column 5
        Assert.assertEquals(39, (arr2D)[0][4]);
        Assert.assertEquals(29, (arr2D)[1][4]);
        Assert.assertEquals(19, (arr2D)[2][4]);
        Assert.assertEquals(9, (arr2D)[3][4]);
    }

    @Test
    public void reverseMatrixTestWithTwoRowAndColumn() {
        int[][] arr2D = new int[][] { { 1, 2 }, { 3, 4 }};
        matrix.reverseMatrix(arr2D);
        Assert.assertEquals(4, (arr2D)[0][0]);
        Assert.assertEquals(3, (arr2D)[0][1]);
        Assert.assertEquals(2, (arr2D)[1][0]);
        Assert.assertEquals(1, (arr2D)[1][1]);
    }

    @Test
    public void reverseMatrixTestWithThreeRowAndTwoColumn() {
        int[][] arr2D = new int[][] { { 1, 2 }, { 3, 4 }, { 5, 6 }};
        matrix.reverseMatrix(arr2D);
        Assert.assertEquals(6, (arr2D)[0][0]);
        Assert.assertEquals(5, (arr2D)[0][1]);
        Assert.assertEquals(4, (arr2D)[1][0]);
        Assert.assertEquals(3, (arr2D)[1][1]);
        Assert.assertEquals(2, (arr2D)[2][0]);
        Assert.assertEquals(1, (arr2D)[2][1]);
    }

    @Test
    public void reverseMatrixTestWithThreeRowAndColumn() {
        int[][] arr2D = new int[][] { { 1, 2, 3}, { 4, 5, 6 }, { 7, 8, 9 }};
        matrix.reverseMatrix(arr2D);
        Assert.assertEquals(9, (arr2D)[0][0]);
        Assert.assertEquals(8, (arr2D)[0][1]);
        Assert.assertEquals(7, (arr2D)[0][2]);
        Assert.assertEquals(6, (arr2D)[1][0]);
        Assert.assertEquals(5, (arr2D)[1][1]);
        Assert.assertEquals(4, (arr2D)[1][2]);
        Assert.assertEquals(3, (arr2D)[2][0]);
        Assert.assertEquals(2, (arr2D)[2][1]);
        Assert.assertEquals(1, (arr2D)[2][2]);
    }

}
