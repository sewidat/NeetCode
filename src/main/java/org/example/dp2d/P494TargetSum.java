package org.example.dp2d;

/**
 * ============================================================
 * LeetCode #494 - Target Sum
 * Difficulty: Medium
 * Category: 2-D Dynamic Programming
 * ============================================================
 *
 * PROBLEM
 * -------
 * You are given an integer array nums and an integer target.
 * You want to build an expression out of nums by adding '+' or '-'
 * before each integer in nums and then concatenate all of them.
 * Return the number of different expressions that evaluate to target.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= nums.length <= 20
 * 0 <= nums[i] <= 1000
 * 0 <= sum(nums[i]) <= 1000
 * -1000 <= target <= 1000
 *
 * EXAMPLES
 * --------
 * nums = [1,1,1,1,1], target = 3  → 5
 * nums = [1],         target = 1  → 1
 *
 * INTUITION & APPROACH
 * --------------------
 * Approach 1 — DP on sum (offset map):
 *   Use a Map<Integer, Integer> where key = current reachable sum,
 *   value = number of ways to reach that sum.
 *   Start: {0: 1}. For each num, create a new map and update:
 *     newMap[sum + num] += map[sum]
 *     newMap[sum - num] += map[sum]
 *   Answer: map.getOrDefault(target, 0).
 *
 * Approach 2 — Reduce to 0/1 subset sum:
 *   Let S+ = sum of elements assigned '+', S- = sum assigned '-'.
 *   Then S+ + S- = total and S+ - S- = target.
 *   Solving: S+ = (total + target) / 2.
 *   So: count subsets of nums that sum to (total + target) / 2.
 *   This is a 0/1 knapsack count problem with reverse-iteration DP.
 *
 *   dp[j] = ways to form sum j.
 *   Base: dp[0] = 1.
 *   For each num: iterate j from target down to num: dp[j] += dp[j - num].
 *
 * KEY CONCEPTS
 * ------------
 * - 0/1 knapsack counting variant
 * - Recurrence: dp[j] += dp[j - num], reverse iteration to avoid reuse
 * - Alternative: subset sum reduction — S+ = (total + target) / 2
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n * totalSum)
 * Space: O(totalSum)
 * ============================================================
 */
public class P494TargetSum {
    public int findTargetSumWays(int[] nums, int target) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P494TargetSum sol = new P494TargetSum();
        System.out.println(sol.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3)); // 5
        System.out.println(sol.findTargetSumWays(new int[]{1}, 1));              // 1
    }
}
