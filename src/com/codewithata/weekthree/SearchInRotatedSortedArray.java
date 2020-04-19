package com.codewithata.weekthree;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        return binarySearch(nums,0,nums.length-1,target);
    }

    private int binarySearch(int[]nums,int start,int end,int target){
        if(start>end)
            return -1;

        int mid=(start+end)/2;

        if(nums[mid]==target)
            return mid;

        if(nums[start]<=nums[mid]){
            if(target>=nums[start]&&target<=nums[mid])
                return binarySearch(nums,start,mid-1,target);

            return binarySearch(nums,mid+1,end,target);
        }

        if (target >= nums[mid] && target <= nums[end])
            return binarySearch(nums, mid+1, end, target);

        return binarySearch(nums, start, mid-1, target);
    }
}
