package org.sharma.aarav.java.algorithms.strings;

//7. Remove the duplicate characters in a string

/**
 * @author Aarav Sharma
 */
public class Duplicate {

    // Remove the duplicate characters in a string without using an additional buffer.
    /* Processing:
        abcdeaf
        a
         bcdeaf*/
    public String removeDuplicates(String str) {
        if(str==null || str.length()<2) return str;

        char[] c = str.toCharArray();
        int length = c.length;

        int tail = 1;
        for(int i=1; i<length ; i++) {
            int j;
            for(j=0; j<tail; j++) {
                if(c[i]==c[j]) break;
            }
            if(tail == j) {
                c[tail] = c[i];
                tail++;
            }
        }
        return String.valueOf(c).substring(0, tail);
    }

}
