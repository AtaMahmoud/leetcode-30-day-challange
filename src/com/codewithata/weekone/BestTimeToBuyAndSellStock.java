package com.codewithata.weekone;

import java.util.HashSet;
import java.util.Set;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        for(int i=0; i<prices.length-1;i++)
            if(prices[i+1]>prices[i])
                maxProfit+=prices[i+1]-prices[i];

        return maxProfit;
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSet=new HashSet<>();
        for (int num:nums) {
            if(numsSet.contains(num))
                return true;
            numsSet.add(num);
        }

        return false;
    }
}
