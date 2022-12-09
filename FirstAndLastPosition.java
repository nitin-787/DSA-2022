// Ques type : Medium
// 34: Find First and Last Position of Element in Sorted Array
// Link : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

package com.nitin;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {7};
        int target = 7;
        System.out.println(Arrays.toString(search(nums, target)));
    }

//    // time complexity o(n) will try to improve it tomorrow
//   static int[] search(int[] nums, int target) {
//        int[] arr = {-1, -1};
//        int end = nums.length - 1, i = 0;
//        if (end < 0 ) {
//            return new int[] {-1, -1};
//        }
//        if (nums[i] == target && nums[end] == target) {
//            arr[0] = i;
//            arr[1] = end;
//            return arr;
//        }
//       for (i = 0; i <= end; i++) {
//           if (nums[i] == target) {
//               arr[0] = i;
//               break;
//           }
//       }
//       for (i = end; i >= 0; i--) {
//           if (nums[i] == target) {
//               arr[1] = i;
//               break;
//           }
//       }
//       return arr;
//    }


    // time complexity is O(log n)
    static int[] search(int[] nums, int target) {
        // Use a modified binary search to find the first and last indices
        // of the target element in the array
        int start = 0, end = nums.length - 1;
        int firstIndex = -1, lastIndex = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                firstIndex = mid;
                lastIndex = mid;
                while (firstIndex > 0 && nums[firstIndex - 1] == target) {
                    firstIndex--;
                }
                while (lastIndex < nums.length - 1 && nums[lastIndex + 1] == target) {
                    lastIndex++;
                }
                break;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // Return the range of indices where the target element was found
        return new int[] { firstIndex, lastIndex };
    }
}