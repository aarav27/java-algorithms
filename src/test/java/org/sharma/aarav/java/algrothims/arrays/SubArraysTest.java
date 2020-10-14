package org.sharma.aarav.java.algrothims.arrays;

//9. Junit to generate all sub arrays in an array having continuous index location.

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sharma.aarav.java.algorithms.arrays.SubArrays;

import java.util.Arrays;
import java.util.List;

public class SubArraysTest {
    private SubArrays subArrays;

    @Before
    public void setUp() throws Exception {
        subArrays = new SubArrays();
    }

    @Test
    public void generateTestNull() {
        Assert.assertNull(subArrays.generate(null));
    }

    @Test
    public void generateTestWithOneElement() {
        List results = subArrays.generate(new int[] {1});
        Assert.assertEquals(1, results.size());
        Assert.assertEquals(Arrays.toString(new int[]{1}), results.get(0).toString());
        //results.forEach(System.out::println);
    }

    @Test
    public void generateTestWithTwoElement() {
        List results = subArrays.generate(new int[] {1, 2});
        Assert.assertEquals(3, results.size());
        Assert.assertEquals(Arrays.toString(new int[]{1}), results.get(0).toString());
        Assert.assertEquals(Arrays.toString(new int[]{1, 2}), results.get(1).toString());
        Assert.assertEquals(Arrays.toString(new int[]{2}), results.get(2).toString());
        //results.forEach(System.out::println);
    }

    @Test
    public void generateTestWithThreeElement() {
        List results = subArrays.generate(new int[] {1, 3, 5});
        Assert.assertEquals(6, results.size());
        Assert.assertEquals(Arrays.toString(new int[]{1}), results.get(0).toString());
        Assert.assertEquals(Arrays.toString(new int[]{1, 3}), results.get(1).toString());
        Assert.assertEquals(Arrays.toString(new int[]{1, 3, 5}), results.get(2).toString());
        Assert.assertEquals(Arrays.toString(new int[]{3}), results.get(3).toString());
        Assert.assertEquals(Arrays.toString(new int[]{3, 5}), results.get(4).toString());
        Assert.assertEquals(Arrays.toString(new int[]{5}), results.get(5).toString());
        //results.forEach(System.out::println);
    }

    @Test
    public void generateTestWithFourElement() {
        List results = subArrays.generate(new int[] {2, 4, 6, 8});
        Assert.assertEquals(10, results.size());
        Assert.assertEquals(Arrays.toString(new int[]{2}), results.get(0).toString());
        Assert.assertEquals(Arrays.toString(new int[]{2, 4}), results.get(1).toString());
        Assert.assertEquals(Arrays.toString(new int[]{2, 4, 6}), results.get(2).toString());
        Assert.assertEquals(Arrays.toString(new int[]{2, 4, 6, 8}), results.get(3).toString());
        Assert.assertEquals(Arrays.toString(new int[]{4}), results.get(4).toString());
        Assert.assertEquals(Arrays.toString(new int[]{4, 6}), results.get(5).toString());
        Assert.assertEquals(Arrays.toString(new int[]{4, 6, 8}), results.get(6).toString());
        Assert.assertEquals(Arrays.toString(new int[]{6}), results.get(7).toString());
        Assert.assertEquals(Arrays.toString(new int[]{6, 8}), results.get(8).toString());
        Assert.assertEquals(Arrays.toString(new int[]{8}), results.get(9).toString());
        //results.forEach(System.out::println);
    }
}
