package org.sharma.aarav.java.algorithms.strings;

//3. Reverse a String and Ignore Special Character

public class ReverseWithCondition {

    public String reverse(String str) {
        if(str==null || str.length()<2) return str;
        char[] s = str.toCharArray();
        int length = s.length;
        int i = 0, j = length-1;

        while(i < j) {
            if(!isSpecialCharacter(s[i]) && !isSpecialCharacter(s[j])) {
                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;
                i++;
                j--;
            } else if(isSpecialCharacter(s[i])) {
                i++;
            } else {
                j--;
            }
        }
        return String.valueOf(s);
    }

    private boolean isSpecialCharacter(char c) {
        switch(c) {
            case '~' :
            case '!' :
            case '@' :
            case '#' :
            case '$' :
            case '%' :
            case '^' :
            case '&' :
            case '*' :
            case '(' :
            case ')' :
                return true;
        }
        return false;
    }
}
