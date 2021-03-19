package org.sharma.aarav.java.algrothims.strings;

//4. Junit Test to find a String is Palindrome or not
//9. Junit Test to get case insensitive Palindrome words from a sentence

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sharma.aarav.java.algorithms.strings.Palindrome;

import java.util.List;

/**
 * @author Aarav Sharma
 */
public class PalindromeTest {

    private Palindrome palindrome;

    @Before
    public void setUp() throws Exception {
        palindrome = new Palindrome();
    }

    @Test
    public void isPalindromeWithNull() {
        Assert.assertEquals(false, palindrome.isPalindrome(null));
    }

    @Test
    public void isPalindromeWithSingleCharacter() {
        Assert.assertEquals(false, palindrome.isPalindrome("A"));
    }

    @Test
    public void isPalindromeEvenCharacterFalse() {
        Assert.assertEquals(false, palindrome.isPalindrome("AT"));
    }

    @Test
    public void isPalindromeEvenCharacterTrue() {
        Assert.assertEquals(true, palindrome.isPalindrome("NOON"));
    }

    @Test
    public void isPalindromeOddCharacterFalse() {
        Assert.assertEquals(false, palindrome.isPalindrome("CHECK"));
    }

    @Test
    public void isPalindromeOddCharacterTrue() {
        Assert.assertEquals(true, palindrome.isPalindrome("CIVIC"));
    }

    @Test
    public void getPalindromeWordsIgnoreCaseInSentenceWithNull() {
        List<String> result  = palindrome.getPalindromeWordsIgnoreCaseInSentence(null);
        Assert.assertNull(result);
    }

    @Test
    public void getPalindromeWordsIgnoreCaseInSentenceZero() {
        List<String> result  = palindrome.getPalindromeWordsIgnoreCaseInSentence("My name is Aarav Sharma.");
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void getPalindromeWordsIgnoreCaseInSentenceOne() {
        List<String> result  = palindrome.getPalindromeWordsIgnoreCaseInSentence("Please refer to your Java book.");
        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals("refer", result.get(0));
    }

    @Test
    public void getPalindromeWordsIgnoreCaseInSentenceTwo() {
        List<String> result  = palindrome.getPalindromeWordsIgnoreCaseInSentence("I drove my Honda Civic to catch flight at noon time.");
        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.size());
        Assert.assertEquals("Civic", result.get(0));
        Assert.assertEquals("noon", result.get(1));
    }

    @Test
    public void getPalindromeWordsIgnoreCaseInSentenceThree() {
        List<String> result  = palindrome.getPalindromeWordsIgnoreCaseInSentence("I book flight though Kayak then drove my Honda Civic to catch flight at noon time.");
        Assert.assertNotNull(result);
        Assert.assertEquals(3, result.size());
        Assert.assertEquals("Kayak", result.get(0));
        Assert.assertEquals("Civic", result.get(1));
        Assert.assertEquals("noon", result.get(2));
    }

}
