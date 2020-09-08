package org.sharma.aarav.java.algrothims.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sharma.aarav.java.algorithms.strings.Reverse;

//1. Junit Test to Reverse a String
//11. Junit Test to reverse words in a sentence.

public class ReverseTest {

    private Reverse reverse;

    @Before
    public void setUp() throws Exception {
        reverse = new Reverse();
    }

    @Test
    public void reverseWithNull() {
        Assert.assertNull(reverse.reverse(null));
    }

    @Test
    public void reverseWithSingleCharacter() {
        Assert.assertEquals("A", reverse.reverse("A"));
    }

    @Test
    public void reverseWordWithEvenCharacter() {
        Assert.assertEquals("emaN", reverse.reverse("Name"));
    }

    @Test
    public void reverseWordWithOddCharacter() {
        Assert.assertEquals("varaA", reverse.reverse("Aarav"));
    }

    @Test
    public void reverseSentence() {
        Assert.assertEquals("amrahS varaA si eman yM", reverse.reverse("My name is Aarav Sharma"));
    }

    @Test
    public void reverseWordsInSentenceWithNull() {
        Assert.assertNull(reverse.reverseWordsInSentence(null));
    }

    @Test
    public void reverseWordsInSentenceWithSingleWord() {
        Assert.assertEquals("really", reverse.reverseWordsInSentence("really"));
    }

    @Test
    public void reverseWordsInSentence() {
        Assert.assertEquals("fast REALLY runs dog The.", reverse.reverseWordsInSentence("The dog runs REALLY fast."));
    }
}
