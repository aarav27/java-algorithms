package org.sharma.aarav.java.algrothims.strings;

//7. Unit to remove the duplicate characters in a string

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sharma.aarav.java.algorithms.strings.Duplicate;
import org.sharma.aarav.java.algorithms.strings.Reverse;

public class DuplicateTest {

    private Duplicate duplicate;

    @Before
    public void setUp() throws Exception {
        duplicate = new Duplicate();
    }

    @Test
    public void removeDuplicatesTestNull() {
        Assert.assertNull(duplicate.removeDuplicates(null));
    }

    @Test
    public void removeDuplicatesTestWord1() {
        Assert.assertEquals("abcdef", duplicate.removeDuplicates("abcdeaf"));
    }

    @Test
    public void removeDuplicatesTestWord2() {
        Assert.assertEquals("Aarv", duplicate.removeDuplicates("Aarav"));
    }

    @Test
    public void removeDuplicatesSentence() {
        Assert.assertEquals("My nameisArv", duplicate.removeDuplicates("My name is Aarav"));
    }

}
