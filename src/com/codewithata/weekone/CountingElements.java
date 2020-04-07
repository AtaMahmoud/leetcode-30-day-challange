package com.codewithata.weekone;

import java.util.HashSet;
import java.util.Set;

public class CountingElements {
    public int countElements(int[] arr) {
        Set<Integer> elements=new HashSet<>();
        for (int element:arr)
            elements.add(element);

        int count=0;
        for (int element:elements)
            if(elements.contains(element+1))
                count++;

        return count;
    }
}
