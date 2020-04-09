package com.codewithata.weektwo;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class BackspaceStringCompare {
    public boolean backspaceCompareWithStacks(String S, String T) {
        return removeBackSpaces(S).equals(removeBackSpaces(T));
    }

    private String removeBackSpaces(String str) {
        Stack<Character> ans = new Stack();
        for (char c: str.toCharArray()) {
            if (c != '#')
                ans.push(c);
            else if (!ans.empty())
                ans.pop();
        }
        return String.valueOf(ans);
    }


    public boolean backspaceCompare(String S, String T) {
        int i = S.length() - 1;
        int j = T.length() - 1;
        while (i >= 0 || j >= 0) {
            i = backspace(S, i);
            j = backspace(T, j);
            if (i < 0 && j < 0) return true;
            if (i < 0 || j < 0 || S.charAt(i) != T.charAt(j)) return false;
            i--; j--;
        }
        return true;
    }

    private int backspace(String S, int i) { // back to the remaining character
        int skip = 0;
        while (i >= 0 && (skip > 0 || S.charAt(i) == '#')) {
            if (S.charAt(i) == '#') skip++;
            else skip--;
            i--;
        }
        return i;
    }
}
