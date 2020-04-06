package com.codewithata.weekone;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList>anagramsGroups=new HashMap<>();

        for (String str:strs){
            char[] s=str.toCharArray();
            Arrays.sort(s);
            String key=String.copyValueOf(s);
            if(!anagramsGroups.containsKey(key))anagramsGroups.put(key,new ArrayList());
            anagramsGroups.get(key).add(str);
        }
        return  new ArrayList<>(anagramsGroups.values());
    }

    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;

        final int ENGLISH_ALPHABET = 26;
        int[] frequencies=new int[ENGLISH_ALPHABET];

        for (int i = 0; i < s.length(); i++)
            frequencies[s.charAt(i)-'a']++;

        for (int i = 0; i < t.length(); i++) {
            int index=t.charAt(i)-'a';
            if(frequencies[index]==0)
                return false;

            frequencies[index]--;
        }

        return true;
    }
}
