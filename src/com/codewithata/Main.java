package com.codewithata;

import com.codewithata.weektwo.ContiguousArray;
import com.codewithata.weektwo.PerformStringShifts;


public class Main {

    public static void main(String[] args) {
        int[][] shifts={{0,1},{1,2}};
        PerformStringShifts performStringShifts=new PerformStringShifts();
        System.out.println(performStringShifts.stringShift("abc",shifts));;

    }
}
