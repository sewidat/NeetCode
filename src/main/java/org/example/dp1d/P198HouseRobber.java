package org.example.dp1d;

/**
 * ============================================================
 * LeetCode #198 - House Robber
 * Difficulty: Medium
 * Category: 1-D Dynamic Programming
 * ============================================================
 *
 * PROBLEM
 * -------
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed. Adjacent houses have
 * a security system connected — if two adjacent houses are robbed the
 * alarm will trigger. Given an integer array nums representing the amount
 * of money of each house, return the maximum amount of money you can rob
 * without alerting the police.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 400
 *
 * EXAMPLES
 * --------
 * nums = [1, 2, 3, 1]    → 4   (rob house 1 and 3: 1 + 3 = 4)
 * nums = [2, 7, 9, 3, 1] → 12  (rob house 1, 3, 5: 2 + 9 + 1 = 12)
 *
 * INTUITION & APPROACH
 * --------------------
 * Define dp[i] = maximum money robbed considering houses 0 through i.
 * At house i we have two choices:
 *   1. Skip house i: best is dp[i-1]
 *   2. Rob house i: best is dp[i-2] + nums[i] (can't rob i-1)
 *
 *   dp[i] = max(dp[i-1], dp[i-2] + nums[i])
 *
 * Base cases: dp[0] = nums[0], dp[1] = max(nums[0], nums[1]).
 * Space-optimize using two rolling variables (prev1, prev2)
 * instead of the full array, achieving O(1) space.
 *
 * KEY CONCEPTS
 * ------------
 * - Recurrence: dp[i] = max(skip = dp[i-1], rob = dp[i-2] + nums[i])
 * - Space optimization: two rolling variables
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n)
 * Space: O(1)
 * ============================================================
 */
public class P198HouseRobber {
    public int rob(int[] nums) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P198HouseRobber sol = new P198HouseRobber();
        System.out.println(sol.rob(new int[]{2, 7, 9, 3, 1})); // 12
        System.out.println(sol.rob(new int[]{1, 2, 3, 1}));    // 4
    }
}
