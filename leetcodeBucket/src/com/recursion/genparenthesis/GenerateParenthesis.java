package com.recursion.genparenthesis;
import java.util.*;
/**
 *
 * author: carl.white
 *
 * Problem Description:
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 * Example 2:
 *
 * Input: n = 1
 * Output: ["()"]
 *
 *
 * Constraints:
 *
 * 1 <= n <= 8
 *
 */

public class GenerateParenthesis {

    public List<String> generateParenthesis(int n) {
        List<String> s = new ArrayList<>();
        backTracking(0,0,n,new StringBuilder(), s);
        return s;
    }

    private void backTracking(int open, int close, int n, StringBuilder total, List<String> s){
        if(open == close && open == n){
            s.add(total.toString());
        }
        if(open < n){
            total.append("(");
            backTracking(open+1, close, n, total, s);
            total.deleteCharAt(total.length()-1);
        }
        if(close < open){
            total.append(")");
            backTracking(open, close+1, n, total, s);
            total.deleteCharAt(total.length()-1);
        }
    }
}