package org.sharma.aarav.java.algrothims.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sharma.aarav.java.algorithms.arrays.Inversion;

public class InversionTest {

    private Inversion inversion;

    @Before
    public void setUp() throws Exception {
        inversion = new Inversion();
    }

    @Test
    public void getInversionTestNull() {
        Assert.assertEquals(0, inversion.getInversion(null));
    }

    @Test
    public void getInversionTestZero() {
        Assert.assertEquals(0, inversion.getInversion((new int[] {0, 1, 2, 3, 4, 5})));
    }

    @Test
    public void getInversionTestOne() {
        Assert.assertEquals(1, inversion.getInversion((new int[] {0, 1, 3, 2, 4, 5})));
    }

    @Test
    public void getInversionTestTwo() {
        Assert.assertEquals(2, inversion.getInversion((new int[] {1, 0, 3, 2, 4, 5})));
    }

    @Test
    public void getInversionTestThree() {
        Assert.assertEquals(3, inversion.getInversion((new int[] {1, 0, 3, 2, 5, 4})));
    }

    @Test
    public void getInversionTestFour() {
        Assert.assertEquals(4, inversion.getInversion((new int[] {1, 0, 4, 3, 2, 5})));
    }

    @Test
    public void getInversionTestFive() {
        Assert.assertEquals(5, inversion.getInversion((new int[] {0, 1, 5, 4, 2, 3})));
    }

}
