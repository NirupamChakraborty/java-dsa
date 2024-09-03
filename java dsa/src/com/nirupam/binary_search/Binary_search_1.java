package com.nirupam.binary_search;

public class Binary_search_1 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,55,38,37,-2,99,95,90,105};
        int target = 99;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }
//    return the index of the element
//    return -1 if the element does not exist
      static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1 ;

        while (start <= end){
//            find the middle element
//            int mid = (start + end) / 2 ;  might be possible that (start + end )  exceed the range of integers in java

            int mid = start + (end - start) / 2 ;

            if (target <arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else{
//                answer found;
                return mid;
            }
        }
        return -1;
      }

}
