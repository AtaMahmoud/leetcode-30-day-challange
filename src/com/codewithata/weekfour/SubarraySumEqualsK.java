package com.codewithata.weekfour;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int subArraysNumber=0;
        int sum=0;
        HashMap<Integer,Integer> sumFrequencies=new HashMap<>();
        sumFrequencies.put(0,1);
        for (int i = 0; i < nums.length; i++) {
          sum+=nums[i];
          if(sumFrequencies.containsKey(sum-k))
              subArraysNumber+=sumFrequencies.get(sum-k);
          sumFrequencies.put(sum,sumFrequencies.getOrDefault(sum,0)+1);
        }
        return  subArraysNumber;
    }
}
