package org.sharma.aarav.java.algrothims.arrays;

//3. Unit to rotate an array of size shifts each of the array's elements

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sharma.aarav.java.algorithms.arrays.Rotate;

import java.util.Arrays;

public class RotateTest {

    private Rotate rotate;

    @Before
    public void setUp() throws Exception {
        rotate = new Rotate();
    }

    @Test
    public void getLeftRotatedArrayTestNull() {
        Assert.assertNull(rotate.getLeftRotatedArray(null, 5));
    }

    @Test
    public void getLeftRotatedArrayTestWithOneElement() {
        Assert.assertEquals(Arrays.toString(new int[]{2}), Arrays.toString(rotate.getLeftRotatedArray((new int[] {2}), 5)));
    }

    @Test
    public void getLeftRotatedArrayTestWithZeroRotation() {
        Assert.assertEquals(Arrays.toString(new int[]{1, 2, 3}), Arrays.toString(rotate.getLeftRotatedArray((new int[] {1, 2, 3}), 0)));
    }

    @Test
    public void getLeftRotatedArrayTestWithThreeElementsAndOneRotation() {
        Assert.assertEquals(Arrays.toString(new int[]{2, 3, 1}), Arrays.toString(rotate.getLeftRotatedArray((new int[] {1, 2, 3}), 1)));
    }

    @Test
    public void getLeftRotatedArrayTestWithFourElementsAndTwoRotation() {
        Assert.assertEquals(Arrays.toString(new int[]{3, 4, 1, 2}), Arrays.toString(rotate.getLeftRotatedArray((new int[] {1, 2, 3, 4}), 2)));
    }

    @Test
    public void getLeftRotatedArrayTestWithFourElementsAndThreeRotation() {
        Assert.assertEquals(Arrays.toString(new int[]{4, 1, 2, 3}), Arrays.toString(rotate.getLeftRotatedArray((new int[] {1, 2, 3, 4}), 3)));
    }

    @Test
    public void getLeftRotatedArrayTestWithFiveElementsAndFourRotation() {
        Assert.assertEquals(Arrays.toString(new int[]{5, 1, 2, 3, 4}), Arrays.toString(rotate.getLeftRotatedArray((new int[] {1, 2, 3, 4, 5}), 4)));
    }

    @Test
    public void getLeftRotatedArrayTestWithFiveElementsAndFiveRotation() {
        Assert.assertEquals(Arrays.toString(new int[]{1, 2, 3, 4, 5}), Arrays.toString(rotate.getLeftRotatedArray((new int[] {1, 2, 3, 4, 5}), 5)));
    }

    @Test
    public void getLeftRotatedArrayTestWithFiveElementsAndSixRotation() {
        Assert.assertEquals(Arrays.toString(new int[]{2, 3, 4, 5, 1}), Arrays.toString(rotate.getLeftRotatedArray((new int[] {1, 2, 3, 4, 5}), 6)));
    }

    @Test
    public void getLeftRotatedArrayTestWithFiveElementsAndSevenRotation() {
        Assert.assertEquals(Arrays.toString(new int[]{3, 4, 5, 1, 2}), Arrays.toString(rotate.getLeftRotatedArray((new int[] {1, 2, 3, 4, 5}), 7)));
    }

    @Test
    public void getLeftRotatedArrayTestWithFiveElementsAndEightRotation() {
        Assert.assertEquals(Arrays.toString(new int[]{4, 5, 1, 2, 3}), Arrays.toString(rotate.getLeftRotatedArray((new int[] {1, 2, 3, 4, 5}), 8)));
    }

    @Test
    public void getLeftRotatedArrayTestWithFiveElementsAndNineRotation() {
        Assert.assertEquals(Arrays.toString(new int[]{5, 1, 2, 3, 4}), Arrays.toString(rotate.getLeftRotatedArray((new int[] {1, 2, 3, 4, 5}), 9)));
    }

    @Test
    public void getLeftRotatedArrayTestWithFiveElementsAndTenRotation() {
        Assert.assertEquals(Arrays.toString(new int[]{1, 2, 3, 4, 5}), Arrays.toString(rotate.getLeftRotatedArray((new int[] {1, 2, 3, 4, 5}), 10)));
    }

}
