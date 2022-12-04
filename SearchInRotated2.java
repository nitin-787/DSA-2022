// Ques type : Medium
// 81. Search in Rotated Sorted Array II
// Link : https://leetcode.com/problems/search-in-rotated-sorted-array-ii

package com.nitin;

public class SearchInRotated2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 2};
        int target = 0;
        System.out.println(search(arr, target));
    }

    static boolean search(int[] nums, int target) {
        // brute force -> time complexity = O(n)
        int i = 0;
        if (nums.length == 1 && nums[i] == target) {
            return true;
        }
        while (i < nums.length) {
            if (nums[i] == target) {
                return true;
            }
            i++;
        }
        return false;
    }
}
