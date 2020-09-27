package org.sharma.aarav.java.algrothims.arrays;

//2. Unit to get a Product Array such that prod[i] is equal to the product of all the elements of arr[] except arr[i]

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sharma.aarav.java.algorithms.arrays.Product;

import java.util.Arrays;

public class ProductTest {

    private Product product;

    @Before
    public void setUp() throws Exception {
        product = new Product();
    }

    @Test
    public void getProductOfArrayTestNull() {
        Assert.assertNull(product.getProductOfArray(null));
    }

    @Test
    public void getProductOfArrayTestWithOneElement() {
        Assert.assertEquals(Arrays.toString(new int[]{0}), Arrays.toString(product.getProductOfArray((new int[] {1}))));
    }

    @Test
    public void getProductOfArrayTestWithTwoElement() {
        Assert.assertEquals(Arrays.toString(new int[]{2,1}), Arrays.toString(product.getProductOfArray((new int[] {1,2}))));
    }

    @Test
    public void getProductOfArrayTestWithThreeElement() {
        Assert.assertEquals(Arrays.toString(new int[]{15, 50, 30}), Arrays.toString(product.getProductOfArray((new int[] {10, 3, 5}))));
    }

    @Test
    public void getProductOfArrayTestWithFourElement() {
        Assert.assertEquals(Arrays.toString(new int[]{90, 300, 180, 150}), Arrays.toString(product.getProductOfArray((new int[] {10, 3, 5, 6}))));
    }

    @Test
    public void getProductOfArrayTestWithFiveElement() {
        Assert.assertEquals(Arrays.toString(new int[]{180, 600, 360, 300, 900}), Arrays.toString(product.getProductOfArray((new int[] {10, 3, 5, 6, 2}))));
    }

}
