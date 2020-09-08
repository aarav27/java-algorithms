package org.sharma.aarav.java.algrothims.strings;

//5. Junit to test if two strings are anagrams or not.

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sharma.aarav.java.algorithms.strings.Anagram;

public class AnagramTest {

    private Anagram anagram;

    @Before
    public void setUp() throws Exception {
        anagram = new Anagram();
    }

    @Test
    public void isAnagramWithBothNull() {
        Assert.assertEquals(false, anagram.isAnagram(null, null));
    }

    @Test
    public void isAnagramWithFirstNull() {
        Assert.assertEquals(false, anagram.isAnagram(null, "listen"));
    }

    @Test
    public void isAnagramWithSecondNull() {
        Assert.assertEquals(false, anagram.isAnagram("listen", null));
    }

    @Test
    public void isAnagramFalse() {
        Assert.assertEquals(false, anagram.isAnagram("listen", "tennis"));
    }

    @Test
    public void isAnagramTrue() {
        Assert.assertEquals(true, anagram.isAnagram("listen", "silent"));
    }

}
