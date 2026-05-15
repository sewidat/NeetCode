package org.example.dp1d;

import java.util.Arrays;

/**
 * ============================================================
 * LeetCode #300 - Longest Increasing Subsequence
 * Difficulty: Medium
 * Category: 1-D Dynamic Programming
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an integer array nums, return the length of the longest strictly
 * increasing subsequence. A subsequence is derived from the array by
 * deleting some (or none) elements without changing the order of the
 * remaining elements.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= nums.length <= 2500
 * -10^4 <= nums[i] <= 10^4
 *
 * EXAMPLES
 * --------
 * nums = [10,9,2,5,3,7,101,18] → 4   (e.g. 2,3,7,101)
 * nums = [0,1,0,3,2,3]         → 4
 * nums = [7,7,7,7,7,7,7]       → 1
 *
 * INTUITION & APPROACH
 * --------------------
 * Approach 1 — O(n²) DP:
 *   dp[i] = length of LIS ending at index i.
 *   For each i, scan all j < i: if nums[j] < nums[i], dp[i] = max(dp[i], dp[j]+1).
 *   Base: dp[i] = 1 (every element alone is a valid subsequence).
 *   Answer: max(dp).
 *
 * Approach 2 — O(n log n) Patience Sorting:
 *   Maintain a "tails" array where tails[k] is the smallest tail element
 *   of all increasing subsequences of length k+1.
 *   For each num:
 *     Binary search tails for the first element >= num (lower_bound).
 *     If found at position pos, replace tails[pos] = num.
 *     If not found, append num to tails (extends longest LIS).
 *   Length of tails at end is the answer.
 *
 * KEY CONCEPTS
 * ------------
 * - dp[i] = length of LIS ending at index i (O(n²) approach)
 * - Patience sort with binary search on tails array (O(n log n) approach)
 * - tails[k] = smallest possible tail of LIS of length k+1
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n log n)
 * Space: O(n)
 * ============================================================
 */
public class P300LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P300LongestIncreasingSubsequence sol = new P300LongestIncreasingSubsequence();
        System.out.println(sol.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18})); // 4
        System.out.println(sol.lengthOfLIS(new int[]{7, 7, 7, 7, 7, 7, 7}));         // 1
    }
}
