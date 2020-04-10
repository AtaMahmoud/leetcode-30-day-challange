package com.codewithata.weektwo;

import java.util.Stack;

public class MinStack {
    Stack<Integer> items;
    Stack<Integer> minItems;

    public MinStack() {
        items=new Stack<>();
        minItems=new Stack<>();
    }

    public void push(int x) {
        if(minItems.isEmpty()||x<=minItems.peek())
            minItems.push(x);

        items.push(x);
    }

    public void pop() {
        if(items.isEmpty())
            return;

        int top=items.pop();
        if(minItems.peek()==top)
            minItems.pop();
    }

    public int top() {
        if(items.isEmpty())
            return 0;
        return items.peek();
    }

    public int getMin() {
        if(minItems.isEmpty())
            return 0;
        return  minItems.peek();
    }
}
