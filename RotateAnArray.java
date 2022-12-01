// Ques type: Medium
// 189. Rotate Array
// Link - https://leetcode.com/problems/rotate-array/

package com.nitin;

class RotateAnArray {
    public static void main(String[] args) {
        int[]  arr = {2,4,5, 6,12, 14, 17, 21, 43, 67, 89};
        int k = 3;
        rotate(arr, k);
    }
    static void rotate(int[] nums, int k) {
         k = k % nums.length; // for length of array is less to k
        if(k < 0){ // for -ve value
            k += nums.length;
        }
        
         //complete rotate array
        rev(nums, 0, nums.length - 1);

        //K part reversal
        rev(nums, 0, k-1);

        //Non K part reversal
        rev(nums, k, nums.length -1);
    }

    private static void rev(int[] arr, int i, int j){
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}