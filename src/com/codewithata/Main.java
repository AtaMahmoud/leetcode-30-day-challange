package com.codewithata;

import com.codewithata.weekthree.ProductOfArrayExceptSelf;
import com.codewithata.weekthree.ValidParenthesisString;

import java.util.stream.IntStream;


public class Main {

    public static void main(String[] args) {
        ValidParenthesisString validParenthesisString=new ValidParenthesisString();
        System.out.println(validParenthesisString.checkValidString("(*())(*)"));;
    }
}
