package org.sharma.aarav.java.algrothims.arrays;

//4. Junit to Given an array of integers (both positive and negative).
// Find the continuous sequence with the largest/maximum sum.
// Return the sum.

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sharma.aarav.java.algorithms.arrays.LargestSum;

import java.util.Arrays;

public class LargestSumTest {

    private LargestSum largestSum;

    @Before
    public void setUp() throws Exception {
        largestSum = new LargestSum();
    }

    @Test
    public void getMaximumContinousSequenceSumTestNull() {
        Assert.assertEquals(-1, largestSum.getMaximumContinousSequenceSum(null));
    }

    @Test
    public void getMaximumContinousSequenceSumTestWithOneElement() {
        Assert.assertEquals(10, largestSum.getMaximumContinousSequenceSum((new int[] {10})));
    }

    @Test
    public void getMaximumContinousSequenceSumTestWithTwoElement() {
        Assert.assertEquals(0, largestSum.getMaximumContinousSequenceSum((new int[] {-2, -3})));
    }

    @Test
    public void getMaximumContinousSequenceSumTestWithThreeElement() {
        Assert.assertEquals(4, largestSum.getMaximumContinousSequenceSum((new int[] {-2, -3, 4})));
    }

    @Test
    public void getMaximumContinousSequenceSumTestWithFourElement() {
        Assert.assertEquals(4, largestSum.getMaximumContinousSequenceSum((new int[] {-2, -3, 4, -1})));
    }

    @Test
    public void getMaximumContinousSequenceSumTestWithFiveElement() {
        Assert.assertEquals(4, largestSum.getMaximumContinousSequenceSum((new int[] {-2, -3, 4, -1, -2})));
    }

    @Test
    public void getMaximumContinousSequenceSumTestWithSixElement() {
        Assert.assertEquals(4, largestSum.getMaximumContinousSequenceSum((new int[] {-2, -3, 4, -1, -2, 1})));
    }

    @Test
    public void getMaximumContinousSequenceSumTestWithSevenElement() {
        Assert.assertEquals(7, largestSum.getMaximumContinousSequenceSum((new int[] {-2, -3, 4, -1, -2, 1, 5})));
    }

    @Test
    public void getMaximumContinousSequenceSumTestWithEightElement() {
        Assert.assertEquals(7, largestSum.getMaximumContinousSequenceSum((new int[] {-2, -3, 4, -1, -2, 1, 5, -3})));
    }

}
