// //Ques type: Medium
// 852. Peak Index in a Mountain Array
// Link - https://leetcode.com/problems/peak-index-in-a-mountain-array/
package com.nitin;

public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 5, 3, 1};
        int ans = peakIndex(arr);
        System.out.println(ans);
    }

    static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
