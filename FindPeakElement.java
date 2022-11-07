// Ques type: Medium
// 162. Find Peak Element
// Link - https://leetcode.com/problems/find-peak-element/

package com.nitin;

public class ElementInPeak {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 5, 3, 1};
        int ans = peak(arr);
        System.out.println(ans);
    }

    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        // if you wanna return the element at the peak
        return start;

        // if you wanna return the peak
        // return arr[start];
    }
}
