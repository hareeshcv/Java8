package com.corejava;


import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; //incase k>n
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }
    private void reverse(int[] nums, int start, int end){
        while(start <end){
            int temp=nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
    public static void main(String [] args){
        RotateArray ra = new RotateArray();
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println("original Array" + Arrays.toString(nums));
        ra.rotate(nums,k);
        System.out.println("rotated array" + Arrays.toString(nums));
    }
    }

