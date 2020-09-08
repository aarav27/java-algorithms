package org.sharma.aarav.java.algorithms.strings;

//6.  Implement an algorithm to determine if a string has all unique characters.

import java.util.HashMap;
import java.util.Map;

public class Unique {

    public boolean isAllUnique(String str) {
        if(str==null || str.length()<2) return false;
        Map<Character, Boolean> map = new HashMap<Character, Boolean>();
        char[] c = str.toCharArray();
        for(int i = 0; i < c.length; i++) {
            if(map.containsKey(c[i])) return false;
            map.put(c[i], true);
        }
        return true;
    }

}
