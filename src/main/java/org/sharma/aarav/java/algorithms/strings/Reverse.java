package org.sharma.aarav.java.algorithms.strings;

/**
 * @author Aarav Sharma
 */
public class Reverse {

    //1. Reverse a String
    public String reverse(String str) {
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

    // 11. Reverse the words in a sentence.
    public String reverseWordsInSentence(String input) {
        if(input==null || input.split(" ").length <2) return input;

        boolean endsWithPeriod = input.endsWith(".");
        input = endsWithPeriod ? input.substring(0, input.length()-1) : input;

        char[] charArray = input.toCharArray();
        int charArrayLength = charArray.length;

        int i = 0;
        for(int j = 0; j < charArray.length; j++){
            if(charArray[j]==' '){
                reverse(charArray, i, j-1);
                i = j+1;
            }
        }
        reverse(charArray, i, charArrayLength-1);
        reverse(charArray, 0, charArrayLength-1);

        return endsWithPeriod ? String.valueOf(charArray).concat(".") : String.valueOf(charArray);
    }

    private void reverse(char[] charArray, int low, int high) {
        for(int i=low, j= high; i < j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
    }

}
