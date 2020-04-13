package com.codewithata.weektwo;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        int max = 0;
        Map<Integer, Integer> sum = new HashMap<>();
        int num = 0;
        sum.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                num--;
            else
                num++;

            if (sum.containsKey(num))
                max = Math.max(max, i - sum.get(num));
            else
                sum.put(num, i);
        }

        return max;
    }
}
