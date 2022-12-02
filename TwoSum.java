// Ques type: Easy
// 1. Two Sum
// Link : https://leetcode.com/problems/two-sum

package com.nitin;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;
//        int[] arr = {2,5,5,11};
//        int target = 10;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    static int[] twoSum(int[] arr, int target) {
        int i = 0, j = i + 1;

        while (i < arr.length - 1) {
            if (arr[i] + arr[j] == target) {
                return new int[]{i, j};
            } else {
                j++;
            }
            if (j == arr.length) {
                i++;
                j = i+1;
            }
        }
        return new int[]{-1, -1};
    }
}
