package org.sharma.aarav.java.algorithms.strings;

//2. Reverse a String Recursively.

public class Recursive {

    public static String reverse(String str) {
        if(str==null || str.length() <1) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }

}
