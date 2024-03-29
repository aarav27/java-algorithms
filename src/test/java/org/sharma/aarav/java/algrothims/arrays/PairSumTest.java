package org.sharma.aarav.java.algrothims.arrays;

//5. Junit Test to find pair of integers within an array whose sum is specified to a value and return their indexes.

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sharma.aarav.java.algorithms.arrays.PairSum;

import java.util.Arrays;

/**
 * @author Aarav Sharma
 */
public class PairSumTest {

    private PairSum pairSum;

    @Before
    public void setUp() throws Exception {
        pairSum = new PairSum();
    }

    @Test
    public void findIndexesTestNull() { Assert.assertNull(pairSum.findIndexes(null, 5)); }

    @Test
    public void findIndexesTesttWithOneElement() {
        Assert.assertEquals(Arrays.toString(new int[]{0, 0}), Arrays.toString(pairSum.findIndexes(new int[] {10},5)));
    }

    @Test
    public void findIndexesTesttWithTwoElementAndMatch() {
        Assert.assertEquals(Arrays.toString(new int[]{0, 1}), Arrays.toString(pairSum.findIndexes(new int[] {2, 4},6)));
    }

    @Test
    public void findIndexesTesttWithTwoElementAndNotMatch() {
        Assert.assertEquals(Arrays.toString(new int[]{0, 0}), Arrays.toString(pairSum.findIndexes(new int[] {2, 4},5)));
    }

    @Test
    public void findIndexesTesttWithThreeElementAndMatch() {
        Assert.assertEquals(Arrays.toString(new int[]{0, 2}), Arrays.toString(pairSum.findIndexes(new int[] {10, 7, -1},9)));
    }

    @Test
    public void findIndexesTesttWithThreeElementAndNotMatch() {
        Assert.assertEquals(Arrays.toString(new int[]{0, 0}), Arrays.toString(pairSum.findIndexes(new int[] {10, 7, -1},10)));
    }

    @Test
    public void findIndexesTesttWithFourElementAndMatch() {
        Assert.assertEquals(Arrays.toString(new int[]{2, 3}), Arrays.toString(pairSum.findIndexes(new int[] {4, 0, -3, 3},0)));
    }

    @Test
    public void findIndexesTesttWithFourElementAndNotMatch() {
        Assert.assertEquals(Arrays.toString(new int[]{0, 0}), Arrays.toString(pairSum.findIndexes(new int[] {4, 0, -3, 3},2)));
    }

    @Test
    public void findIndexesTesttWithFiveElementAndMatch() {
        Assert.assertEquals(Arrays.toString(new int[]{1, 4}), Arrays.toString(pairSum.findIndexes(new int[] {12, -9, 15, 3, -6},-15)));
    }

    @Test
    public void findIndexesTesttWithFiveElementAndNotMatch() {
        Assert.assertEquals(Arrays.toString(new int[]{0, 0}), Arrays.toString(pairSum.findIndexes(new int[] {12, -9, 15, 3, -6},16)));
    }

    @Test
    public void findIndexesAfterSortingTestNull() { Assert.assertNull(pairSum.findIndexesAfterSorting(null, 2)); }

    @Test
    public void findIndexesAfterSortingTesttWithOneElement() {
        Assert.assertEquals(Arrays.toString(new int[]{0, 0}), Arrays.toString(pairSum.findIndexesAfterSorting(new int[] {10},2)));
    }

    @Test
    public void findIndexesTesttAfterSortingWithTwoElementAndMatch() {
        Assert.assertEquals(Arrays.toString(new int[]{0, 1}), Arrays.toString(pairSum.findIndexesAfterSorting(new int[] {3, 2},5)));
    }

    @Test
    public void findIndexesAfterSortingTesttWithTwoElementAndNotMatch() {
        Assert.assertEquals(Arrays.toString(new int[]{0, 0}), Arrays.toString(pairSum.findIndexesAfterSorting(new int[] {4, 4},5)));
    }

    @Test
    public void findIndexesAfterSortingTesttWithThreeElementAndMatch() {
        Assert.assertEquals(Arrays.toString(new int[]{0, 2}), Arrays.toString(pairSum.findIndexesAfterSorting(new int[] {10, 7, -1},9)));
    }

    @Test
    public void findIndexesAfterSortingTesttWithThreeElementAndNotMatch() {
        Assert.assertEquals(Arrays.toString(new int[]{0, 0}), Arrays.toString(pairSum.findIndexesAfterSorting(new int[] {10, 7, -1},10)));
    }

    @Test
    public void findIndexesAfterSortingTesttWithFourElementAndMatch() {
        Assert.assertEquals(Arrays.toString(new int[]{0, 2}), Arrays.toString(pairSum.findIndexesAfterSorting(new int[] {4, 0, -3, 3},0)));
    }

    @Test
    public void findIndexesAfterSortingTesttWithFourElementAndNotMatch() {
        Assert.assertEquals(Arrays.toString(new int[]{0, 0}), Arrays.toString(pairSum.findIndexesAfterSorting(new int[] {4, 0, -3, 3},2)));
    }

    @Test
    public void findIndexesAfterSortingTesttWithFiveElementAndMatch() {
        Assert.assertEquals(Arrays.toString(new int[]{0, 1}), Arrays.toString(pairSum.findIndexesAfterSorting(new int[] {12, -9, 15, 3, -6},-15)));
    }

    @Test
    public void findIndexesAfterSortingTesttWithFiveElementAndNotMatch() {
        Assert.assertEquals(Arrays.toString(new int[]{0, 0}), Arrays.toString(pairSum.findIndexesAfterSorting(new int[] {12, -9, 15, 3, -6},16)));
    }

}
