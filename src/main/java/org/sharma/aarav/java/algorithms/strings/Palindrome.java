package org.sharma.aarav.java.algorithms.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aarav Sharma
 */
public class Palindrome {

    //4. Find a String is Palindrome or not.
    public boolean isPalindrome(String str) {
        if(str==null  || str.length() < 2) return false;
        int length = str.length();
        for(int i=0, j=length-1 ; i<=length/2; i++, j--) {
            if(str.charAt(i)!=str.charAt(j)) return false;
        }
        return true;
    }

    //9. Get case insensitive Palindrome words from a sentence.
    public List<String> getPalindromeWordsIgnoreCaseInSentence(String input) {
        if (input == null) return null;

        boolean endsWithPeriod = input.endsWith(".");
        input = endsWithPeriod ? input.substring(0, input.length() - 1) : input;

        String[] words = input.split(" ");
        List<String> list = new ArrayList<>();
        for (String word : words) {
            if (isPalindromeIgnoreCase(word)) {
                list.add(word);
            }
        }
        return list;
    }

    private boolean isPalindromeIgnoreCase(String str) {
        if(str==null  || str.length() < 2) return false;
        int length = str.length();
        for(int i=0, j=length-1 ; i<=length/2; i++, j--) {
            if(Character.toLowerCase(str.charAt(i))!=Character.toLowerCase(str.charAt(j))) return false;
        }
        return true;
    }

}
