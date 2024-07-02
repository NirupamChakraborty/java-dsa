package com.nirupam;

public class max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 26, 9, 18};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 0,1));
    }

    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
//    work on edge cases
    static int maxRange(int[] arr, int start, int end) {

        if (end > start) {
            return -1;
        }

        if (arr == null){
            return -1;
        }
        int maxVal = arr[start];
        for (int i = 0; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}