package com.codewithata;

import com.codewithata.weekone.CountingElements;

public class Main {

    public static void main(String[] args) {
        int []arr={0,0,1,1,1,2,2,3,3,4};
        CountingElements countingElements=new CountingElements();
        System.out.println(countingElements.countElements(arr));
    }
}
