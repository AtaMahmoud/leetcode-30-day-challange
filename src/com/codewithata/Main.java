package com.codewithata;

import com.codewithata.weektwo.BackspaceStringCompare;
import com.codewithata.weektwo.MinStack;

public class Main {

    public static void main(String[] args) {
        MinStack minStack=new MinStack();
        minStack.push(2);
        minStack.push(0);
        minStack.push(3);
        minStack.push(0);

        System.out.println(minStack.getMin()); //0
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());

    }
}
