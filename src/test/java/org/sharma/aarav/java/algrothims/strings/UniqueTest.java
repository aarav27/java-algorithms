package org.sharma.aarav.java.algrothims.strings;

//6.  Unit to test if a string has all unique characters.

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sharma.aarav.java.algorithms.strings.Unique;

public class UniqueTest {

    private Unique unique;

    @Before
    public void setUp() throws Exception {
        unique = new Unique();
    }

    @Test
    public void isUniqueNull() {
        Assert.assertEquals(false, unique.isAllUnique(null));
    }

    @Test
    public void isUniqueCharacter() {
        Assert.assertEquals(false, unique.isAllUnique("A"));
    }

    @Test
    public void isUniqueTrue() {
        Assert.assertEquals(true, unique.isAllUnique("Name"));
    }

    @Test
    public void isUniqueFalse() {
        Assert.assertEquals(false, unique.isAllUnique("Aarav"));
    }

    @Test
    public void isUniqueSentence() {
        Assert.assertEquals(false, unique.isAllUnique("My name is Aarav Sharma"));
    }

}
