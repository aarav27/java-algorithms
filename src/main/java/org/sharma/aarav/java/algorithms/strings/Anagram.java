package org.sharma.aarav.java.algorithms.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Aarav Sharma
 */
public class Anagram {

    //5. Find if two strings are anagrams or not.
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

    //10. Given a String of array return group anagrams.
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();

        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for(String str: strs){
            char[] arr = new char[26];
            for(int i=0; i<str.length(); i++) {
                arr[str.charAt(i)-'a']++;
            }
            String ns = new String(arr);

            if(map.containsKey(ns)) {
                map.get(ns).add(str);
            } else {
                ArrayList<String> al = new ArrayList<String>();
                al.add(str);
                map.put(ns, al);
            }
        }
        result.addAll(map.values());
        return result;
    }

}
