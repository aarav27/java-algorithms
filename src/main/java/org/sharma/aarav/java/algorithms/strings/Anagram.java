package org.sharma.aarav.java.algorithms.strings;

//5. Write a program to decide if two strings are anagrams or not.

public class Anagram {

    public boolean isAnagram(String s1, String s2) {

        if(s1==null || s2==null) return false;
        if(s1.length()!=s2.length()) return false;

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        java.util.Arrays.sort(c1);
        java.util.Arrays.sort(c2);

        for(int i = 0; i < c1.length; i++) {
            if(c1[i]!=c2[i]) return false;
        }
        return true;

    }

}
