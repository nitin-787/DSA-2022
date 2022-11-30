// Ques type: Medium
// 50. Pow(x, n)
// Link - https://leetcode.com/problems/powx-n/

package com.nitin;

class Power {
    public static void main(String[] args) {
        System.out.println(myPow(2, 4));
    }
    static double myPow(double x, int n) {
         if (n == 0) return 1.0;
        else if (n % 2 == 1) return x * myPow(x, n - 1);
        else if (n % 2 == 0) return myPow(x * x, n / 2);
        else return 1 / myPow(x, -n);
    }
}