package org.example.dp1d;

/**
 * ============================================================
 * LeetCode #70 - Climbing Stairs
 * Difficulty: Easy
 * Category: 1-D Dynamic Programming
 * ============================================================
 *
 * PROBLEM
 * -------
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct
 * ways can you climb to the top?
 *
 * CONSTRAINTS
 * -----------
 * 1 <= n <= 45
 *
 * EXAMPLES
 * --------
 * n = 2 → 2   (1+1, 2)
 * n = 3 → 3   (1+1+1, 1+2, 2+1)
 *
 * INTUITION & APPROACH
 * --------------------
 * Define dp[i] = number of distinct ways to reach step i.
 * At each step i, we arrived either from step i-1 (took 1 step)
 * or from step i-2 (took 2 steps). Therefore:
 *
 *   dp[i] = dp[i-1] + dp[i-2]
 *
 * Base cases: dp[1] = 1, dp[2] = 2.
 * This is exactly the Fibonacci sequence.
 * Space-optimize by keeping only two variables (prev1, prev2)
 * instead of the full dp array.
 *
 * KEY CONCEPTS
 * ------------
 * - Fibonacci-style DP
 * - Recurrence: dp[i] = dp[i-1] + dp[i-2]
 * - Space optimization: O(1) with two rolling variables
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n)
 * Space: O(1)
 * ============================================================
 */
public class P70ClimbingStairs {
    public int climbStairs(int n) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P70ClimbingStairs sol = new P70ClimbingStairs();
        System.out.println(sol.climbStairs(3)); // 3
        System.out.println(sol.climbStairs(5)); // 8
    }
}
