package com.dynamicprogramming.threesum;
import java.util.*;
/**
 *
 * author: carl.white
 *
 * Problem Description:
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * Notice that the solution set must not contain duplicate triplets.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Example 2:
 *
 * Input: nums = []
 * Output: []
 * Example 3:
 *
 * Input: nums = [0]
 * Output: []
 *
 *
 * Constraints:
 *
 * 0 <= nums.length <= 3000
 * -105 <= nums[i] <= 105
 *
 */

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length <= 0) {
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> nList = new ArrayList<>();
        HashMap<List<Integer>, Boolean> map = new HashMap<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            twoSum(nums[i], i, nums, map);
        }
        for (List<Integer> l : map.keySet()) {
            nList.add(l);
        }
        return nList;
    }

    private HashMap<List<Integer>, Boolean> twoSum(int num_i, int pos_i, int[] nums, HashMap<List<Integer>, Boolean> map) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (left == pos_i) {
                left++;
                continue;
            }
            if (right == pos_i) {
                right--;
                continue;
            }
            if (num_i + nums[left] + nums[right] == 0) {
                List<Integer> twoSum = new ArrayList<>();
                twoSum.add(num_i);
                twoSum.add(nums[left]);
                twoSum.add(nums[right]);
                Collections.sort(twoSum);
                if (!map.containsKey(twoSum)) {
                    map.put(twoSum, true);
                }
                left++;
            } else if (num_i + nums[left] + nums[right] < 0) {
                left++;
            } else {
                right--;
            }
        }
        return map;
    }
}