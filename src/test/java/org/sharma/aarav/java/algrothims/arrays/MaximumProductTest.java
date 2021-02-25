package org.sharma.aarav.java.algrothims.arrays;

//9. Junit to test maximum product of three numbers in an array

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sharma.aarav.java.algorithms.arrays.MaximumProduct;

public class MaximumProductTest {

    private MaximumProduct maximumProduct;

    @Before
    public void setUp() throws Exception {
        maximumProduct = new MaximumProduct();
    }

    @Test
    public void getMaxOfTripletTestNull() {
        Assert.assertNull(maximumProduct.getMaxOfTriplet(null));
    }

    @Test
    public void getMaxOfTripletTestNullWithOneElement() {
        Assert.assertNull(maximumProduct.getMaxOfTriplet(new int[] {1}));
    }

    @Test
    public void getMaxOfTripletTestNullWithTwoElement() {
        Assert.assertNull(maximumProduct.getMaxOfTriplet(new int[] {1, 2}));
    }


    @Test
    public void getMaxOfTripletTestWithThreeElement() {
        Assert.assertEquals(Integer.valueOf(15), maximumProduct.getMaxOfTriplet((new int[] {3, 1, 5})));
    }

    @Test
    public void getMaxOfTripletTestWithFourElement() {
        Assert.assertEquals(Integer.valueOf(280), maximumProduct.getMaxOfTriplet((new int[] {7, 4, 0, 10})));
    }

    @Test
    public void getMaxOfTripletTestWithSixElement() {
        Assert.assertEquals(Integer.valueOf(140), maximumProduct.getMaxOfTriplet((new int[] {-1, -2, -10, 7, 4, 0})));
    }

    @Test
    public void getMaxOfTripletTestWithNineElement() {
        Assert.assertEquals(Integer.valueOf(500), maximumProduct.getMaxOfTriplet((new int[] {-5, 0, -2, -10, -3, 5, 10, 1, 2})));
    }

}
