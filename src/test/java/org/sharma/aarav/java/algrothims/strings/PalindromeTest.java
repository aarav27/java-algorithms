package org.sharma.aarav.java.algrothims.strings;

//4. Junit Test to find a String is Palindrome or not

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sharma.aarav.java.algorithms.strings.Palindrome;
import org.sharma.aarav.java.algorithms.strings.Reverse;

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

}
