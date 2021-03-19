package org.sharma.aarav.java.algrothims.strings;

//8. Junit to test Urlify a string (Replace empty space from String with %20).

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sharma.aarav.java.algorithms.strings.Urlify;

/**
 * @author Aarav Sharma
 */
public class UrlifyTest {

    private Urlify urlify;

    @Before
    public void setUp() throws Exception {
        urlify = new Urlify();
    }

    @Test
    public void urlifyTestNull() {
        Assert.assertNull(urlify.urlifyAString(null));
    }

    @Test
    public void urlifyTestCharacter() {
        Assert.assertEquals("a", urlify.urlifyAString("a"));
    }

    @Test
    public void urlifyTestWord() {
        Assert.assertEquals("Aarav", urlify.urlifyAString("Aarav"));
    }

    @Test
    public void urlifyTestSentence() {
        Assert.assertEquals("I%20love%20Java", urlify.urlifyAString("I love Java"));
    }
}
