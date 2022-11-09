// Ques type: Hard
// 1095. Find in Mountain Array
// Link - https://leetcode.com/problems/find-in-mountain-array/description/

package com.nitin;

public class FindInMountain {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 3, 2, 1};
        int target = 1;
        System.out.println(mountain(arr, target));
    }

    static int mountain(int[] arr, int target) {
        int start = 0, end = arr.length - 1, peak = 0;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = peak = mid;
            } else {
                start = mid + 1;
            }
        }

        // search in the left halve of the array using binary search
        start = 0;
        end = peak;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        // find in right halve of the array
        start = peak;
        end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}