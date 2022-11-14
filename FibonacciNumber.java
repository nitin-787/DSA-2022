// Ques type : Easy
// Ques 509. Fibonacci Number
// Link - https://leetcode.com/problems/fibonacci-number/

package com.nitin;

public class FibonacciNumber {
    public static void main(String[] args) {
        int ans = fibo(10);
        System.out.println(ans);
    }

    static int fibo(int n){
        // base condition
        if (n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}