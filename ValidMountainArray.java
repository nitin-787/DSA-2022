// Ques type: Easy
// 941. Valid Mountain Array
// Link - https://leetcode.com/problems/valid-mountain-array/

package com.nitin;

public class ValidMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,3,2};
        int[] arr1 = {2,0,2};
        int[] arr2 = {1,3,4,6,7,5,3,2,0};
        int[] arr3 = {0,1,2,3,4,5,6,7,8,9}; // need to be fixed returning true expected false
        System.out.println(valid(arr));
        System.out.println(valid(arr1));
        System.out.println(valid(arr2));
        System.out.println(valid(arr3));
    }

    static boolean valid(int[] arr) {
        with this solution we can find the peak index as well just return arr[start] or arr[end] yo
       int start = 0;
       int end = arr.length-1;

       while (start < end) {
           if (arr[start + 1] > arr[start]) {
               start++;
           } else if (arr[end - 1] > arr[end]) {
               end--;
           } else {
               break;
           }
       }
       return start !=0 && end != arr.length -1 && start == end;
    }
}