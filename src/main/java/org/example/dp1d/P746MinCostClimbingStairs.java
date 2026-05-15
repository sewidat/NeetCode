package org.example.dp1d;

/**
 * ============================================================
 * LeetCode #746 - Min Cost Climbing Stairs
 * Difficulty: Easy
 * Category: 1-D Dynamic Programming
 * ============================================================
 *
 * PROBLEM
 * -------
 * You are given an integer array cost where cost[i] is the cost
 * of the i-th step on a staircase. Once you pay the cost, you can
 * either climb one or two steps. You can either start from the step
 * with index 0 or the step with index 1. Return the minimum cost
 * to reach the top of the floor (beyond the last index).
 *
 * CONSTRAINTS
 * -----------
 * 2 <= cost.length <= 1000
 * 0 <= cost[i] <= 999
 *
 * EXAMPLES
 * --------
 * cost = [10, 15, 20]                          → 15
 * cost = [1,100,1,1,1,100,1,1,100,1]           → 6
 *
 * INTUITION & APPROACH
 * --------------------
 * Define dp[i] = minimum cost to reach step i (0-indexed).
 * To arrive at step i, we either stepped from i-1 or i-2,
 * each time paying that step's cost:
 *
 *   dp[i] = cost[i] + min(dp[i-1], dp[i-2])
 *
 * Base cases: dp[0] = cost[0], dp[1] = cost[1].
 * The "top" is one step beyond the last stair, so the answer
 * is min(dp[n-1], dp[n-2]) — we can jump from either of the
 * last two stairs to clear the staircase.
 * Space-optimize to O(1) using two rolling variables.
 *
 * KEY CONCEPTS
 * ------------
 * - Bottom-up DP
 * - Recurrence: dp[i] = cost[i] + min(dp[i-1], dp[i-2])
 * - Answer: min of the last two dp values
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n)
 * Space: O(1)
 * ============================================================
 */
public class P746MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P746MinCostClimbingStairs sol = new P746MinCostClimbingStairs();
        System.out.println(sol.minCostClimbingStairs(new int[]{10, 15, 20})); // 15
        System.out.println(sol.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1})); // 6
    }
}
