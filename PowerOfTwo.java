// Ques type : Easy
// 231. Power of Two
// Link : https://leetcode.com/problems/power-of-two/

package com.nitin;

public class PowerofTwo {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(isPowerOfTwo(n));
    }

    static boolean isPowerOfTwo(int n) {
        boolean ans = n > 0 && (n & (n - 1)) == 0;
        return ans;
    }
}