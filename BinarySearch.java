// //Ques type: Easy
// 704. Binary Search
// Link - https://leetcode.com/problems/binary-search/description/
package com.nitin;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-22, -12, -10, -4, 0, 2, 4, 7, 10, 15, 32, 44};
        int target = 10;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
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
        return -1;
    }
}
