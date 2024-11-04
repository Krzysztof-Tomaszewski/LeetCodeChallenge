package threeSum;

// https://leetcode.com/problems/3sum/
// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
// such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
// Notice that the solution set must not contain duplicate triplets.

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) return Collections.emptyList();

        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            //var selectedNumber = nums[i];
            //var targetNumber = -nums[i];

            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if (i != j && j != k && i != k) {
                            if (nums[j] + nums[k] + nums[i] == 0) {
                                result.add(Stream.of(nums[i], nums[j], nums[k]).sorted(Integer::compareTo).toList());
                            }
                    }
                }
            }
        }
        return result.stream().toList();
    }
}

