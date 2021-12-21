package com.dynamicprogramming.threesumclosest;
import java.util.*;
/**
 *
 * author:carl.white
 *
 * Problem Desciption
 * Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
 *
 * Return the sum of the three integers.
 *
 * You may assume that each input would have exactly one solution.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-1,2,1,-4], target = 1
 * Output: 2
 * Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * Example 2:
 *
 * Input: nums = [0,0,0], target = 1
 * Output: 0
 *
 *
 * Constraints:
 *
 * 3 <= nums.length <= 1000
 * -1000 <= nums[i] <= 1000
 * -104 <= target <= 104
 *
 */

public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            twoSumClosest(nums[i], i, nums, target, map);
        }
        int m = 0;
        while(m < 1000){
            if(map.containsKey(m)){
                return map.get(m);
            }
            m++;
        }
        return 0;
    }

    private void twoSumClosest(int nums_i, int pos_i, int[] nums, int target, Map<Integer, Integer> map){
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            if(left == pos_i){
                left++;
            } else if(right == pos_i){
                right--;
            } else if(nums_i + nums[left] + nums[right] == target){
                map.put(0, nums_i + nums[left] + nums[right]);
                left++;
            } else if(nums_i + nums[left] + nums[right] < target){
                int diff = target - (nums_i + nums[left] + nums[right]);
                if(!map.containsKey(diff)){
                    map.put(diff, nums_i + nums[left] + nums[right]);
                }
                left++;
            } else{
                int diff = (nums_i + nums[left] + nums[right]) - target;
                if(!map.containsKey(diff)){
                    map.put(diff, nums_i + nums[left] + nums[right]);
                }
                right--;
            }
        }
    }
}