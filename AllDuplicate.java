// Ques type: Medium
// Ques 442: Find All Duplicates in an Array
// Link : https://leetcode.com/problems/find-all-duplicates-in-an-array/ 

package com.nitin;

import java.util.*;

public class AllDuplicate {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1,1};

        ArrayList<Integer> list = new ArrayList<>(100);
        System.out.println(findDuplicate(nums));
    }

    public static List<Integer> findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
               i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(nums[index]);
            }
        }
        return ans;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}