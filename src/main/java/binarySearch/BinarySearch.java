package binarySearch;

/**
 * Link: https://leetcode.com/problems/binary-search/
 *
 * Problem Description:
 * Given an array of integers `nums` which is sorted in ascending order,
 * and an integer `target`, write a function to search `target` in `nums`.
 * If `target` exists, then return its index. Otherwise, return -1.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4.
 *
 * Example 2:
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1.
 *
 * Constraints:
 * - 1 <= nums.length <= 10^4
 * - -10^4 <= nums[i], target <= 10^4
 * - All the integers in `nums` are unique.
 * - `nums` is sorted in ascending order.
 */
class BinarySearch {

    int search(int[] nums, int target) {
        int mid = (nums.length - 1) /2;

        if (nums.length == 0) return -1;

        if (nums[0] == target) return 0;
        if (nums[nums.length - 1] == target) return nums.length - 1;
        if(nums[mid] == target) return mid;

        if (nums.length > 3) {
            if (nums[mid] < target) {
                int searchResult = search(createNewArray(nums, mid + 1, nums.length - 1), target);
                if (searchResult >= 0) return mid + 1 + searchResult;
            } else {
                int searchResult = search(createNewArray(nums, 0, mid), target);
                if (searchResult >= 0) return searchResult;
            }
        }
        return -1;
    }

    int[] createNewArray(int[] original, int begin, int end) {
        int arraySize = end - begin + 1;
        int[] newArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            newArray[i] = original[begin + i];
        }
        return newArray;
    }
}

