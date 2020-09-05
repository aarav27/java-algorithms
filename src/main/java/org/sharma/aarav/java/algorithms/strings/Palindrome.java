package org.sharma.aarav.java.algorithms.strings;

//4. Find a String is Palindrome or not.

public class Palindrome {

    public boolean isPalindrome(String str) {
        if(str==null  || str.length() < 2) return false;
        int length = str.length();
        for(int i=0, j=length-1 ; i<=length/2; i++, j--) {
            if(str.charAt(i)!=str.charAt(j)) return false;
        }
        return true;
    }

}
