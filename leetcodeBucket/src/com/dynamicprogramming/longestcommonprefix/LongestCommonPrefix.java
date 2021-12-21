package com.dynamicprogramming.longestcommonprefix;
/**
 *
 * author: carl.white
 *
 * Problem Description:
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 *
 * Constraints:
 *
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lower-case English letters.
 *
 */

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0];
        }
        String initial = strs[0];
        String longest = "";
        boolean addPrefix = false;
        int l = 0;
        for(int i=0; i < initial.length(); i++){
            for(int j=1; j < strs.length; j++){
                if(strs[j].length() <= i){
                    addPrefix = false;
                    break;
                }
                if(initial.charAt(i) == strs[j].charAt(i)){
                    addPrefix = true;
                } else{
                    addPrefix = false;
                    break;
                }
            }
            if(addPrefix){
                longest += initial.charAt(i);
                addPrefix = false;
            }else{
                break;
            }
        }
        return longest;
    }
}