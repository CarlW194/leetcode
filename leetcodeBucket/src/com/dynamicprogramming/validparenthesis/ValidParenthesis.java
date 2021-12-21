package com.dynamicprogramming.validparenthesis;
import java.util.*;
/**
 *
 * author: carl.white
 *
 * Problem Desciption:
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 *
 *
 * Example 1:
 *
 * Input: s = "()"
 * Output: true
 * Example 2:
 *
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: s = "(]"
 * Output: false
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 *
 */

public class ValidParenthesis {
    public boolean isValid(String s) {
        Map<Character, Character> map = Map.of('(', ')', '[',']', '{', '}');
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char open = stack.pop();
                if(map.get(open) != c){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}