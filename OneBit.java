// Ques type: Easy
// 191. Number of 1 Bits
// Link - https://leetcode.com/problems/number-of-1-bits/

package com.nitin;

public class Solution {
    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000001011));
    }

    // you need to treat n as an unsigned value
    static int hammingWeight(int n) {
        int count = 0;
        for (int i = 1; i <= 32; i++) {
            if (((n >> i) & 1) == 1) {
                count++;
            }
        }
        return count;
    }
}