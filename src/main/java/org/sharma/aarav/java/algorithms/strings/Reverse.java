package org.sharma.aarav.java.algorithms.strings;

public class Reverse {

    public static String reverse(String str) {
        if(str==null || str.length()<2) return str;
        char[] c = str.toCharArray();
        int len = str.length();
        for(int i = 0, j = len-1; i < len/2; i++, j--) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
        }
        return String.valueOf(c);
    }

}
