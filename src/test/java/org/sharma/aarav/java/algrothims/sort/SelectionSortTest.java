package org.sharma.aarav.java.algrothims.sort;

//2. Junit to test Bubble Sort for given array of A with n elements A[1], A[2], ....., A[N].

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sharma.aarav.java.algorithms.sort.SelectionSort;

import java.util.Arrays;

/**
 * @author Aarav Sharma
 */
public class SelectionSortTest {

    private SelectionSort selectionSort;

    @Before
    public void setUp() throws Exception {
        selectionSort = new SelectionSort();
    }

    @Test
    public void sortTestNull() {
        Assert.assertNull(selectionSort.sort(null));
    }

    @Test
    public void sortTestWithEmptyArray() {
        Assert.assertEquals(Arrays.toString(new int[]{}), Arrays.toString(selectionSort.sort(new int[]{})));
    }

    @Test
    public void sortTestWithOnelement() {
        Assert.assertEquals(Arrays.toString(new int[]{80}), Arrays.toString(selectionSort.sort(new int[]{ 80 })));
    }

    @Test
    public void sortTestWithThreeElements() {
        Assert.assertEquals(Arrays.toString(new int[]{10, 20, 30}), Arrays.toString(selectionSort.sort(new int[]{30, 20, 10})));
    }

    @Test
    public void sortTestWithSixElements() {
        Assert.assertEquals(Arrays.toString(new int[]{10, 20, 30, 40, 50, 60 }), Arrays.toString(selectionSort.sort(new int[]{30, 20, 10, 50, 60, 40})));
    }

    @Test
    public void sortTestWithNinelements() {
        Assert.assertEquals(Arrays.toString(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90}), Arrays.toString(selectionSort.sort(new int[]{ 80, 40, 90, 60, 50, 70, 30, 20, 10 })));
    }

}
