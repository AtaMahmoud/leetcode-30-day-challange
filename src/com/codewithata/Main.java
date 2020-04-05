package com.codewithata;

import com.codewithata.weekone.MaximumSubarray;
import com.codewithata.weekone.MoveZeroes;

public class Main {

    public static void main(String[] args) {
        int []arr={0,0,1,1,1,2,2,3,3,4};
        MoveZeroes moveZeroes=new MoveZeroes();
        System.out.println(moveZeroes.removeDuplicates(arr));

    }
}
