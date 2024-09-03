package com.nirupam.binary_search;

public class Order_AgnosticBS_2 {
    public static void main(String[] args) {
//        int[] arr = {-18, -12, -4, 3,5,88,99, 999};
        int[] arr = {888, 109, 107, 106, 105, 99, 95, 90, 77};
        int target = 99;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

//        find weather the array is sorted in ascending or descending order

        boolean isAcc = arr[start] < arr[end];
//         explaination of this line
//        boolean isAsc = true;
//        if (arr[start] < arr[end]) {
//            isAsc = true;
//        }else {
//            isAsc = false;
//        }

        while (start <= end) {
//            find the middle element
//            int mid = (start + end) / 2 ;  might be possible that (start + end )  exceed the range of integers in java

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAcc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                        if (target > arr[mid]) {
                            end = mid - 1;
                        } else  {
                            start = mid + 1;
                        }
                    }
                }
            return -1;

        }
    }
