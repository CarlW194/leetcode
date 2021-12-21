package com.dynamicprogramming.longestpalindromesubstring;
/**
 *
 * author: carl.white
 *
 * Problem Description:
 *
 * Given a string s, return the longest palindromic substring in s.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * Example 2:
 *
 * Input: s = "cbbd"
 * Output: "bb"
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters.
 */

public class LongestPalindromeSubstring {

    public String longestPalindrome(String s) {
        String longestPalindrome = "";
        for(int i=0;i<s.length();i++){
            String odd = searchPalindrome(s, i, i);
            String even = searchPalindrome(s, i, i+1);
            if(longestPalindrome.length() < odd.length()){
                longestPalindrome = odd;
            }
            if(longestPalindrome.length() < even.length()){
                longestPalindrome = even;
            }
        }
        return longestPalindrome;
    }

    private String searchPalindrome(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1, right);
    }

}