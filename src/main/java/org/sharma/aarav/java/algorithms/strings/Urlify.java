package org.sharma.aarav.java.algorithms.strings;


//8. Urlify a string. Replace empty space from String with %20. (URLify)

public class Urlify {

    public String urlifyAString(String str) {
        if(str==null || str.length()<2) return str;

        int length, newLength, spaces=0;
        char[] c = str.toCharArray();
        length = c.length;
        for(int i = 0; i < length; i++) {
            if(c[i]==' ') spaces++;
        }

        newLength = length + spaces*2;
        char[] nc = new char[newLength];

        for(int j = length-1; j >=0; j--) {
            if(c[j]==' ') {
                nc[newLength-1] = '0';
                nc[newLength-2] = '2';
                nc[newLength-3] = '%';
                newLength = newLength - 3;
            } else {
                nc[newLength-1] = c[j];
                newLength--;
            }
        }
        return String.valueOf(nc);
    }

}
