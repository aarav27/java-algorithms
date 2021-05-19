package org.sharma.aarav.java.algorithms.arrays;

//12. Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
// (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
// Given a target value to search. If found in the array return its index, otherwise return -1.
// Assume no duplicate exists in the array.

/**
 * @author Aarav Sharma
 */
public class SortedRotated {

    public Integer search(int[] nums, int target) {
        if(nums == null) return null;

        int minIdx = findMinIdx(nums);
        if (target == nums[minIdx]) return minIdx;
        int len = nums.length;
        int start = (target <= nums[len - 1]) ? minIdx : 0;
        int end = (target > nums[len - 1]) ? minIdx : len - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            else if (target > nums[mid]) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }

    private int findMinIdx(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = start + (end -  start) / 2;
            if (nums[mid] > nums[end]) start = mid + 1;
            else end = mid;
        }
        return start;
    }
}
