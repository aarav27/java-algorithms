package org.sharma.aarav.java.algrothims.strings;

//2. Junit Test to Reverse a String Recursively.

import org.junit.Assert;
import org.junit.Test;
import org.sharma.aarav.java.algorithms.strings.Recursive;

/**
 * @author Aarav Sharma
 */
public class RecursiveTest {

    @Test
    public void reverseNull() {
        Assert.assertNull(Recursive.reverse(null));
    }

    @Test
    public void reverseSingleCharacter() {
        Assert.assertEquals("A", Recursive.reverse("A"));
    }

    @Test
    public void reverseWordWithEvenCharacter() {
        Assert.assertEquals("emaN", Recursive.reverse("Name"));
    }

    @Test
    public void reverseWordWithOddCharacter() {
        Assert.assertEquals("varaA", Recursive.reverse("Aarav"));
    }

    @Test
    public void reverseSentence() {
        Assert.assertEquals("amrahS varaA si eman yM", Recursive.reverse("My name is Aarav Sharma"));
    }

}
