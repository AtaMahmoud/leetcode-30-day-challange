package com.codewithata.weekone;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer>digitsSumSet=new HashSet<>();

        while (n!=1) {
           int digitsSum = sumDigitsSquare(n);

            if (digitsSumSet.contains(digitsSum))
                return false;

            n=digitsSum;
            digitsSumSet.add(digitsSum);
        }

        return true;
    }

    private int sumDigitsSquare(int number) {
       int digitsSum=0;
        while (number > 0) {
           digitsSum+=Math.pow(number % 10,2);
            number /= 10;
        }

        return digitsSum;
    }
}
