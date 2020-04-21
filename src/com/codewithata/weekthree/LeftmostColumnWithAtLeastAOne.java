package com.codewithata.weekthree;

import java.util.ArrayList;
import java.util.List;

public class LeftmostColumnWithAtLeastAOne {
    interface BinaryMatrix {
        int get(int x, int y);

        List<Integer> dimensions();
    }

    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        List<Integer> dimensions = binaryMatrix.dimensions();
        int n = dimensions.get(0);
        int m = dimensions.get(1);

        if(n==0||m==0)
            return -1;

        int r=0;
        int c=m-1;
        int result=-1;
        while (r<n&&c>=0){
            if(binaryMatrix.get(r,c)==1){
                result=c;
                c--;
            }else
                r++;
        }

       return result;
    }
}
