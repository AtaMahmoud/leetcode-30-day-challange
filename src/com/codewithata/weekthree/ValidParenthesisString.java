package com.codewithata.weekthree;

import java.util.Stack;

public class ValidParenthesisString {
    // Time : O(N) / Space O(N)
    public boolean checkValidString(String s) {
        if(s==null||s.isEmpty())
            return true;

        Stack<Integer> parenthesisPosition=new Stack<>();
        Stack<Integer> startsPosition=new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch==')'&&parenthesisPosition.isEmpty()&&startsPosition.isEmpty())
                return false;

            if(ch=='(')
                parenthesisPosition.push(i);
            else if(ch=='*')
                startsPosition.push(i);
            else {
                if(parenthesisPosition.isEmpty()&&!startsPosition.isEmpty())
                    startsPosition.pop();
                else if(!parenthesisPosition.isEmpty())
                    parenthesisPosition.pop();
                else
                    return false;
            }
        }

        while (!parenthesisPosition.isEmpty()){
            if(startsPosition.isEmpty())return false;

            if(parenthesisPosition.peek()>startsPosition.peek())
                return false;

            parenthesisPosition.pop();
            startsPosition.pop();
        }

        return true;
    }
    // Time : O(N) / Space O(1)
    public boolean checkValidStringOptimized(String s) {
        int lo = 0, hi = 0;
        for (char c: s.toCharArray()) {
            lo += c == '(' ? 1 : -1;
            hi += c != ')' ? 1 : -1;
            if (hi < 0) break;
            lo = Math.max(lo, 0);
        }
        return lo == 0;
    }
}
