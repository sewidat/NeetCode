package org.example.arrays;

import java.util.Arrays;

/**
 * ============================================================
 * LeetCode #238 - Product of Array Except Self
 * Difficulty: Medium
 * Category: Arrays & Hashing
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an integer array nums, return an array answer such that answer[i]
 * is equal to the product of all elements of nums except nums[i]. You must
 * solve it in O(n) time without using the division operation.
 *
 * CONSTRAINTS
 * -----------
 * - 2 <= nums.length <= 10^5
 * - -30 <= nums[i] <= 30
 * - The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer
 *
 * EXAMPLES
 * --------
 * Input: nums = [1,2,3,4]      → Output: [24,12,8,6]
 * Input: nums = [-1,1,0,-3,3]  → Output: [0,0,9,0,0]
 *
 * INTUITION & APPROACH
 * --------------------
 * Division is disallowed (and problematic with zeros). Instead, observe that
 * answer[i] = (product of all elements to the LEFT of i) * (product of all elements
 * to the RIGHT of i). First pass (left to right): fill the output array with prefix
 * products so output[i] = product of nums[0..i-1]. Second pass (right to left):
 * maintain a running suffix product and multiply it into output[i]. This achieves
 * O(1) extra space (the output array itself is not counted as extra space).
 *
 * KEY CONCEPTS
 * ------------
 * - Prefix product array: output[i] = product of all elements before index i
 * - Suffix product running variable: avoids a second auxiliary array
 * - Two-pass algorithm: left pass then right pass, both O(n)
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n) — two linear passes over the array
 * Space: O(1) extra — only the output array is used (not counted per problem rules)
 * ============================================================
 */
public class P238ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        // TODO: implement
        return new int[]{};
    }

    public static void main(String[] args) {
        P238ProductOfArrayExceptSelf sol = new P238ProductOfArrayExceptSelf();
        // Example 1: expected [24, 12, 8, 6]
        // System.out.println(Arrays.toString(sol.productExceptSelf(new int[]{1,2,3,4})));
        // Example 2: expected [0, 0, 9, 0, 0]
        // System.out.println(Arrays.toString(sol.productExceptSelf(new int[]{-1,1,0,-3,3})));
        System.out.println("P238ProductOfArrayExceptSelf — uncomment examples above to test.");
    }
}
