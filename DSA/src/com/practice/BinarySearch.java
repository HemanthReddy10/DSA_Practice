package com.practice;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {12, 23, 45, 55, 66, 78, 88};
        int target = 12;
        System.out.println(binarysearch(nums, target));
    }
        static int binarysearch(int[] nums,int target){
            int start=0;
            int end = nums.length-1;

            while(start<=end){
                int mid=start+(end-start)/2;
                if(target>nums[mid]){
                    start=mid+1;

                }
                else if(target<nums[mid]){
                    end=mid-1;
                }
                else{
                    return mid;
                }
            }


           return -1;
    }
}
