// Ques type: Easy
// 268. Missing Number
// Link : https://leetcode.com/problems/missing-number/

package com.nitin;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(missing(arr));
    }

     static int missing(int[] arr) {
        int n = arr.length, ans = 0, z = 0;
        int sum = n * (n + 1) / 2;

        for (int i : arr) {
            z += i;
        }
        ans = sum - z;
        return  ans;
    }

    // static int missing(int[] arr) {
    //     int i = 0;

    //     while (i < arr.length) {
    //         int correct = arr[i];

    //         if (arr[i] < arr.length && arr[i] != arr[correct]) {
    //             swap(arr, i, correct);
    //         } else {
    //             i++;
    //         }
    //     }
    //     for (int index = 0; index < arr.length; index++) {
    //         if (arr[index] != index) {
    //             return index;
    //         }
    //     }
    //     return arr.length;
    // }

    // static void swap(int[] arr, int first, int second) {
    //     int temp = arr[first];
    //     arr[first] = arr[second];
    //     arr[second] = temp;
    // }
}