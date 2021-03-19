package org.sharma.aarav.java.algrothims.arrays;

//6. Junit to find a value in an 2D array n which each row and each column is sorted.
//7. Junit to get an array having elements of column c from a 2D array in the same order as they appear
//8. Junit to get an array having elements of row r from a 2D array in the same order as they appear

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

}
