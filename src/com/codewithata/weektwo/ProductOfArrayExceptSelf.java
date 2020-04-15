package com.codewithata.weektwo;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
      int [] left=new int[nums.length];
      left[0]=1;
      for (int i = 1; i < left.length; i++)
          left[i]=nums[i-1]*left[i-1];

      int right=1;
      int [] result=new int[nums.length];
        for (int i = result.length-1; i >=0 ; i--) {
            result[i]=right*left[i];
            right*=nums[i];
        }
      return result;
    }
}
