package com.practice;

public class LinearSearch {

    public static void main(String[] args) {
        int []nums={12,23,4,55,66,78,88};
        int target=12;
        System.out.println(linearsearch(nums,target));

    }

    static int linearsearch(int arr[],int target){
        if(arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element=arr[index];
            if(element==target){
                return index;
            }

        }
    return -1;}
}
