package com.dynamicprogramming.pascalstriangle;
import java.util.*;
/**
 * author: carl.white
 *
 * Problem Description:
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 *
 * Example 1:
 *
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 *
 *
 * Example 2:
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 *
 * Constraints:
 * 1 <= numRows <= 30
 *
 *
 * Runtime: 1 ms
 * Memory Usage: 38.1 MB
 */


public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listOfLists = new ArrayList<>();
        int n=0;
        while(n < numRows){
            if(n == 0){
                List<Integer> l = new ArrayList<>();
                l.add(1);
                listOfLists.add(l);
            } else if(n == 1){
                List<Integer> l = new ArrayList<>();
                l.add(1);
                l.add(1);
                listOfLists.add(l);
            } else{
                List<Integer> previous = listOfLists.get(listOfLists.size() - 1);
                List<Integer> l = addPascalsTriangle(previous);
                listOfLists.add(l);
            }
            n++;
        }
        return listOfLists;
    }

    private List<Integer> addPascalsTriangle(List<Integer> prev){
        List<Integer> singleList = new ArrayList<>();
        singleList.add(1);
        int total = 0;
        int counter = 0;
        while(counter < prev.size()){
            if(counter == 0){
                total += prev.get(counter);
            } else{
                total += prev.get(counter);
                singleList.add(total);
                total = prev.get(counter);
            }
            counter++;
        }
        singleList.add(1);
        return singleList;
    }
}