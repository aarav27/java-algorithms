package org.sharma.aarav.java.algrothims.arrays;

//10. Junit to search target integer value in a sorted rotated array and return index.

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sharma.aarav.java.algorithms.arrays.SortedRotated;

/**
 * @author Aarav Sharma
 */
public class SortedRotatedTest {

    private SortedRotated sortedRotated;

    @Before
    public void setUp() throws Exception {
        sortedRotated = new SortedRotated();
    }

    @Test
    public void searchTestNull() {
        Assert.assertNull(sortedRotated.search(null, 8));
    }

    @Test
    public void searchTestWithTwoElement() {
        Assert.assertEquals(Integer.valueOf(0), sortedRotated.search(new int[] {2, 1}, 2));
    }

    @Test
    public void searchTestWithtThreeElement() {
        Assert.assertEquals(Integer.valueOf(1), sortedRotated.search(new int[] {2, 1, 3}, 1));
    }

    @Test
    public void searchTestWithFourElement() {
        Assert.assertEquals(Integer.valueOf(2), sortedRotated.search(new int[] {2, 1, 3, 4}, 3));
    }

    @Test
    public void searchTestWithFiveElement() {
        Assert.assertEquals(Integer.valueOf(4), sortedRotated.search(new int[] {4, 5, 6, 7, 0}, 0));
    }

    @Test
    public void searchTestWithSixElement() {
        Assert.assertEquals(Integer.valueOf(3), sortedRotated.search(new int[] {4, 5, 6, 7, 0, 1}, 7));
    }

    @Test
    public void searchTestWithSevenElement() {
        Assert.assertEquals(Integer.valueOf(4), sortedRotated.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 0));
    }

}
