// Ques type : Medium
// 153. Find Minimum in Rotated Sorted Array
// Link : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

package com.nitin;

public class MinimumInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,6,3,2,0};
       System.out.println(minimum(arr));
    }

   static int minimum(int[] arr) {
       int start = 0;
       int end = arr.length - 1;

       while (start < end) {
           if (arr[start] > arr[end]) {
               start++;
           } else {
               return start;
           }
       }
       return arr[start];
   }
}