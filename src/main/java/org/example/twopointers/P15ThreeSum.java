package org.example.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ============================================================
 * LeetCode #15 - 3Sum
 * Difficulty: Medium
 * Category: Two Pointers
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an integer array nums, return all unique triplets [nums[i], nums[j], nums[k]]
 * such that i, j, and k are distinct indices and nums[i] + nums[j] + nums[k] == 0.
 * The solution set must not contain duplicate triplets.
 *
 * CONSTRAINTS
 * -----------
 * - 3 <= nums.length <= 3000
 * - -10^5 <= nums[i] <= 10^5
 * - Duplicate triplets are not allowed in the output
 *
 * EXAMPLES
 * --------
 * Input: nums = [-1,0,1,2,-1,-4]  → Output: [[-1,-1,2],[-1,0,1]]
 * Input: nums = [0,1,1]            → Output: []
 *
 * INTUITION & APPROACH
 * --------------------
 * Sort the array first — this enables two-pointer and easy duplicate skipping.
 * For each index i (the fixed first element), use two pointers left=i+1 and
 * right=n-1 to find pairs summing to -nums[i]. If sum < 0, move left right;
 * if sum > 0, move right left; if sum == 0, record the triplet and advance
 * both pointers while skipping duplicates. Skip duplicate values of nums[i]
 * (when i > 0 and nums[i] == nums[i-1]) to avoid duplicate triplets. O(n²) overall.
 *
 * KEY CONCEPTS
 * ------------
 * - Sort + two pointers: enables O(n²) solution with O(1) extra space
 * - Duplicate skipping: advance past equal elements at each level
 * - Reduce to Two Sum II after fixing the first element
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n²) — O(n log n) sort + O(n) outer loop * O(n) two-pointer inner
 * Space: O(1) extra — output list not counted; sort is in-place
 * ============================================================
 */
public class P15ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        // TODO: implement
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        P15ThreeSum sol = new P15ThreeSum();
        // Example 1: expected [[-1,-1,2],[-1,0,1]]
        // System.out.println(sol.threeSum(new int[]{-1,0,1,2,-1,-4}));
        // Example 2: expected []
        // System.out.println(sol.threeSum(new int[]{0,1,1}));
        System.out.println("P15ThreeSum — uncomment examples above to test.");
    }
}
