package com.codewithata.weekone;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int nonZerosPointer=0;
        for (int i = 0; i < nums.length; i++)
            if(nums[i]!=0)
                nums[nonZerosPointer++]=nums[i];

        for (int i = nonZerosPointer; i < nums.length; i++)
            nums[i]=0;
    }

    public int removeDuplicates(int[] nums) {
        int lastUniqueNumberIndex=1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[i-1])
                nums[lastUniqueNumberIndex++]=nums[i];
        }
        return lastUniqueNumberIndex;
    }


}
