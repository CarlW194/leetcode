package com.hashmaps.lettercombophonenum;
import java.util.*;
/**
 *
 * author: carl.white
 *
 * Problem Description:
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
 *
 * A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 *
 * Example 1:
 *
 * Input: digits = "23"
 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * Example 2:
 *
 * Input: digits = ""
 * Output: []
 * Example 3:
 *
 * Input: digits = "2"
 * Output: ["a","b","c"]
 *
 *
 * Constraints:
 *
 * 0 <= digits.length <= 4
 * digits[i] is a digit in the range ['2', '9'].
 */

public class LetterComboPhoneNumber {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return new ArrayList<>();
        }
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> nl = new ArrayList<>();
        for(int i=0;i<digits.length();i++){
            nl.add(map.get(digits.charAt(i)));
        }

        List<String> result = new ArrayList<>();
        for(String s: nl){
            if(result.isEmpty()){
                int c1 = 0;
                while(c1 < s.length()){
                    result.add("" + s.charAt(c1));
                    c1++;
                }
            } else{
                List<String> temp = new ArrayList<>();
                for(String t: result){
                    int c1 = 0;
                    while(c1 < s.length()){
                        temp.add(t + s.charAt(c1));
                        c1++;
                    }
                }
                result = temp;
            }
        }


        return result;
    }
}