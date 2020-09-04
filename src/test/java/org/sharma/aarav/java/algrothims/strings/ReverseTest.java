package org.sharma.aarav.java.algrothims.strings;

import org.junit.Assert;
import org.junit.Test;
import org.sharma.aarav.java.algorithms.strings.Reverse;

//1. Junit Test to Reverse a String

public class ReverseTest {

    @Test
    public void reverseNull() {
        Assert.assertNull(Reverse.reverse(null));
    }

    @Test
    public void reverseSingleCharacter() {
        Assert.assertEquals("A", Reverse.reverse("A"));
    }

    @Test
    public void reverseWordWithEvenCharacter() {
        Assert.assertEquals("emaN", Reverse.reverse("Name"));
    }

    @Test
    public void reverseWordWithOddCharacter() {
        Assert.assertEquals("varaA", Reverse.reverse("Aarav"));
    }

    @Test
    public void reverseSentence() {
        Assert.assertEquals("amrahS varaA si eman yM", Reverse.reverse("My name is Aarav Sharma"));
    }

}
