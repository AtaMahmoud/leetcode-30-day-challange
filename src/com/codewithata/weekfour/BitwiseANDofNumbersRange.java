package com.codewithata.weekfour;

public class BitwiseANDofNumbersRange {
    public int rangeBitwiseAnd(int m, int n) {
        while (n > m)
            n = n & n - 1;

        return m & n;
    }
}
