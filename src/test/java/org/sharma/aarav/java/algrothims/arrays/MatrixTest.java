package org.sharma.aarav.java.algrothims.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sharma.aarav.java.algorithms.arrays.Matrix;

import java.util.Arrays;

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

}
