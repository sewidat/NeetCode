package org.example.dp1d;

/**
 * ============================================================
 * LeetCode #213 - House Robber II
 * Difficulty: Medium
 * Category: 1-D Dynamic Programming
 * ============================================================
 *
 * PROBLEM
 * -------
 * All houses are arranged in a circle — the first and last houses are
 * adjacent. You cannot rob two adjacent houses. Given an integer array
 * nums representing the amount of money at each house, return the maximum
 * amount you can rob without alerting the police.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 1000
 *
 * EXAMPLES
 * --------
 * nums = [2, 3, 2]    → 3   (can't rob house 1 and 3)
 * nums = [1, 2, 3, 1] → 4
 * nums = [1, 2, 3]    → 3
 *
 * INTUITION & APPROACH
 * --------------------
 * Because house 0 and house n-1 are adjacent we can never rob both.
 * Split the problem into two independent linear House Robber problems:
 *
 *   Case A: Consider houses [0 .. n-2] (exclude last house)
 *   Case B: Consider houses [1 .. n-1] (exclude first house)
 *
 * Apply the standard House Robber recurrence on each range:
 *
 *   dp[i] = max(dp[i-1], dp[i-2] + nums[i])
 *
 * Return max(resultA, resultB). Handle the edge case n == 1 separately
 * (return nums[0]).
 *
 * KEY CONCEPTS
 * ------------
 * - Reduce circular constraint to two linear sub-problems
 * - Run House Robber (#198) twice on different index ranges
 * - Recurrence: dp[i] = max(dp[i-1], dp[i-2] + nums[i])
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n)
 * Space: O(1)
 * ============================================================
 */
public class P213HouseRobberII {
    public int rob(int[] nums) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P213HouseRobberII sol = new P213HouseRobberII();
        System.out.println(sol.rob(new int[]{2, 3, 2}));    // 3
        System.out.println(sol.rob(new int[]{1, 2, 3, 1})); // 4
        System.out.println(sol.rob(new int[]{1, 2, 3}));    // 3
    }
}
