package com.dynamicprogramming.nthtribnum;
/**
 *
 * author: carl.white
 *
 * Problem Description:
 *
 * The Tribonacci sequence Tn is defined as follows:
 *
 * T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
 *
 * Given n, return the value of Tn.
 *
 * Example 1:
 *
 * Input: n = 4
 * Output: 4
 * Explanation:
 * T_3 = 0 + 1 + 1 = 2
 * T_4 = 1 + 1 + 2 = 4
 *
 * Example 2:
 * Input: n = 25
 * Output: 1389537
 *
 *
 * Constraints
 * 0 <= n <= 37
 * The answer is guaranteed to fit within a 32-bit integer, ie. answer <= 2^31 - 1.
 *
 */

public class NthTribNumber {
    public int tribonacci(int n) {
        return trib(n);
    }

    private int trib(int n){
        if(n <= 3){  // seeds
            if(n == 0){
                return 0;
            }
            if(n == 1){
                return 1;
            }
            if(n == 2){
                return 1;
            }
            return 2;
        } else{
            int first = 0;
            int second = 1;
            int third = 1;
            int curr = 0;
            for (int i = 3; i <= n; i++){
                curr = first + second + third;
                first = second;
                second = third;
                third = curr;
            }
            return curr;
        }
    }
}