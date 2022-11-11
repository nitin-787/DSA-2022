// Ques type : Easy
// Ques : Palindrome Number
// Link : https://leetcode.com/problems/palindrome-number/

package com.nitin;

public class Plaindrome {
    public static void main(String[] args) {
        int num = 101;
        System.out.println(Palindrome(num));
    }

    static boolean Palindrome(int num) {
        if (num < 0) {
            return false;
        }
        int x = num;
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum = sum * 10 + rem;
            num = num/10;
        }
        return x == sum;
    }
}