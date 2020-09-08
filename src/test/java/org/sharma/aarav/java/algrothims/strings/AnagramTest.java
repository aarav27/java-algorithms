package org.sharma.aarav.java.algrothims.strings;

//5. Junit to test if two strings are anagrams or not.

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sharma.aarav.java.algorithms.strings.Anagram;

import java.util.List;

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
    public void isAnagramTestTrue() {
        Assert.assertEquals(true, anagram.isAnagram("listen", "silent"));
    }

    @Test
    public void groupAnagramsTestOne() {
        List<List<String>> list = anagram.groupAnagrams(new String[]{"listen", "silent"});
        assert(list.size()==1);
        Assert.assertEquals(true, list.stream().anyMatch(element -> element.contains("listen")));
        Assert.assertEquals(true, list.stream().anyMatch(element -> element.contains("silent")));
    }

    @Test
    public void groupAnagramsTestTwo() {
        List<List<String>> list = anagram.groupAnagrams(new String[]{"listen", "tennis", "silent"});
        assert(list.size()==2);
        Assert.assertEquals(true, list.stream().anyMatch(element -> element.contains("listen")));
        Assert.assertEquals(true, list.stream().anyMatch(element -> element.contains("tennis")));
        Assert.assertEquals(true, list.stream().anyMatch(element -> element.contains("silent")));
    }

    @Test
    public void groupAnagramsTestThree() {
        List<List<String>> list = anagram.groupAnagrams(new String[]{"listen", "tennis", "ten"});
        assert(list.size()==3);
        Assert.assertEquals(true, list.stream().anyMatch(element -> element.contains("listen")));
        Assert.assertEquals(true, list.stream().anyMatch(element -> element.contains("tennis")));
        Assert.assertEquals(true, list.stream().anyMatch(element -> element.contains("ten")));
        Assert.assertEquals(false, list.stream().anyMatch(element -> element.contains("te")));
    }

}
