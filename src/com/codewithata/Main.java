package com.codewithata;
import com.codewithata.weekthree.MinimumPathSum;

public class Main {

    public static void main(String[] args) {
        int [] [] gird={{1,3,1},{5,2,1},{4,2,1}};
        MinimumPathSum minimumPathSum=new MinimumPathSum();
        System.out.println(minimumPathSum.minPathSum(gird));;
    }
}
