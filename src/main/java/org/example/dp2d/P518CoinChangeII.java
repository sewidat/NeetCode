package org.example.dp2d;

/**
 * ============================================================
 * LeetCode #518 - Coin Change II
 * Difficulty: Medium
 * Category: 2-D Dynamic Programming
 * ============================================================
 *
 * PROBLEM
 * -------
 * You are given an integer array coins representing coins of different
 * denominations and an integer amount representing a total amount of money.
 * Return the number of combinations that make up that amount. If that
 * amount cannot be made up by any combination of the coins, return 0.
 * Each coin may be used an unlimited number of times. The order of coins
 * does NOT matter (combinations, not permutations).
 *
 * CONSTRAINTS
 * -----------
 * 1 <= coins.length <= 300
 * 1 <= coins[i] <= 5000
 * All values of coins are unique.
 * 0 <= amount <= 5000
 *
 * EXAMPLES
 * --------
 * amount = 5,  coins = [1, 2, 5] → 4   ({5}, {2,2,1}, {2,1,1,1}, {1,1,1,1,1})
 * amount = 3,  coins = [2]       → 0
 * amount = 10, coins = [10]      → 1
 *
 * INTUITION & APPROACH
 * --------------------
 * Define dp[a] = number of combinations that sum to amount a.
 * Base: dp[0] = 1 (one way to reach 0: use no coins).
 *
 * For each coin (outer loop), update all reachable amounts (inner loop):
 *   For each amount a from coin to amount:
 *     dp[a] += dp[a - coin]
 *
 * CRITICAL: Iterating coins in the outer loop and amounts in the inner
 * loop ensures we count COMBINATIONS (each coin used in any quantity,
 * but the set is unordered). If we swapped loops (amounts outer, coins
 * inner) we would count PERMUTATIONS instead.
 *
 * This is the unbounded knapsack "combination" pattern.
 *
 * KEY CONCEPTS
 * ------------
 * - Unbounded knapsack — each coin can be used unlimited times
 * - Outer loop over coins avoids permutation double-counting
 * - Recurrence: dp[a] += dp[a - coin] for each coin, forward iteration
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(amount * coins.length)
 * Space: O(amount)
 * ============================================================
 */
public class P518CoinChangeII {
    public int change(int amount, int[] coins) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P518CoinChangeII sol = new P518CoinChangeII();
        System.out.println(sol.change(5, new int[]{1, 2, 5})); // 4
        System.out.println(sol.change(3, new int[]{2}));        // 0
        System.out.println(sol.change(10, new int[]{10}));      // 1
    }
}
