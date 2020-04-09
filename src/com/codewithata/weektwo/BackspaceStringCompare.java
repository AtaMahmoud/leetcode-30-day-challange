package com.codewithata.weektwo;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class BackspaceStringCompare {
    public boolean backspaceCompareWithStacks(String S, String T) {
        S = removeBackSpaces(S);
        T = removeBackSpaces(T);
        System.out.println(S);
        System.out.println(T);
        return S.equals(T);
    }

    private String removeBackSpaces(String str) {
        Stack<Character> strChars = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '#') {
                if (!strChars.isEmpty())
                    strChars.pop();
            } else
                strChars.push(ch);
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!strChars.isEmpty())
            stringBuilder.append(strChars.pop());

        return stringBuilder.toString();
    }
}
