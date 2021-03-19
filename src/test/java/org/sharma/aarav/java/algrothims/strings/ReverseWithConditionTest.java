package org.sharma.aarav.java.algrothims.strings;

//3. Junit Test to Reverse a String and Ignore Special Character

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sharma.aarav.java.algorithms.strings.ReverseWithCondition;

/**
 * @author Aarav Sharma
 */
public class ReverseWithConditionTest {

    private ReverseWithCondition reverseWithCondition;

    @Before
    public void setUp() throws Exception {
        reverseWithCondition = new ReverseWithCondition();
    }

    @Test
    public void reverseNull() {
        Assert.assertNull(reverseWithCondition.reverse(null));
    }

    @Test
    public void reverseSingleCharacter() {
        Assert.assertEquals("A", reverseWithCondition.reverse("A"));
    }

    @Test
    public void reverseSingleCharacterWithSpecialCharacter() {
        Assert.assertEquals("!A", reverseWithCondition.reverse("!A"));
    }

    @Test
    public void reverseWordWithEvenCharacterAndSpecialCharacter() {
        Assert.assertEquals("ema#N", reverseWithCondition.reverse("Nam#e"));
    }

    @Test
    public void reverseWordWithOddCharacterAndSpecialCharacter() {
        Assert.assertEquals("varaA@", reverseWithCondition.reverse("Aarav@"));
    }

    @Test
    public void reverseSentenceSpecialCharacters() {
        Assert.assertEquals("(  a$mrahS % varaA si * eman  y~M)", reverseWithCondition.reverse("(My $ name % is Aarav * Sharma ~ )"));
    }

}
