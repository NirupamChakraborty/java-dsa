package com.nirupam;

import java.util.Arrays;

public class PassingINFunctions_array {
    public static void main(String[] args) {
        int[] nums = { 5,6,7,8,9};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static  void change(int[] arr){
        arr[0] = 99;
    }
}
