package com.dynamicprogramming.countingbits;
/**
 *
 * author: carl.white
 *
 * Problem Description:
 * Given an integer n, return an array ans of length n + 1 such that
 * for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
 *
 * Example 1:
 * Input: n = 2
 * Output: [0,1,1]
 * Explanation:
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 *
 * Example 2:
 * Input: n = 5
 * Output: [0,1,1,2,1,2]
 * Explanation:
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 * 3 --> 11
 * 4 --> 100
 * 5 --> 101
 *
 * Constraints:
 * 0 <= n <= 105
 */

public class CountingBits {

    public int[] countBits(int n) {
        int count = 0;
        int binary = 0;
        int[] arr = new int[n+1];
        while(0 <= n){
            if(binary == 0){
                arr[count] = binary;
            } else{
                String b = binaryNum(binary);
                arr[count] = b.length() - b.replace("1", "").length();
            }
            binary+=1;
            count++;
            n-=1;
        }
        return arr;
    }

    private String binaryNum(int binary){
        String bin = Integer.toBinaryString(binary);
        return bin;
    }
}