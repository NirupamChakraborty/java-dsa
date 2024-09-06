package com.nirupam.binary_search;

public class bs_ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,9,14,16,99};
        int target = 15;
        int ans = binarySearch_ceiling(arr, target);
        System.out.println(ans);

    }
    //    return the index of the smallest no >= target
//    return -1 if the element does not exist
    static int binarySearch_ceiling(int[] arr, int target){
        //but what if the target is greater than the greatest number in the array
        if (target > arr.length - 1) {
            return  -1;

        }
        int start = 0;
        int end = arr.length - 1 ;

        while (start <= end){
//            find the middle element
//            int mid = (start + end) / 2 ;  might be possible that (start + end )  exceed the range of integers in java

            int mid = start + (end - start) / 2 ;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else{
//                answer found;
                return mid;
            }
        }
        return start;
    }

}
